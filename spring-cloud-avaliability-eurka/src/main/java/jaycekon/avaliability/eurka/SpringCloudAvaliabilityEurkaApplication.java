package jaycekon.avaliability.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudAvaliabilityEurkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAvaliabilityEurkaApplication.class, args);
    }
}
