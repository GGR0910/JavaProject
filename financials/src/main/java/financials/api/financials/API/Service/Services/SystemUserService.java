package financials.api.financials.API.Service.Services;

import org.springframework.beans.factory.annotation.Autowired;

import financials.api.financials.API.Models.SystemUser;
import financials.api.financials.API.Repository.SystemUserRepository;
import financials.api.financials.API.Service.Interfaces.ISystemUserService;

import org.springframework.stereotype.Service;
@Service
public class SystemUserService  implements ISystemUserService{
    
    @Autowired
    private SystemUserRepository SystemUserRepository;

    public SystemUser ValidateApiKey(String apiKey) {
        SystemUser user = null;
        if (apiKey == null || apiKey.isEmpty()) {
            return null;
        }
        user = SystemUserRepository.findById(apiKey).get();
        return user;
    }
}
