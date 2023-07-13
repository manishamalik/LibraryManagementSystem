package com.library.management.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    public int bookId;
    public String bookName;
    public  String author;
    public String category;
    public BookIssue bookissue;
    public boolean isAvailable;

}
