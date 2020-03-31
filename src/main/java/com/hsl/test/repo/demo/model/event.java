package com.hsl.test.repo.demo.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class event implements Serializable {

    @Id
    private Long e_id;

    @NotNull
    private String e_name;
}
