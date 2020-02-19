package com.training.firstwebproject.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.training.firstwebproject.model.Author;
import com.training.firstwebproject.model.Book;
import com.training.firstwebproject.model.Publisher;
import com.training.firstwebproject.repository.AuthorRepository;
import com.training.firstwebproject.repository.BookRepository;
import com.training.firstwebproject.repository.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PublisherRepository publisherRespository;
//	 public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
//	        this.authorRepository = authorRepository;
//	        this.bookRepository = bookRepository;
//	    }
	
	@Override
	public void run(String... args) throws Exception {
		Author jk = new Author("J.K.", "Rowling");
		Book hp1 = new Book("Harry Potter and sorcerer's stone", "9788700631625");
		Book hp2 = new Book("Harry Potter and chamber of secrets", "9788700631625");
		Publisher bbm = new Publisher("bloomsbury","london","ad","dssa","552");
		publisherRespository.save(bbm);
		hp1.getAuthors().add(jk);
		hp1.setPublisher(bbm);
		bbm.getBooks().add(hp1);
		hp2.getAuthors().add(jk);
		hp2.setPublisher(bbm);
		bbm.getBooks().add(hp2);
		jk.getBooks().add(hp2);
		authorRepository.save(jk);
		bookRepository.save(hp1);
		bookRepository.save(hp2);
		publisherRespository.save(bbm);
		System.out.println("Number of books::"+bookRepository.count());
		System.out.println("Number of books by publishers::"+bbm.getBooks().size());
		
	}

}
