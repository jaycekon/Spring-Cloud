package jaycekon.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class SpringCloudConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigEurekaApplication.class, args);
    }
}
