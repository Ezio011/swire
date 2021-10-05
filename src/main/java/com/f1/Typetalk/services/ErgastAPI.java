package com.f1.Typetalk.services;

import com.f1.Typetalk.models.ResultsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class ErgastAPI {

    @Autowired
    static
    RestTemplate restTemplate;

    public static String findYearResults(String year)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://ergast.com/api/f1/year/results", HttpMethod.GET, entity, String.class).getBody();
    }

}
