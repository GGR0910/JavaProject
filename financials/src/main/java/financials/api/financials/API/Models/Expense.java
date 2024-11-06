package financials.api.financials.API.Models;
import java.time.LocalDateTime;
public class Expense extends BaseEntity{
    private double Amount;
    private String Name;
    private String Description;
    private boolean IsPaid;
    private LocalDateTime DueDate;
}
