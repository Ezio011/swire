package com.f1.Typetalk.controllers;

import com.f1.Typetalk.models.ResultsList;
import com.f1.Typetalk.services.ErgastAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Ergast {
    @GetMapping("/{year}/results")
    public String getRaceResults(@PathVariable String year)
    {
        ErgastAPI api = new ErgastAPI();
        return api.findYearResults(year);

    }

    @GetMapping("/status")
    public void status(){
        System.out.println("Ezio");
    }
}
