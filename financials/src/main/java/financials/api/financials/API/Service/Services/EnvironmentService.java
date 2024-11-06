package financials.api.financials.API.Service.Services;
import java.util.UUID;

import financials.api.financials.API.DTO.Environment.CreateSystemDTO;
import financials.api.financials.API.Models.SystemUser;
import financials.api.financials.API.Service.Interfaces.IEnvironmentService;

public class EnvironmentService implements IEnvironmentService {
    public String AddSystem(CreateSystemDTO CreateSystemDTO, SystemUser user) {
        //Adicionar sistema
        String apiKey = UUID.randomUUID().toString();
        return apiKey;
    }

    public void DeleteSystem(String SystemId, SystemUser user) {
        //Deletar sistema
    }
}
