package financials.api.financials.API.Service.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import financials.api.financials.API.Models.Expense;
import financials.api.financials.API.Repository.ExpenseRepository;
import financials.api.financials.API.Service.Interfaces.IExpenseService;

import org.springframework.stereotype.Service;
@Service
public class ExpenseService implements IExpenseService {
        
        @Autowired
        private ExpenseRepository ExpenseRepository;

        public Expense CreateExpense(Expense expense) {
            return ExpenseRepository.save(expense);
        }
    
        public void DeleteExpense(String Id) {
            ExpenseRepository.deleteById(Id);
        }
    
        public Expense UpdateExpense(String Id, Expense expense) {
            return ExpenseRepository.save(expense);
        }
    
        public List<Expense> GetAllExpenses() {
            return ExpenseRepository.findAll();
        }
    
        public Expense GetExpenseById(String Id) {
            return ExpenseRepository.findById(Id).get();
        }
}
