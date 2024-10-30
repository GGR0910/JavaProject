package financials.api.financials.API.Models;

import financials.api.financials.API.Models.Enums.CategoryType;

public class Category extends BaseEntity{
    private String Name;
    private String Description;
    private CategoryType CategoryType;
    private String HexaColor;
    private String Icon;
    private Environment Environment;
    
    public Category(String Name, String Description, CategoryType CategoryType, String HexaColor, String Icon, Environment Environment, SystemUser createdBy) {
        super(createdBy);
        this.Name = Name;
        this.Description = Description;
        this.CategoryType = CategoryType;
        this.HexaColor = HexaColor;
        this.Icon = Icon;
        this.Environment = Environment;
    }
}
