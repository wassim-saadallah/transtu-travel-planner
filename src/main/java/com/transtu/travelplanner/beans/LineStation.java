package com.transtu.travelplanner.beans;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "line_station")
public class LineStation {

    @Id
    private Integer id;

    @Column(name = "id_station")
    private Integer stationId;

    @Column(name = "position")
    private Integer position;

    @Column(name = "id_line")
    private Integer lineId;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLine(Integer lineId) {
        this.lineId = lineId;
    }
}
