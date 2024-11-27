package financials.api.financials.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import financials.api.financials.API.Models.SystemUser;
import org.springframework.stereotype.Repository;
@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, String> {

}