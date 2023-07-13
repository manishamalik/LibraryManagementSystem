package com.library.management.controller;

import com.library.management.Service.BookServiceImpl;
import com.library.management.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/AddBook")
public class AddBookDetails {

    BookServiceImpl bookServiceImpl;
    @Autowired
    public AddBookDetails(BookServiceImpl bookServiceImpl){
        this.bookServiceImpl= bookServiceImpl;
    }


    @PostMapping("/")
    public String addBook(@RequestBody Book book){
        bookServiceImpl.addBook(book);

        return "BookAdded";
    }
}
