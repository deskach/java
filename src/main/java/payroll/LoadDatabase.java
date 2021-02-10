package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Employee[] employees = {
            new Employee("Bilbo Baggins", "burglar"),
            new Employee("Frodo Baggins", "thief"),
    };

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        // Spring Boot will run ALL CommandLineRunner beans once the application context is loaded.

        return args -> {
            for (Employee e : employees) {
                log.info("Preloading " + repository.save(e));
            }
        };
    }
}