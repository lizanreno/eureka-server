package cn.reno.eurekaConsumerFeign.Client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcFClient {

    @GetMapping("/dc")
    String consumer();
}
