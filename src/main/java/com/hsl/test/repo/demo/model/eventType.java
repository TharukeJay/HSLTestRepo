package com.hsl.test.repo.demo.model;


import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class eventType implements Serializable {

    @Id
    private Long et_id;

    @NotNull
    private String et_name;

}






