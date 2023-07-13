package com.library.management.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library/books")

public class GetBookDetail {
    @GetMapping("/{id}")
    public String GetBookDetails (@PathVariable("id") Long bookId){

        return ("Book Details corresponding to id "+bookId +" : "  );

    }

}
