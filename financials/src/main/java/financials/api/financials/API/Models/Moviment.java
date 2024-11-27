package financials.api.financials.API.Models;

import financials.api.financials.API.Models.Enums.MovimentType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Moviment")
public class Moviment{
    @Id
    private String Id;
    private MovimentType MovimentType;
    private double Value;
    private String Description;
    private Goal Goal;
    private Category Category;
    private Expense Expense;
    private String EnvironmentId;

    private boolean IsActive;
    private String CreatedById;
    private String CreatedDate;
    private String ModifiedById;
    private String ModifiedDate;

    public Moviment(String CreatedById, MovimentType movimentType, double value, String description, Goal goal, Category category, Expense expense,  String EnvironmentId) {
        this.CreatedById = CreatedById;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now().toString();
        this.Id = java.util.UUID.randomUUID().toString();
        this.MovimentType = movimentType;
        this.Value = value;
        this.Description = description;
        this.Goal = goal;
        this.Category = category;
        this.Expense = expense;
        this.EnvironmentId = EnvironmentId;
    }
}
