package financials.api.financials.API.Service.Interfaces;

import financials.api.financials.API.Models.SystemUser;

public interface ISystemUserService {
    SystemUser ValidateApiKey(String apiKey);
}
