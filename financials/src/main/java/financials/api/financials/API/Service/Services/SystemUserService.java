package financials.api.financials.API.Service.Services;

import financials.api.financials.API.Models.SystemUser;
import financials.api.financials.API.Service.Interfaces.ISystemUserService;

public class SystemUserService  implements ISystemUserService{
    
    public SystemUser ValidateApiKey(String apiKey) {
        //Checar se existe systemUser com essa api key
        SystemUser user = null;
        return user;
    }
}
