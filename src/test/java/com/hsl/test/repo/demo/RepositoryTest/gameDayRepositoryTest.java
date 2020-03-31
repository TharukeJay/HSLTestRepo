package com.hsl.test.repo.demo.RepositoryTest;

import com.hsl.test.repo.demo.model.GameDay;
import com.hsl.test.repo.demo.repository.GameDayRepository;
import org.hibernate.type.CalendarDateType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class gameDayRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    GameDayRepository gameDayRepository;

    @Test
    public void saveGameDay() {
        GameDay gameDay = new GameDay();
        gameDay.setGd_id(332L);
        gameDay.setParticipants("Tharuke,Thakshila");
        gameDay.setEvents("Badminton");
        gameDay.setDate("20/02/2020");
        gameDay = testEntityManager.persistAndFlush(gameDay);
        assertThat(gameDayRepository.findById(gameDay.getGd_id()).get()).isEqualTo(gameDay);
    }
}
