package com.transtu.travelplanner.beans;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@RequiredArgsConstructor
@NoArgsConstructor
public class Line {

    @Id
    private Integer id;

    @Column(name = "id_station")
    private Integer station;

    @Column(name = "position")
    private Integer position;

    @Column(name = "line_number")
    private String label;

    @Column(name = "line_type")
    private Integer type;

    public Integer getStation() {
        return station;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }
}
