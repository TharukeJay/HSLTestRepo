package com.hsl.test.repo.demo.RepositoryTest;

import com.hsl.test.repo.demo.model.User;
import com.hsl.test.repo.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("Tharuke Jayawardhane");
        user.setFName("Tharuke");
        user.setEmail("tharuke@gmail.com");
        user.setGender("Male");
        user.setContact_No("0772859315");
        user.setId(1111L);
        user.setPassword("1234656");
        user = testEntityManager.persistAndFlush(user);
        assertThat(userRepository.findById(user.getId()).get()).isEqualTo(user);
    }

}
