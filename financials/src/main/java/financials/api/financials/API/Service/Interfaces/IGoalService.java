package financials.api.financials.API.Service.Interfaces;

import java.util.List;

import financials.api.financials.API.Models.Goal;

public interface IGoalService {
    public Goal CreateGoal(Goal Goal);
    public void DeleteGoal(String Id);
    public Goal UpdateGoal(String Id,Goal Goal);
    public List<Goal> GetAllGoals();
    public Goal GetGoalById(String Id);
}
