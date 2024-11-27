package financials.api.financials.API.Models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Category")
public class Category{
    @Id
    private String Id;
    private String Name;
    private String Description;
    private String HexaColor;
    private String Icon;
    private String EnvironmentId;
    private boolean IsActive;
    private String CreatedById;
    private String CreatedDate;
    private String ModifiedById;
    private String ModifiedDate;
    
    public Category(String Name, String Description, String HexaColor, String Icon,  String EnvironmentId, String CreatedById) {
        this.Id = UUID.randomUUID().toString();
        this.Name = Name;
        this.Description = Description;
        this.HexaColor = HexaColor;
        this.Icon = Icon;
        this.EnvironmentId = EnvironmentId;
        this.CreatedById = CreatedById;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now().toString();
    }
}