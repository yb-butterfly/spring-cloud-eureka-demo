package cn.sx.xujb.study.spring.cloud.eureka.client.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by YB on 2018/1/6.
 */
@Controller
public class ClientController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/time")
    public String time() {
//        Applications applications = eurekaClient.getApplications();
//        for (Application application : applications.getRegisteredApplications()) {
//            System.out.println(application);
//            List<InstanceInfo> instanceInfos = application.getInstances();
//            for (InstanceInfo instanceInfo : instanceInfos) {
//                System.out.println(instanceInfo.getAppName() + "," + instanceInfo.getInstanceId() + "," + instanceInfo.getHostName());
//            }
//        }

        System.out.println(" ----------------------------- ");
        System.out.println(eurekaClient.getApplication("time-server"));
        String results = restTemplate.getForObject("http://time-server/now", String.class);
        System.out.println(results);

        // System.out.println(eurekaClient.getApplication("TIMESERVER"));
        return results;
    }
}
