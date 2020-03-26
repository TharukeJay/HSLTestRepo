package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class App implements Serializable {

    @Id
    private int app_id;

    @NotNull
    private String app_Name;

    @NotNull
    private String app_User;

}
