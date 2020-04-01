package com.hsl.test.repo.demo.RepositoryTest;


import com.hsl.test.repo.demo.model.Agenda;
import com.hsl.test.repo.demo.repository.agendaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AgendaRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    agendaRepository agendaRepository;

    @Test
    public void saveAgenda() {
        Agenda agenda = new Agenda();
        agenda.setA_id(a111);
        agenda.setU_id(B4D5);
        agenda.sete_name(100M);
        agenda.setTiming(8.45-9.15);
        agenda = testEntityManager.persistAndFlush(agenda);
        assertThat(agendaRepository.findById(agenda.getid()).get()).isEqualTo(agenda);
    }
}
