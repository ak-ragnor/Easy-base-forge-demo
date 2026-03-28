package com.example.bookstore.books.delegate;

import com.example.bookstore.books.dto.BookDTO;
import com.example.bookstore.books.dto.BookEdition;
import com.example.bookstore.books.dto.CreateBookRequest;
import com.example.bookstore.books.dto.PatchBookRequest;
import com.example.bookstore.books.dto.UpdateBookRequest;
import com.example.bookstore.common.ApiPageResponse;
import com.example.bookstore.common.ApiResponse;
import org.springframework.data.domain.Pageable;

public interface BooksApiDelegate {
    ApiPageResponse<BookDTO> listBooks(String genre, Long authorId, Boolean available,
            String language, Pageable pageable);

    ApiResponse<BookDTO> createBook(CreateBookRequest createBookRequest);

    ApiResponse<BookDTO> getBook(Long id);

    ApiResponse<BookDTO> updateBook(Long id, UpdateBookRequest updateBookRequest);

    void deleteBook(Long id);

    ApiResponse<BookDTO> patchBook(Long id, PatchBookRequest patchBookRequest);

    ApiResponse<BookEdition> getBookEdition(Long id);
}
