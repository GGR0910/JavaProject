package financials.api.financials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@AutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableJpaRepositories
public class FinancialsApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinancialsApplication.class, args);
	}

}
