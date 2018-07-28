package jaycekon.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweijie
 * @date 2018/7/28
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "jaycekon") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
