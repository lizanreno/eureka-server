package cn.reno.eurekaConsumerFeign.Controller;

import cn.reno.eurekaConsumerFeign.Client.DcFClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcFController {

    @Autowired
    DcFClient dcFClient;

    @GetMapping("/consumerF")
    public String dc(){
        return dcFClient.consumer();
    }
}
