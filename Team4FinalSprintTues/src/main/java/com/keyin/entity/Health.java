package com.keyin.entity;

import javax.persistence.*;

@Entity
public class Health {
    @Id
    @SequenceGenerator(name = "health_sequence", sequenceName = "health_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "health_sequence")
    private long id;
    private long height;
    private long weight;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }


}
