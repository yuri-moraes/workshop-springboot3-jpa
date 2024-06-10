package org.app.springbootcourse.config;

import org.app.springbootcourse.entities.User;
import org.app.springbootcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    //automaticly dependences injection
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown","maria@gmail.com","988888","12345");
        User u2 = new User(null, "Jhon Brown","jhon@gmail.com","9335448","54321");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
