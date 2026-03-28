package com.example.bookstore.books.delegate.impl.base;

import com.example.bookstore.books.delegate.BooksApiDelegate;
import com.example.bookstore.books.dto.BookDTO;
import com.example.bookstore.books.dto.BookEdition;
import com.example.bookstore.books.dto.CreateBookRequest;
import com.example.bookstore.books.dto.PatchBookRequest;
import com.example.bookstore.books.dto.UpdateBookRequest;
import com.example.bookstore.common.ApiPageResponse;
import com.example.bookstore.common.ApiResponse;
import org.springframework.data.domain.Pageable;

public abstract class BooksApiDelegateImplBase implements BooksApiDelegate {
    @Override
    public ApiPageResponse<BookDTO> listBooks(String genre, Long authorId, Boolean available,
            String language, Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<BookDTO> createBook(CreateBookRequest createBookRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<BookDTO> getBook(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<BookDTO> updateBook(Long id, UpdateBookRequest updateBookRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void deleteBook(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<BookDTO> patchBook(Long id, PatchBookRequest patchBookRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<BookEdition> getBookEdition(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
