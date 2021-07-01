package com.project.tempapi.Controllers;

import com.project.tempapi.Models.Temperature;
import com.project.tempapi.Repository.TempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemperatureController {

    private final TempRepository tempRepository;

    public TemperatureController(TempRepository tempRepository) {
        this.tempRepository = tempRepository;
    }

    @GetMapping(value = "/temperature")
    public List<Temperature> getTemperature(){
        return tempRepository.findAll();
    }

    @PostMapping(value = "/save")
    public String saveTemperature(@RequestBody Temperature temperature){
        tempRepository.save(temperature);
        return "Temperature saved to the database";
    }
}
