package com.library.management.Service;

import com.library.management.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String> {


        }