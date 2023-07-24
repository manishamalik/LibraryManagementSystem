package com.library.management.model;

import java.util.Date;
import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
public class BookIssue {
    public boolean isIssued;
    public Date issueDate;
    public String issuedTo;

}
