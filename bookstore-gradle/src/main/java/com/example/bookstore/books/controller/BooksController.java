package com.example.bookstore.books.controller;

import com.example.bookstore.books.controller.base.BooksControllerBase;
import com.example.bookstore.books.delegate.BooksApiDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = "https://app.example.com"
)
@Slf4j
@RestController
public class BooksController extends BooksControllerBase {
    public BooksController(BooksApiDelegate delegate) {
        super(delegate);
    }
}
