package financials.api.financials.API.Controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EnvironmentController {
    
    @GetMapping("/environment/getEnvironment")
    public String getEnvironment(@RequestParam Integer id) {
        return "dev";
    }
}
