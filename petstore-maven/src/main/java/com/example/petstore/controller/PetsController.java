package com.example.petstore.controller;

import com.example.petstore.controller.base.PetsControllerBase;
import com.example.petstore.delegate.PetsApiDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = "*"
)
@Slf4j
@RestController
public class PetsController extends PetsControllerBase {
    public PetsController(PetsApiDelegate delegate) {
        super(delegate);
    }
}
