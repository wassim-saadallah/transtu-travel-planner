package com.transtu.travelplanner.services;


import com.transtu.travelplanner.beans.Line;
import com.transtu.travelplanner.beans.LineStation;
import com.transtu.travelplanner.repositories.LineRepository;
import com.transtu.travelplanner.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class GraphUtils {

    private StationRepository stationRepository;

    private LineRepository lineRepository;

    @Autowired
    private GraphUtils(StationRepository stationRepository, LineRepository lineRepository){
        this.lineRepository = lineRepository;
        this.stationRepository = stationRepository;
    }


    private ArrayList<Line> createFullLines(){
        ArrayList<Line> result = new ArrayList<>();
        //Map<Integer, >Stream.of(lineRepository.findAll()).collect(Collectors.groupingBy(LineStation::getId()));
        return null;
    }
}
