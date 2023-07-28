package com.library.management.model;

import java.util.Date;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
@Builder(toBuilder = true)
public class BookIssue {
    public boolean isIssued;
    public Date issueDate;
    public String issuedTo;

}
