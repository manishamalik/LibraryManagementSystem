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
import java.util.Date;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AddBookDetailsTest {

    private static final Book newBook = Book.builder()
            .bookName("ABC")
            .bookIssue(BookIssue.builder().isIssued(true)
                    .issueDate(new Date())
                    .issuedTo("Mysha")
                    .build())
            .author("new Author")
            .id("1")
            .build();

    @Mock BookService bookService;

    AddBookDetails addBookDetails;

    @BeforeEach
    public void init() {
        this.addBookDetails = new AddBookDetails(bookService);
    }

    @Test
    public void testAddBook() throws Exception {

        when(bookService.addBook(any(Book.class))).thenReturn(newBook);

        Book actual = addBookDetails.addBook(newBook);

        Assertions.assertEquals(newBook, actual);

    }
}
