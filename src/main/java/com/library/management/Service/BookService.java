package com.library.management.Service;

import com.library.management.model.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);

     List<Book> getAllBooks();

    Book getById(String id);

    void deleteBook(String id);
}
