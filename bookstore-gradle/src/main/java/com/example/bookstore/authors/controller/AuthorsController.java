package com.example.bookstore.authors.controller;

import com.example.bookstore.authors.controller.base.AuthorsControllerBase;
import com.example.bookstore.authors.delegate.AuthorsApiDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = "https://app.example.com"
)
@Slf4j
@RestController
public class AuthorsController extends AuthorsControllerBase {
    public AuthorsController(AuthorsApiDelegate delegate) {
        super(delegate);
    }
}
