package com.transtu.travelplanner.controllers;

import com.transtu.travelplanner.beans.LineStation;
import com.transtu.travelplanner.beans.Station;
import com.transtu.travelplanner.repositories.LineRepository;
import com.transtu.travelplanner.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TravelPlannerController {

    private StationRepository stationRepository;

    private LineRepository lineRepository;

    @Autowired
    public TravelPlannerController(StationRepository stationRepository, LineRepository lineRepository){
        this.lineRepository = lineRepository;
        this.stationRepository = stationRepository;
    }

    @GetMapping(path = "/stations")
    public @ResponseBody Iterable<Station> getAllStations(){
        System.out.println("grabbing stations");
        return stationRepository.findAll();
    }

    @GetMapping(path = "/lines")
    public @ResponseBody Iterable<LineStation> getAllLines(){
        System.out.println("grabbing lines");
        return lineRepository.findAll();
    }

}
