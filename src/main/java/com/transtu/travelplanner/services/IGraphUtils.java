package com.transtu.travelplanner.services;

import com.transtu.travelplanner.beans.Station;
import org.jgrapht.DirectedGraph;

import java.util.List;
import java.util.Map;

public interface IGraphUtils {

    Map<Integer, List<Station>>  createFullLines();

    DirectedGraph<Station, Void> createGraph();
}
