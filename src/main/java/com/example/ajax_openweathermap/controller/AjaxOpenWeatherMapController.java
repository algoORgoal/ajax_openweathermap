package com.example.ajax_openweathermap.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class AjaxOpenWeatherMapController {
    @RequestMapping(value = "/remote/openweather")

    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyId = "c7af8791f990bbb828bd4068b99a890e";
        String targetUri = "https://api.openweathermap.org/data/2.5/forecast?q=Seoul,kr&appid=" + keyId;
        resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}