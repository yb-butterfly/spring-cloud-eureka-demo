package cn.sx.xujb.study.spring.cloud.eureka.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by YB on 2018/1/6.
 */
@Controller
public class TimeServerController {

    @Value("${location.country}")
    private String country;

    @ResponseBody
    @RequestMapping("/now")
    public String now() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        return country + " - " + time;
    }
}
