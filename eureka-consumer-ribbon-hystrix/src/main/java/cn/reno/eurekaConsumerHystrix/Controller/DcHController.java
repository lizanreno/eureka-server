package cn.reno.eurekaConsumerHystrix.Controller;

import cn.reno.eurekaConsumerHystrix.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcHController {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumerH")
    public String dc(){
        return consumerService.consumer();
    }
}
