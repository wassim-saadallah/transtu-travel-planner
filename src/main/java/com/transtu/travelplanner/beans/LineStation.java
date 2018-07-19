package com.transtu.travelplanner.beans;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "lineview")
public class LineStation {


    @Getter @Setter private LineStation lineStation;

    @Getter @Setter private ArrayList<Station> stations;

}
