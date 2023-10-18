package com.naresh.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		   
		context.scan("com.naresh.*");
		      context.refresh();
		      StudentDbOperations dbOperation=context.getBean(StudentDbOperations.class);
		        int Inserted=dbOperation.addStudent(null);
		        System.out.println("Rows inserted:+Inserted");
		    
		        
		        int Inserted1=dbOperation.deleteStudent(null);
		         System.out.println("Rows delete:+Deleted");
		         
			
		 
	}

}
