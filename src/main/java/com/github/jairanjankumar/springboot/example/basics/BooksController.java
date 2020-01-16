package com.github.jairanjankumar.springboot.example.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(10L, "Some Auther", "Some Book" ));
    }
}
