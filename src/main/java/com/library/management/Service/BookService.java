package com.library.management.Service;

import com.library.management.model.Book;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);

    public List<Book> getAllBooks();

    public Book getById(String id);

    public void deleteBook(String id);
}
