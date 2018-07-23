package com.transtu.travelplanner.controllers;
import com.transtu.travelplanner.beans.Line;
import com.transtu.travelplanner.beans.LineStation;
import com.transtu.travelplanner.beans.Station;
import com.transtu.travelplanner.repositories.LineRepository;
import com.transtu.travelplanner.repositories.LineStationRepository;
import com.transtu.travelplanner.repositories.StationRepository;
import com.transtu.travelplanner.services.GraphUtils;
import com.transtu.travelplanner.services.IGraphUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TravelPlannerController {

    private StationRepository stationRepository;

    private LineRepository lineRepository;

    private LineStationRepository lineStationRepository;

    private IGraphUtils graphUtils;

    @Autowired
    public TravelPlannerController(StationRepository stationRepository, LineRepository lineRepository, GraphUtils graphUtils, LineStationRepository lineStationRepository){
        this.lineRepository = lineRepository;
        this.stationRepository = stationRepository;
        this.graphUtils = graphUtils;
        this.lineStationRepository = lineStationRepository;
    }

    @GetMapping(path = "/stations")
    public @ResponseBody Iterable<Station> getAllStations(){
        System.out.println("grabbing stations");
        return stationRepository.findAll();
    }

    @GetMapping(path = "/lines")
    public @ResponseBody Iterable<Line> getAllLines(){
        System.out.println("grabbing lines");
        return lineRepository.findAll();
    }

    @GetMapping(path = "/linesStations")
    public @ResponseBody Map<Integer, List<Station>> getLineStations(){
        System.out.println("grabbing lines with stations");
        return this.graphUtils.createFullLines();
    }
}
