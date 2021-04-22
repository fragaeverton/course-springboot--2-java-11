package com.evertonfraga.course.config;

import com.evertonfraga.course.entities.User;
import com.evertonfraga.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Everton","everton@everton","11111","pass");
        User u2 = new User(null,"Larissa","larissa@everton","122221","pass2");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
