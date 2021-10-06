package com.f1.Typetalk.services;

import com.f1.Typetalk.models.MRData;
import com.f1.Typetalk.models.ResultsList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

public class ErgastAPI {

    public String findYearResults(String year)
    {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        ResponseEntity<String> response = restTemplate.exchange("http://ergast.com/api/f1/" + year + "/results", HttpMethod.GET, entity, String.class);
        System.out.println("response:" + response.getBody());
        XmlMapper xmlMapper = new XmlMapper();
        try {
            MRData list = xmlMapper.readValue(response.getBody(), MRData.class);
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            String json = mapper.writeValueAsString(list);
            System.out.println("List: " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "success";
        //return restTemplate.exchange("http://ergast.com/api/f1/" + year + "/results", HttpMethod.GET, entity, String.class).getBody();
    }

}
