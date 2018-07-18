package com.transtu.travelplanner.beans;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "lineview")
public class Line {

    @Id
    @Getter private Integer id;

    @Column(name = "id_station")
    @Getter @Setter private Station station;

    @Column(name = "position")
    @Getter @Setter private Integer position;

    @Column(name = "line_number")
    @Getter @Setter private String label;

    @Column(name = "line_type")
    @Getter @Setter private Integer type;
}
