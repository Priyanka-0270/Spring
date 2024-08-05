package com.example.demo;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class Xmldemo {
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("xml.config");
	    Movie movie = (Movie)context.getBean("movie");
	     System.out.println(movie);
	    }
	}
