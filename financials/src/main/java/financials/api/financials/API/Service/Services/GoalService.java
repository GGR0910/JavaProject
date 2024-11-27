package financials.api.financials.API.Service.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import financials.api.financials.API.Models.Goal;
import financials.api.financials.API.Repository.GoalRepository;
import financials.api.financials.API.Service.Interfaces.IGoalService;

import org.springframework.stereotype.Service;
@Service
public class GoalService implements IGoalService {     
    @Autowired
    private GoalRepository GoalRepository;

    public Goal CreateGoal(Goal Goal) {
        return GoalRepository.save(Goal);
    }

    public void DeleteGoal(String Id) {
        GoalRepository.deleteById(Id);
    }
     
    public Goal UpdateGoal(String Id, Goal Goal) {
        return GoalRepository.save(Goal);
    }
     
    public List<Goal> GetAllGoals() {
        return GoalRepository.findAll();
    }

    public Goal GetGoalById(String Id) {
        return GoalRepository.findById(Id).get();
    }
}
