package com.library.management.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection = "Books")
@Builder(toBuilder = true)
public class Book {
    @Id
    public String id;
    public String bookName;
    public  String author;
    public String category;
    @Field("bookIssue")
    public BookIssue bookIssue;
    public boolean isAvailable;

}
