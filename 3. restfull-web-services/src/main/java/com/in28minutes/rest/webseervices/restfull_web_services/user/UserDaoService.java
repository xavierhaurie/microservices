package com.in28minutes.rest.webseervices.restfull_web_services.user;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static int usersCount = 0;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

//    public User findOne(int id) {
//        Predicate<? super User> predicate = user-> user.getId().equals(id);
//        return users.stream().filter( predicate ).findFirst().get();
//     }

    public User findOne(int id) {
        return users.stream().filter( user-> user.getId().equals(id) ).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        users.removeIf(user-> user.getId().equals(id));
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
