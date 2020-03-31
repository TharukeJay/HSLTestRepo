package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "gameDay")
@Embeddable
public class GameDay implements Serializable {

    @Id
    private Long gd_id;

    @NotNull
    private String participants;

    @NotNull
    private String events;

    @NotNull
    private String date;

}
