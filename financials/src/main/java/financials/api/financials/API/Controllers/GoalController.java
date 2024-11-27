package financials.api.financials.API.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import financials.api.financials.API.Models.Goal;
import financials.api.financials.API.Service.Interfaces.IGoalService;
import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

    @Autowired
    private IGoalService GoalService;

    @GetMapping
    public List<Goal> getAllGoals() {
        return GoalService.GetAllGoals();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Goal> getGoalById(@PathVariable String id) {
        Goal goal = GoalService.GetGoalById(id);
        if (goal != null) {
            return ResponseEntity.ok(goal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Goal createGoal(@RequestBody Goal goal) {
        return GoalService.CreateGoal(goal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Goal> updateGoal(@PathVariable String id, @RequestBody Goal goalDetails) {
        Goal updatedGoal = GoalService.UpdateGoal(id, goalDetails);
        if (updatedGoal != null) {
            return ResponseEntity.ok(updatedGoal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGoal(@PathVariable String id) {
        GoalService.DeleteGoal(id);
       
        return ResponseEntity.ok().build();
        
    }
}