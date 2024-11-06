package financials.api.financials.API.Models;

public class Category extends BaseEntity{
    private String Name;
    private String Description;
    private String HexaColor;
    private String Icon;
    private Environment Environment;
    
    public Category(String Name, String Description, String HexaColor, String Icon, Environment Environment, SystemUser createdBy) {
        super(createdBy);
        this.Name = Name;
        this.Description = Description;
        this.HexaColor = HexaColor;
        this.Icon = Icon;
        this.Environment = Environment;
    }
}
