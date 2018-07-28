package jaycekon.eureka.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangweijie
 * @date 2018/7/28
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://jaycekon-hi/hi?name=" + name, String.class);
    }


    public String hiError(String name) {
        return "hi," + name + ",sorry ,error!";
    }
}
