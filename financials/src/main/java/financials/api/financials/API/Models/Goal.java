package financials.api.financials.API.Models;
import java.time.LocalDateTime;
public class Goal {
    private double GoalAmount;
    private double CurrentAmount;
    private String Name;
    private String Description;
    private LocalDateTime DueDate;
    private boolean IsCompleted;
}
