package cn.reno.eurekaConsumerFeign.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcRController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumerR")
    public String dc(){
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }
}
