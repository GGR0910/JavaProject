package financials.api.financials.API.Service.Services;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import financials.api.financials.API.DTO.Environment.CreateSystemDTO;
import financials.api.financials.API.DTO.Environment.UpdateSystemDTO;
import financials.api.financials.API.Models.SystemUser;
import financials.api.financials.API.Repository.EnvironmentRepository;
import financials.api.financials.API.Repository.SystemUserRepository;
import financials.api.financials.API.Service.Interfaces.IEnvironmentService;

import org.springframework.stereotype.Service;
@Service
public class EnvironmentService implements IEnvironmentService {
    
    @Autowired
    private EnvironmentRepository EnvironmentRepository;

    @Autowired
    private SystemUserRepository SystemUserRepository;
    
    public SystemUser AddSystem(CreateSystemDTO CreateSystemDTO, SystemUser user) {
        String apiKey = UUID.randomUUID().toString();
        user.setAPIKey(apiKey); 
        return SystemUserRepository.save(user);
    }

    public void DeleteSystem(String SystemId, SystemUser user) {
        SystemUserRepository.deleteById(SystemId);
    }

    public SystemUser UpdateSystem(UpdateSystemDTO systemUser, SystemUser user) {
        return SystemUserRepository.save(user);
    }

    public List<SystemUser> GetSystems(String EnvironmentId) {
        return SystemUserRepository.findAll();
    }

    public SystemUser GetSystem(String SystemId) {
        return SystemUserRepository.findById(SystemId).get();
    }


}
