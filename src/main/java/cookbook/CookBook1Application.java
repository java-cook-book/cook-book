package cookbook;

import cookbook.model.Recipe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class    CookBook1Application {

    public static void main(String[] args) {

        SpringApplication.run(CookBook1Application.class, args);
    }


    }



