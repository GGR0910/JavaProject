package financials.api.financials.API.Models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "SystemUser")
public class SystemUser{
    @Id
    private String Id;
    private String Name;
    private String ResponsibleEmail;
    private String ResponsibleName;
    private String Sector;
    private String APIKey;
    private String BaseURL;


    private boolean IsActive;
    private String CreatedById;
    private String CreatedDate;
    private String ModifiedById;
    private String ModifiedDate;
    private String EnvironmentId;

    public SystemUser(String name, String ResponsibleEmail, String ResponsibleName, String sector, String baseURL,  String EnvironmentId, String CreatedById) {
        this.CreatedById = CreatedById;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now().toString();
        this.Id = UUID.randomUUID().toString();
        this.Name = name;
        this.ResponsibleEmail = ResponsibleEmail;
        this.ResponsibleName = ResponsibleName;
        this.Sector = sector;
        this.BaseURL = baseURL;
        this.EnvironmentId = EnvironmentId;
    }

    public boolean Validate(String apiKey) {
        return this.APIKey.equals(apiKey);
    }

    public String getEnvironmentId() {
        return this.EnvironmentId;
    }
    
    public void setAPIKey(String apiKey) {
        this.APIKey = apiKey;
    }

}

