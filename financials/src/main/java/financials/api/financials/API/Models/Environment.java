package financials.api.financials.API.Models;

public class Environment extends BaseEntity {
    private String Name;
    private String Address;
    private String Country;
    private String ResponsibleEmail;
    private String ResponsibleName;
    private String Document;

    public Environment(String Name, String Address, String Country, String ResponsibleEmail, String ResponsibleName, String Document, SystemUser createdBy) {
        super(createdBy);
        this.Name = Name;
        this.Address = Address;
        this.Country = Country;
        this.ResponsibleEmail = ResponsibleEmail;
        this.ResponsibleName = ResponsibleName;
        this.Document = Document;
    }
}
