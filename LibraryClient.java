package com.niit.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext bf = new ClassPathXmlApplicationContext("book.xml");
		Library library = (Library)bf.getBean("library");
		
		//List of Books
		List bookList = (List) library.getBookList();
		//Lets print the properties of books 
		for(int i=0;i<bookList.size();i++)
		{
			System.out.println("**Book"+(i+1)+ "Properties");
			Book book = (Book) bookList.get(i);
			System.out.println("Book Title         :"+book.getTitle());
			System.out.println("Book Author         :"+book.getAuthor());
			System.out.println("Book Publications   :"+book.getPublications());
		}
		//Lets print the Primitives
		List stringList = (List) library.getStringList();
		System.out.println("Primitives set to list :"+stringList);
	}

}
