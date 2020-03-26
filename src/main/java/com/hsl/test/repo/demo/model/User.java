package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    private int id;

    @NotNull
    private String fName;

    @NotNull
    private String email;

    @NotNull
    private String gender;

    @NotNull
    private int contact_No;

    @NotNull
    private String userName;

    @NotNull
    private String password;

}
