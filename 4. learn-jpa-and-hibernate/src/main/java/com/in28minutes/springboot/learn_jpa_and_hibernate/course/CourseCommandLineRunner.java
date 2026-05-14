package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "AWS JPA", "in27minutes"));
//        repository.insert(new Course(2, "Azure JPA", "in27minutes"));
//        repository.insert(new Course(3, "Learn something else JPA", "in27minutes"));
//        repository.deleteById(1);
//        // gives error
////        repository.findById(1);
//        System.out.println("object retrieved:" + repository.findById(3));
//    }

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "AWS Spring JPA", "in27minutes"));
        repository.save(new Course(2, "Azure Spring JPA", "in27minutes"));
        repository.save(new Course(3, "Learn Spring something else JPA", "in27minutes"));
        repository.deleteById(1L);
        // gives error
//        repository.findById(1);
        System.out.println("object retrieved:" + repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByAuthor("in27minutes"));
        System.out.println(repository.findByName(""));
        System.out.println(repository.findByName("Learn Spring something else JPA"));

    }
}
