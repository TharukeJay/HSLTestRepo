package com.hsl.test.repo.demo.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Agenda implements Serializable {

    @Id
    private Long A_id;

    @Id
    private Long U_id;

    @NotNull
    private String e_name;

    @NotNull
    private String Timing;
}
