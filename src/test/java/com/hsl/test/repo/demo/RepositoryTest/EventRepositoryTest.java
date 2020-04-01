package com.hsl.test.repo.demo.RepositoryTest;


import com.hsl.test.repo.demo.repository.eventRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class EventRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    com.hsl.test.repo.demo.repository.eventRepository eventRepository;

    @Test
    public void saveEvent(){
        Event event = new Event();
        event.sete_id(4W1B);
        event.sete_name(100_Realay);
        event = testEntityManager.persistAndFlush(event);
        assertThat(eventRepository.findById(event.gete_id()).get()).isEqualTo(event);
    }
}
