package financials.api.financials.API.Service.Interfaces;

import financials.api.financials.API.DTO.Environment.CreateSystemDTO;
import financials.api.financials.API.Models.SystemUser;

public interface IEnvironmentService {
    String AddSystem(CreateSystemDTO CreateSystemDTO, SystemUser user);
    void DeleteSystem(String SystemId, SystemUser user);
}
