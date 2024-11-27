package financials.api.financials.API.Models;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Expense")
public class Expense{
    @Id
    private String Id;
    private double Amount;
    private String Name;
    private String Description;
    private boolean IsPaid;
    private String DueDate;

    private boolean IsActive;
    private String CreatedById;
    private String CreatedDate;
    private String ModifiedById;
    private String ModifiedDate;
    private String EnvironmentId;

    public Expense(String CreatedById, double amount, String name, String description, boolean isPaid, String dueDate, String EnvironmentId) {
        this.CreatedById = CreatedById;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now().toString();
        this.Id = UUID.randomUUID().toString();
        this.Amount = amount;
        this.Name = name;
        this.Description = description;
        this.IsPaid = isPaid;
        this.DueDate = dueDate;
        this.EnvironmentId = EnvironmentId;
    }
}
