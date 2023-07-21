package com.library.management.controller;

import com.library.management.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/books")
public class DeleteBook {
    BookService bookService;

    @Autowired
    public DeleteBook(BookService bookService){
        this.bookService=bookService;
    }

    @DeleteMapping("/{id}")
    public String DeleteBookById(@PathVariable("id") String id){
       bookService.deleteBook(id);
       return ("Book id " +id+" has been deleted" );
    }

}
