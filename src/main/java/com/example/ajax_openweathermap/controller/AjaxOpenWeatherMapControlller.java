package com.example.ajax_openweathermap.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class AjaxOpenWeatherMapController {
    @RequestMapping(value="/remote/openweather");

    public Object actioinMethod(){
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyId =  "2bc6105e760d7e34614724098a57ac64";
        String targetURI = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=" + keyId;
        resultObject = restTemplate.getForObject(targetURI, Object.class);
        return resultObject;
    }
}