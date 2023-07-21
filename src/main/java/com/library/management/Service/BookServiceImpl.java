package com.library.management.Service;

import com.library.management.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        System.out.println(book.bookId +" has been added");
        return bookRepository.save(book);
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @Override
    public Book getById(String id){
        return bookRepository.findById(id).orElse(null);
    }
    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }


}
