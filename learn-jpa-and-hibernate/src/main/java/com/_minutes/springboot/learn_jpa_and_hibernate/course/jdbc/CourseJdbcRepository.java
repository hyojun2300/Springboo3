package com._minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com._minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			insert into courses (id, name, author)
			values(?, ?, ?);
			""";
	
	private static String DELETE_QUERY = 
			"""
			delete from courses where id=?;
			""";
	
	private static String SELECT_QUERY = 
			"""
			select * from courses where id=?;
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, 
				course.getId(), course.getName(), course.getAuthor());
	}
	
	public void delete(Long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(Long id) {
		//ResultSet --> Bean => Row Mapper
		return springJdbcTemplate.queryForObject(SELECT_QUERY, 
				new BeanPropertyRowMapper<>(Course.class), id);
	}
}
