package com.mastertheboss.springboot.springbootwildfly.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "datas")
public @Data
class Datas {

    public Datas(String value, String date) {
        this.value = value;
        this.date = date;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "value")
    private String value;

    @Column(name = "date")
    private String date;

    public interface DataValues {
        String getValue();
        String getDate();
    }


}
