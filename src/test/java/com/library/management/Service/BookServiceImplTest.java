package com.library.management.Service;

import com.library.management.model.Book;
import com.library.management.model.BookIssue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

    private static final String bookId = "15";
    private static final Book newBook = Book.builder()
            .bookName("Maths")
            .bookIssue(BookIssue.builder()
                    .issueDate(new Date())
                    .isIssued(true)
                    .issuedTo("Manisha")
                    .build())
            .id(bookId)
            .author("RD Sharma")
            .build();
    private static final List<Book> newBooks = new ArrayList<Book>();


    @Mock
    BookRepository bookRepository;

    BookServiceImpl bookServiceImpl;


    @BeforeEach
    public void init(){
        this.bookServiceImpl=new BookServiceImpl(bookRepository);

    }

    @Test
    public void testAddBook(){
        when(bookRepository.save(any(Book.class))).thenReturn(newBook);
        Book bookAdded = bookServiceImpl.addBook(newBook);
        assertEquals(newBook.bookName, bookAdded.bookName);
        assertEquals(newBook.bookIssue.issuedTo,bookAdded.bookIssue.issuedTo);
    }
    @Test
    public void testGetById(){
        when(bookRepository.findById(any(String.class))).thenReturn(Optional.ofNullable(newBook));
        Optional<Book> foundBook = bookServiceImpl.getById(bookId);
        assertEquals(bookId,foundBook.get().getId());
        assertEquals(newBook.bookName,foundBook.get().bookName);
        assertEquals(newBook.bookIssue.issuedTo, foundBook.get().bookIssue.issuedTo);

    }

    @Test
    public void testGetAllBooks(){
        newBooks.add(newBook);
        when(bookRepository.findAll()).thenReturn(newBooks);
        List<Book> foundBooks = bookRepository.findAll();
        assertEquals(newBooks.get(0).bookName,foundBooks.get(0).bookName);
        assertEquals(newBooks.get(0).bookIssue.issuedTo, foundBooks.get(0).bookIssue.issuedTo);
    }
}
