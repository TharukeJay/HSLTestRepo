package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "user")
@Embeddable
public class User implements Serializable {

    @Id
    private Long id;

    @NotNull
    private String fName;

    @NotNull
    private String email;

    @NotNull
    private String gender;

    @NotNull
    private String contact_No;

    @NotNull
    private String userName;

    @NotNull
    private String password;

}
