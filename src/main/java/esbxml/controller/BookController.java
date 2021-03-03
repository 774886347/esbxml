package esbxml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esbxml.domain.Book;
import esbxml.domain.ListWrapper;
import esbxml.service.BookService;

/**
 * 
 */
@RestController
@RequestMapping("/bookController")
public class BookController
{
	@Autowired
	private BookService bookService;
	@PostMapping(value = "/books")
	public ResponseEntity<ListWrapper<Book>> addBook(@RequestBody Book book)
	{
		// 调用Service组件的方法添加Book对象
		bookService.addBook(book);
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_ENCODING, "UTF-8");
		headers.add(HttpHeaders.CONTENT_TYPE, "application/xml");
		// 调用Service组件的getAllBooks()方法返回全部Book实例
		return new ResponseEntity<>(new ListWrapper<>(bookService.getAllBooks()), headers ,
				HttpStatus.OK);
	}
}
