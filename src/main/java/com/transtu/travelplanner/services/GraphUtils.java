package com.transtu.travelplanner.services;


import com.transtu.travelplanner.beans.Line;
import com.transtu.travelplanner.beans.LineStation;
import com.transtu.travelplanner.beans.Station;
import com.transtu.travelplanner.repositories.LineRepository;
import com.transtu.travelplanner.repositories.LineStationRepository;
import com.transtu.travelplanner.repositories.StationRepository;
import org.jgrapht.DirectedGraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class GraphUtils implements IGraphUtils{

    private StationRepository stationRepository;

    private LineRepository lineRepository;

    private LineStationRepository lineStationRepository;

    private Map<Integer, List<Station>> lineMap = null;

    @Autowired
    public GraphUtils(StationRepository stationRepository, LineRepository lineRepository, LineStationRepository lineStationRepository){
        this.lineRepository = lineRepository;
        this.stationRepository = stationRepository;
        this.lineStationRepository = lineStationRepository;
    }

    @Override
    public Map<Integer, List<Station>> createFullLines(){

        if(this.lineMap != null) return this.lineMap;

        Iterable<LineStation> lineStations = lineStationRepository.findAll();

        Stream<LineStation> lineStationStream= StreamSupport.stream(lineStations.spliterator(), false);

        Iterable<Station> stations = stationRepository.findAll();

        Stream<Station> stationStream = StreamSupport.stream(stations.spliterator(), false);

        Map<Integer, List<LineStation>> lineStationMap = lineStationStream.collect(Collectors.groupingBy(LineStation::getLineId));

        Map<Integer, List<Station>> result = lineStationMap.entrySet().stream().collect(
                Collectors.toMap(
                    e -> e.getKey(),
                    e -> e.getValue()
                            .stream()
                            .map(lineStation -> stationStream
                                    .filter(station -> lineStation.getStationId().equals(station.getId()))
                                    .findFirst()
                                    .get()
                                )
                            .collect(Collectors.toList())
                                ));
        this.lineMap = result;
        return this.lineMap;
    }

    @Override
    public DirectedGraph<Station, Void> createGraph(){
        return null;
    }



}
