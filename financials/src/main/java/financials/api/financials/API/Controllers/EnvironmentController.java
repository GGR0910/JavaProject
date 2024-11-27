package financials.api.financials.API.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import financials.api.financials.API.DTO.Environment.CreateSystemDTO;
import financials.api.financials.API.DTO.Environment.DeleteSystemDTO;
import financials.api.financials.API.DTO.Environment.UpdateSystemDTO;
import financials.api.financials.API.Models.SystemUser;
import financials.api.financials.API.Service.Interfaces.IEnvironmentService;
import financials.api.financials.API.Service.Interfaces.ISystemUserService;

import java.util.List;

import org.springframework.http.ResponseEntity;

@RestController
public class EnvironmentController {
    private IEnvironmentService EnvironmentService;
    private ISystemUserService SystemUserService;

    public EnvironmentController(IEnvironmentService environmentService, ISystemUserService systemUserService) {
        EnvironmentService = environmentService;
        SystemUserService = systemUserService;
    }

    @PostMapping("Environment/AddSystem")
    public ResponseEntity<String> addSystem(@RequestBody CreateSystemDTO CreateSystemDTO) {
        SystemUser user = SystemUserService.ValidateApiKey(CreateSystemDTO.getApiKey());
        if(user == null) {
            return ResponseEntity.badRequest().body("Invalid API key");
        }
        else{
            String apiKey = EnvironmentService.AddSystem(CreateSystemDTO,user);
            return ResponseEntity.ok("API key: " + apiKey);
        }
    }

    @PostMapping("Environment/DeleteSystem")
    public ResponseEntity<String> deleteSystem(@RequestBody DeleteSystemDTO DeleteSystemDTO) {
        SystemUser user = SystemUserService.ValidateApiKey(DeleteSystemDTO.getApiKey());
        if(user == null) {
            return ResponseEntity.badRequest().body("Invalid API key");
        }
        else{
            EnvironmentService.DeleteSystem(DeleteSystemDTO.getApiKey(),user);
            return ResponseEntity.ok("System Deleted");
        }
    }

    @GetMapping("Environment/GetSystems")
    public ResponseEntity<String> getSystems(String ApiKey) {
        SystemUser user = SystemUserService.ValidateApiKey(ApiKey);
        if(user == null) {
            return ResponseEntity.badRequest().body("Invalid API key");
        }
        else{
            List <SystemUser> systems = EnvironmentService.GetSystems(user.getEnvironmentId());
            return ResponseEntity.ok("Systems");
        }
    }

    @GetMapping("Environment/GetSystem")
    public ResponseEntity<String> getSystem(String SystemId, String ApiKey) {
        SystemUser user = SystemUserService.ValidateApiKey(ApiKey);
        if(user == null) {
            return ResponseEntity.badRequest().body("Invalid API key");
        }
        else{
            SystemUser system = EnvironmentService.GetSystem(SystemId);
            return ResponseEntity.ok("System");
        }
    }

    @PostMapping("Environment/UpdateSystem")
    public ResponseEntity<String> updateSystem(@RequestBody UpdateSystemDTO UpdateSystemDTO) {
        SystemUser user = SystemUserService.ValidateApiKey(UpdateSystemDTO.getApiKey());
        if(user == null) {
            return ResponseEntity.badRequest().body("Invalid API key");
        }
        else{
            EnvironmentService.UpdateSystem(UpdateSystemDTO,user);
            return ResponseEntity.ok("System Updated");
        }
    }
}
