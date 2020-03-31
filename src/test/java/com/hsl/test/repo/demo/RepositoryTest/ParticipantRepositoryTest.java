package com.hsl.test.repo.demo.RepositoryTest;

import com.hsl.test.repo.demo.model.Participants;
import com.hsl.test.repo.demo.repository.ParticipantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ParticipantRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    ParticipantRepository participantRepository;

    @Test
    public void saveParticipant() {

        Participants participants = new Participants();
        participants.setP_id(222L);
        participants.setP_name("Tharuke");
        participants.setAge(23);
        participants.setEvents("Badminton");
        participants.setGender("Male");
        participants = testEntityManager.persistAndFlush(participants);
        assertThat(participantRepository.findById(participants.getP_id()).get()).isEqualTo(participants);

    }

}
