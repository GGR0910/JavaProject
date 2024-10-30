package financials.api.financials.API.Models;

import financials.api.financials.API.Models.Enums.MovimentType;

public class Moviment extends BaseEntity{
    private MovimentType MovimentType;
    private double Value;
    private String Description;
    private Goal Goal;
    private Category Category;
    private Account Account;
    private Debt Debt;
    private Expense Expense;
    private Environment Environment;
}
