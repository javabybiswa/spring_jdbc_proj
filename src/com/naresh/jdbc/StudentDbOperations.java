package com.naresh.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDbOperations {

	@Autowired
	
	JdbcTemplate jdbcTemplate;
	
	 public int addStudent(Student student) {
		 String  query="insert into springjdbc values(892,'west indies',702)";
		     return jdbcTemplate.update(query);
	 }
	 
	  public int deleteStudent(Student student) {
		  String query="delete from springjdbc where cid=892";
		return jdbcTemplate.update(query);
	  }
}
