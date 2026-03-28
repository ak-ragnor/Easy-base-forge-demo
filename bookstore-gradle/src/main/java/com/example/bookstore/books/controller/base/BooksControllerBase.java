package com.example.bookstore.books.controller.base;

import com.example.bookstore.books.delegate.BooksApiDelegate;
import com.example.bookstore.books.dto.BookDTO;
import com.example.bookstore.books.dto.BookEdition;
import com.example.bookstore.books.dto.CreateBookRequest;
import com.example.bookstore.books.dto.PatchBookRequest;
import com.example.bookstore.books.dto.UpdateBookRequest;
import com.example.bookstore.common.ApiPageResponse;
import com.example.bookstore.common.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public abstract class BooksControllerBase {
    private final BooksApiDelegate delegate;

    protected BooksControllerBase(BooksApiDelegate delegate) {
        this.delegate = delegate;
    }

    protected BooksApiDelegate getDelegate() {
        return delegate;
    }

    @GetMapping("/books")
    public ApiPageResponse<BookDTO> listBooks(
            @RequestParam(value = "genre", required = false) String genre,
            @RequestParam(value = "authorId", required = false) Long authorId,
            @RequestParam(value = "available", required = false) Boolean available,
            @RequestParam(value = "language", required = false) String language,
            Pageable pageable) {
        return delegate.listBooks(genre, authorId, available, language, pageable);
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<BookDTO> createBook(
            @Valid @RequestBody(required = true) CreateBookRequest createBookRequest) {
        return delegate.createBook(createBookRequest);
    }

    @GetMapping("/books/{id}")
    public ApiResponse<BookDTO> getBook(@PathVariable("id") Long id) {
        return delegate.getBook(id);
    }

    @PutMapping("/books/{id}")
    public ApiResponse<BookDTO> updateBook(@PathVariable("id") Long id,
            @Valid @RequestBody(required = true) UpdateBookRequest updateBookRequest) {
        return delegate.updateBook(id, updateBookRequest);
    }

    @DeleteMapping("/books/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable("id") Long id) {
        delegate.deleteBook(id);
    }

    @PatchMapping("/books/{id}")
    public ApiResponse<BookDTO> patchBook(@PathVariable("id") Long id,
            @Valid @RequestBody(required = true) PatchBookRequest patchBookRequest) {
        return delegate.patchBook(id, patchBookRequest);
    }

    @GetMapping("/books/{id}/edition")
    public ApiResponse<BookEdition> getBookEdition(@PathVariable("id") Long id) {
        return delegate.getBookEdition(id);
    }
}
