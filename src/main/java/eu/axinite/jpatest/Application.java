package eu.axinite.jpatest;


import eu.axinite.jpatest.service.SoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    @Autowired
    SoccerService soccerService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments var1) throws Exception {
        try {
            soccerService.plainTest();
        } catch (Exception e) {
            System.out.println("Catched!!");
        }
        while(true);
    }

}
