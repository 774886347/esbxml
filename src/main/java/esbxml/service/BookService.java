package esbxml.service;

import java.util.List;

import esbxml.domain.Book;

/**
 * 
 */
public interface BookService
{
	Integer addBook(Book book);

	List<Book> getAllBooks();
}
