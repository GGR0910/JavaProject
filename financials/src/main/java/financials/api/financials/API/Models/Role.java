package financials.api.financials.API.Models;

public class Role extends BaseEntity{
    private String Name;
    private boolean CanEdit;
    private boolean CanDelete;
    private boolean CanAdd;
    private boolean Movements;
    private boolean Expenses;
    private boolean Debts;
    private boolean Reserves;
    private boolean Goals;
    private boolean Accounts;
    private boolean Systems;
}
