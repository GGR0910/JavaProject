package financials.api.financials.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import financials.api.financials.API.Models.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}
