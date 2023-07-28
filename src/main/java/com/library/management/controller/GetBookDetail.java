package com.library.management.controller;

import com.library.management.Service.BookService;
import com.library.management.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library/books")

public class GetBookDetail {
    private BookService bookService;

    @Autowired
    public GetBookDetail(BookService bookService){
        this.bookService= bookService;
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookDetailsById (@PathVariable("id") String bookId){
        return  bookService.getById(bookId);

    }
    @GetMapping()
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

}
