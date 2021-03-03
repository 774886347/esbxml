package esbxml.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import esbxml.domain.Book;
import esbxml.service.BookService;

/**
 * 
 */
@Service
public class BookServiceImpl implements BookService
{
	private static List<Book> bookList = Collections
		.synchronizedList(new ArrayList<>());
	private static Integer nextId = 1;
	@Override
	public Integer addBook(Book book)
	{
		// 使用nextId作为Book的id
		book.setId(nextId++);
		bookList.add(book);
		System.out.println(bookList);
		return book.getId();
	}
	@Override
	public List<Book> getAllBooks()
	{
		return Collections.unmodifiableList(bookList);
	}
}
