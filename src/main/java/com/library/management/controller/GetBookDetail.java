package com.library.management.controller;

import com.library.management.Service.BookService;
import com.library.management.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/books")

public class GetBookDetail {
    private BookService bookService;

    @Autowired
    public GetBookDetail(BookService bookService){
        this.bookService= bookService;
    }

    @GetMapping("/{id}")
    public Book GetBookDetailsById (@PathVariable("id") String bookId){
        return  bookService.getById(bookId);
        //return ("Book Details corresponding to id "+bookId +" : "  );
    }
    @GetMapping()
    public List<Book> GetAllBook(){
        return bookService.getAllBooks();
    }

}
