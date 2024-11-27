package financials.api.financials.API.Controllers;

import financials.api.financials.API.Models.Expense;
import financials.api.financials.API.Service.Interfaces.IExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private IExpenseService ExpenseService;

    @GetMapping
    public List<Expense> getAllExpenses() {
        return ExpenseService.GetAllExpenses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable String id) {
        Expense expense = ExpenseService.GetExpenseById(id);
        if (expense != null) {
            return ResponseEntity.ok(expense);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return ExpenseService.CreateExpense(expense);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Expense> updateExpense(@PathVariable String id, @RequestBody Expense expenseDetails) {
        Expense updatedExpense = ExpenseService.UpdateExpense(id, expenseDetails);
        if (updatedExpense != null) {
            return ResponseEntity.ok(updatedExpense);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable String id) {
        ExpenseService.DeleteExpense(id);
       
        return ResponseEntity.ok().build();
        
    }
}