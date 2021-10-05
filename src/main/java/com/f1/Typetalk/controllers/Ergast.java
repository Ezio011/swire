package com.f1.Typetalk.controllers;

import com.f1.Typetalk.models.ResultsList;
import com.f1.Typetalk.services.ErgastAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Ergast {
    @GetMapping("{year}/results")
    public String getRaceResults(@RequestParam String year)
    {
        ErgastAPI api = new ErgastAPI();
        return api.findYearResults(year);
    }
}
