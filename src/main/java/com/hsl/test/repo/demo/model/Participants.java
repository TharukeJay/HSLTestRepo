package com.hsl.test.repo.demo.model;

import com.sun.istack.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "ParticipantRepository")
//@EntityListeners(AuditingEntityListener.class)
public class Participants implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int p_id;

    @NotNull
    private String p_name;

    @NotNull
    private int age;

    @NotNull
    private String events;

    @NotNull
    private String gender;

}
