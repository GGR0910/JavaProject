package financials.api.financials.API.Models;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Environment")
public class Environment{
    @Id
    private String Id;
    private String Name;
    private String Address;
    private String Country;
    private String ResponsibleEmail;
    private String ResponsibleName;
    private String Document;

    private boolean IsActive;
    private String CreatedById;
    private String CreatedDate;
    private String ModifiedById;
    
    private String ModifiedDate;

    public Environment(String Name, String Address, String Country, String ResponsibleEmail, String ResponsibleName, String Document, String CreatedById) {
        this.CreatedById = CreatedById;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now().toString();
        this.Id = UUID.randomUUID().toString();
        this.Name = Name;
        this.Address = Address;
        this.Country = Country;
        this.ResponsibleEmail = ResponsibleEmail;
        this.ResponsibleName = ResponsibleName;
        this.Document = Document;
    }
}
