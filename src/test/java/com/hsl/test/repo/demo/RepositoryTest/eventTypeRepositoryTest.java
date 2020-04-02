package com.hsl.test.repo.demo.RepositoryTest;


import com.hsl.test.repo.demo.repository.eventTypeRepository;
import javafx.event.EventType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import javax.swing.event.HyperlinkEvent;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class eventTypeRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    com.hsl.test.repo.demo.repository.eventTypeRepository eventTypeRepository;

    @Test
    public void saveEventType(){
        EventType eventType = new EventType();
        eventType.setet_id(1111);
        eventType.setet_name(100M);
        eventType = testEntityManager.persistAndFlush(eventType);
        assertThat(eventTypeRepository.findById(eventType.getet_id()).get()).isEqualTo(eventType);
    }


}
