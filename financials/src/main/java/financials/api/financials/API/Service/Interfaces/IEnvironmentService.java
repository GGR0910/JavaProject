package financials.api.financials.API.Service.Interfaces;

import java.util.List;

import financials.api.financials.API.DTO.Environment.CreateSystemDTO;
import financials.api.financials.API.DTO.Environment.UpdateSystemDTO;
import financials.api.financials.API.Models.SystemUser;

public interface IEnvironmentService {
    SystemUser AddSystem(CreateSystemDTO CreateSystemDTO, SystemUser user);
    void DeleteSystem(String SystemId, SystemUser user);
    SystemUser UpdateSystem(UpdateSystemDTO systemUser, SystemUser user);
    List<SystemUser> GetSystems(String EnvironmentId);
    SystemUser GetSystem(String SystemId);

}
