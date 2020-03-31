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
@Table(name = "app")
@Embeddable
public class App implements Serializable {

    @Id
    private Long app_id;

    @NotNull
    private String app_Name;

    @NotNull
    private String app_User;

}
