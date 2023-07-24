package com.library.management.Service;

import com.library.management.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book addBook(Book book);

     List<Book> getAllBooks();

    Optional<Book> getById(String id);

    void deleteBook(String id);
}
