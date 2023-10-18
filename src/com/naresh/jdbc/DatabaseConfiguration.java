package com.naresh.jdbc;


	
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;

	@Configuration
	public class DatabaseConfiguration {
	  @Bean
	    public 	JdbcTemplate getJdbcTemplate() {
			DriverManagerDataSource dataSource=new DriverManagerDataSource();
			  
			dataSource.setUrl("Jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setUsername("system");
			 dataSource.setPassword("tiger");
			  
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			  return new JdbcTemplate(dataSource);
			  }
		
		
	}

