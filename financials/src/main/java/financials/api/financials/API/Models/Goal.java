package financials.api.financials.API.Models;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Goal")
public class Goal{
    @Id
    private String Id;
    private double GoalAmount;
    private double CurrentAmount;
    private String Name;
    private String Description;
    private String DueDate;
    private boolean IsCompleted;

    private boolean IsActive;
    private String CreatedById;
    private String CreatedDate;
    private String ModifiedById;
    private String ModifiedDate;
    private String EnvironmentId;

    public Goal(String CreatedById, double goalAmount, double currentAmount, String name, String description, String dueDate, boolean isCompleted, String EnvironmentId) {
        this.CreatedById = CreatedById;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now().toString();
        this.Id = java.util.UUID.randomUUID().toString();
        this.GoalAmount = goalAmount;
        this.CurrentAmount = currentAmount;
        this.Name = name;
        this.Description = description;
        this.DueDate = dueDate;
        this.IsCompleted = isCompleted;
        this.EnvironmentId = EnvironmentId;
    }
}

