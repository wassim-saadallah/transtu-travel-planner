package com.transtu.travelplanner.beans;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stationview")
public class Station {

    @Id
    @Getter private Integer id;

    @Column(name = "label_fr")
    @Getter @Setter private String label;

    @Column(name = "longitude")
    @Getter @Setter private Double lon;

    @Column(name = "latitude")
    @Getter @Setter private Double lat;

    @Column(name = "station_type")
    @Getter @Setter private Integer type;

    @Column(name = "station_level")
    @Getter @Setter private Integer level;
}
