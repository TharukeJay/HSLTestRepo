package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Participant")
@Embeddable
public class Participants implements Serializable {

    @Id
    private Long p_id;

    @NotNull
    private String p_name;

    @NotNull
    private int age;

    @NotNull
    private String events;

    @NotNull
    private String gender;

}
