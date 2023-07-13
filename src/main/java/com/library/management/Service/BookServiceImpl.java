package com.library.management.Service;

import com.library.management.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    public BookServiceImpl(){
    }

    @Override
    public void addBook(Book book) {
        System.out.println(book.bookId +" has been added");

    }

}
