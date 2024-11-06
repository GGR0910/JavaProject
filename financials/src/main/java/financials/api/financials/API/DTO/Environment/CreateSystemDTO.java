package financials.api.financials.API.DTO.Environment;

import financials.api.financials.API.DTO.BaseRequestDTO;

public class CreateSystemDTO extends BaseRequestDTO {
    private String Name;
    private String ResponsibleEmail;
    private String ResponsibleName;
    private String Sector;
    private String BaseURL;
}
