package financials.api.financials.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import financials.api.financials.API.Models.Goal;
import org.springframework.stereotype.Repository;
@Repository
public interface GoalRepository extends JpaRepository<Goal, String> {

}
