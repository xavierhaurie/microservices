package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
            insert into course (id, name, author) 
            values (?, ?, ?);  
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
            course.getId(),
            course.getName(),
            course.getAuthor()
        );
    }

    public void deleteById(long id) {
        String DELETE_QUERY =
                """
                delete from course where id = ?;
                """;
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        String SELECT_QUERY =
                """
                select * from course where id = ?;
                """;
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),
                id);

//                new Object[]{id}, (rs, rowNum) ->
//                new Course(rs.getInt("id"), rs.getString("name"), rs.getString("author"))

    }
}
