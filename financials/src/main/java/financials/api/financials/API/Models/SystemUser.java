package financials.api.financials.API.Models;

public class SystemUser extends BaseEntity{
    private String Name;
    private String ResponsibleEmail;
    private String ResponsibleName;
    private String Sector;
    private String APIKey;
    private String BaseURL;

    private Environment Environment;
    private Role Role;

    public SystemUser(String name, String ResponsibleEmail, String ResponsibleName, String sector, String apiKey, String baseURL, Environment environment, Role role, SystemUser createdBy) {
        super(createdBy);
        this.Name = name;
        this.ResponsibleEmail = ResponsibleEmail;
        this.ResponsibleName = ResponsibleName;
        this.Sector = sector;
        this.APIKey = apiKey;
        this.BaseURL = baseURL;
        this.Environment = environment;
        this.Role = role;
    }

}
