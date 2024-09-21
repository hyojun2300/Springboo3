package com._minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com._minutes.springboot.learn_jpa_and_hibernate.course.Course;
import com._minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com._minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1L, "Learn AWS Jpa!", "in28minutes"));
		repository.save(new Course(2L, "Learn AZure Jpa!", "in28minutes"));
		repository.save(new Course(3L, "Learn DevOps Jpa!", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));
		  
	}

}
