package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class GameDay implements Serializable {

    @Id
    private int gd_id;

    @NotNull
    private String participants;

    @NotNull
    private String events;

    @NotNull
    private Date date;

}
