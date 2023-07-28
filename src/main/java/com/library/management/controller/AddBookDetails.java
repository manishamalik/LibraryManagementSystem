package com.library.management.controller;

import com.library.management.Service.BookService;
import com.library.management.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/AddBook")
public class AddBookDetails {

    BookService bookService;
    @Autowired
    public AddBookDetails(BookService bookService){
        this.bookService= bookService;
    }


    @PostMapping("/")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
}
