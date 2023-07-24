package com.library.management.Service;

import com.library.management.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        System.out.println(book.id +" has been added");
        return bookRepository.save(book);
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @Override
    public Optional<Book> getById(String id){
        return bookRepository.findById(id);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }


}
