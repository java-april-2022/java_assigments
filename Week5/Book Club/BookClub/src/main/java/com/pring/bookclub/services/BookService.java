package com.pring.bookclub.services;

import java.util.List;	
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pring.bookclub.models.Book;
import com.pring.bookclub.models.User;
import com.pring.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bRepo;
	
	public List<Book> getAllBooks(){
		return bRepo.findAll();
	}
	
	public List<Book> getByUser(User user){
		return bRepo.findAllByUser(user);
	}
	
	public Book getById(Long id) {
		Optional<Book> potentialBook = bRepo.findById(id);
		if (potentialBook.isPresent()) {
			return potentialBook.get();
		}
		System.out.println("BookService: book not found");
		return null;
	}
	
	public Book update(Book book) {
		return bRepo.save(book);
	}
	
	public Book create(Book book) {
		return bRepo.save(book);
	}
	
	public void delete(Book book) {
		bRepo.delete(book);
	}
}
