package in.arakaki.hawk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class HawkApplication {
    public static void main(String[] args) {
        SpringApplication.run(HawkApplication.class, args);
    }
}
