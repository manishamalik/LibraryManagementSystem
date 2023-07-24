package com.library.management.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Books")
public class Book {
    @Id
    public int bookId;
    public String bookName;
    public  String author;
    public String category;
    @Field("bookIssue")
    public BookIssue bookIssue;
    public boolean isAvailable;

}
