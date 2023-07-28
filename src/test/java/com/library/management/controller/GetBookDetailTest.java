package com.library.management.controller;


import com.library.management.Service.BookService;
import com.library.management.model.Book;
import com.library.management.model.BookIssue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GetBookDetailTest {

    private static final Book newBook = Book.builder()
            .bookName("ABC")
            .author("newAuthor")
            .id("1")
            .category("Fiction")
            .bookIssue(BookIssue.builder()
                    .issuedTo("Kuhu")
                    .isIssued(true)
                    .issueDate(new Date()).build())
            .build();
    private static final List<Book> newBooks = new ArrayList<Book>();


    @Mock
    BookService bookService;

    GetBookDetail getBookDetails;

    @BeforeEach
    public void init(){
        this.getBookDetails =new GetBookDetail(bookService);
    }

    @Test
    public void testGetBookDetailsById() {
        Optional<Book> books = Optional.ofNullable(newBook);
        when(bookService.getById("1")).thenReturn(books);

        Optional<Book> actual = getBookDetails.getBookDetailsById("1");
        Assertions.assertEquals(books,actual);
    }

    @Test
    public void testGetAllBookDetails(){
        newBooks.add(newBook);
        when(bookService.getAllBooks()).thenReturn(newBooks);
        List<Book> actual = getBookDetails.getAllBook();
        Assertions.assertEquals(newBooks,actual);

    }





}
