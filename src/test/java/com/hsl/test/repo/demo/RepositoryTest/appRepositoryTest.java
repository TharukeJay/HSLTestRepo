package com.hsl.test.repo.demo.RepositoryTest;

import com.hsl.test.repo.demo.model.App;
import com.hsl.test.repo.demo.repository.AppRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class appRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    AppRepository appRepository;

    @Test
    public void saveApp() {
        App app = new App();
        app.setApp_id(456L);
        app.setApp_Name("BC Sportmeet");
        app.setApp_User("Tharuke Jayawardhane");
        app = testEntityManager.persistAndFlush(app);
        assertThat(appRepository.findById(app.getApp_id()).get()).isEqualTo(app);
    }

}
