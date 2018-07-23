package com.transtu.travelplanner.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@RequiredArgsConstructor
@Entity
@Table(name = "line")
public class Line {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "line_number")
    private String label;

    @Column(name = "line_type")
    private Integer type;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return getId().equals(line.getId());
    }
}
