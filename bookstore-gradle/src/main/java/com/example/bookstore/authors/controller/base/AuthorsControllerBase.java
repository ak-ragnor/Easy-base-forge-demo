package com.example.bookstore.authors.controller.base;

import com.example.bookstore.authors.delegate.AuthorsApiDelegate;
import com.example.bookstore.authors.dto.AuthorDTO;
import com.example.bookstore.authors.dto.CreateAuthorRequest;
import com.example.bookstore.authors.dto.UpdateAuthorRequest;
import com.example.bookstore.common.ApiPageResponse;
import com.example.bookstore.common.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public abstract class AuthorsControllerBase {
    private final AuthorsApiDelegate delegate;

    protected AuthorsControllerBase(AuthorsApiDelegate delegate) {
        this.delegate = delegate;
    }

    protected AuthorsApiDelegate getDelegate() {
        return delegate;
    }

    @GetMapping("/authors")
    public ApiPageResponse<AuthorDTO> listAuthors(
            @RequestParam(value = "nationality", required = false) String nationality,
            @RequestParam(value = "genre", required = false) String genre, Pageable pageable) {
        return delegate.listAuthors(nationality, genre, pageable);
    }

    @PostMapping("/authors")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<AuthorDTO> createAuthor(
            @Valid @RequestBody(required = true) CreateAuthorRequest createAuthorRequest) {
        return delegate.createAuthor(createAuthorRequest);
    }

    @GetMapping("/authors/{id}")
    public ApiResponse<AuthorDTO> getAuthor(@PathVariable("id") Long id) {
        return delegate.getAuthor(id);
    }

    @PutMapping("/authors/{id}")
    public ApiResponse<AuthorDTO> updateAuthor(@PathVariable("id") Long id,
            @Valid @RequestBody(required = true) UpdateAuthorRequest updateAuthorRequest) {
        return delegate.updateAuthor(id, updateAuthorRequest);
    }

    @DeleteMapping("/authors/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuthor(@PathVariable("id") Long id) {
        delegate.deleteAuthor(id);
    }
}
