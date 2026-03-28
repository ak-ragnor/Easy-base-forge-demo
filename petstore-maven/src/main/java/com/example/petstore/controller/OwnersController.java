package com.example.petstore.controller;

import com.example.petstore.controller.base.OwnersControllerBase;
import com.example.petstore.delegate.OwnersApiDelegate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = "*"
)
@Slf4j
@RestController
public class OwnersController extends OwnersControllerBase {
    public OwnersController(OwnersApiDelegate delegate) {
        super(delegate);
    }
}
