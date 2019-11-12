package com.cg.jpacrud.client;

import java.util.Scanner;

import com.cg.jpacrud.entities.Book;
import com.cg.jpacrud.service.BookService;
import com.cg.jpacrud.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		System.out.println(); 
		
		
		System.out.println("************Listing book with id 2*************");
		System.out.println("Book with ID 2:"+service.getBookById(2));
		System.out.println();
		
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		System.out.println();

		
		System.out.println("************Listing book written by Author*************");
		System.out.println("Enter author:");
		String auth=sc.next();
		for(Book book:service.getAuthorBooks(auth) ) {
			System.out.println(book);
		}
		System.out.println();

		
		System.out.println("************Listing book on title*************");
		System.out.println("Enter title:");
		String til=sc.next();
		for(Book book:service.getBookByTitle(til)) {
			System.out.println(book);
		}
		System.out.println();

		
		
		System.out.println("************Listing All books between high and low*************");
		System.out.println("Enter low end:");
		Double lo=sc.nextDouble();
		System.out.println("Enter high end:");
		Double hi=sc.nextDouble();
		for(Book book:service.getBooksInPriceRange(lo, hi) ) {
			System.out.println(book);
		}
		
		
		
		

	}
}
