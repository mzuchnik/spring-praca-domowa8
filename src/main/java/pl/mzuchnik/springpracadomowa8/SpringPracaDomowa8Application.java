package pl.mzuchnik.springpracadomowa8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringPracaDomowa8Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracaDomowa8Application.class, args);
    }

}
