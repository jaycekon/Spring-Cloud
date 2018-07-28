package jaycekon.eureka.feign.service.impl;

import jaycekon.eureka.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author huangweijie
 * @date 2018/7/28
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
