package financials.api.financials.API.Service.Interfaces;

import java.util.List;

import financials.api.financials.API.Models.Expense;

public interface IExpenseService {
    public Expense CreateExpense(Expense expense);
    public void DeleteExpense(String Id);
    public Expense UpdateExpense(String Id,Expense expense);
    public List<Expense> GetAllExpenses();
    public Expense GetExpenseById(String Id);
}
