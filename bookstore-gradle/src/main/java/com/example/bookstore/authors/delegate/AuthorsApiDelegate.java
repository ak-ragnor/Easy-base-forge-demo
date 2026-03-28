package com.example.bookstore.authors.delegate;

import com.example.bookstore.authors.dto.AuthorDTO;
import com.example.bookstore.authors.dto.CreateAuthorRequest;
import com.example.bookstore.authors.dto.UpdateAuthorRequest;
import com.example.bookstore.common.ApiPageResponse;
import com.example.bookstore.common.ApiResponse;
import org.springframework.data.domain.Pageable;

public interface AuthorsApiDelegate {
    ApiPageResponse<AuthorDTO> listAuthors(String nationality, String genre, Pageable pageable);

    ApiResponse<AuthorDTO> createAuthor(CreateAuthorRequest createAuthorRequest);

    ApiResponse<AuthorDTO> getAuthor(Long id);

    ApiResponse<AuthorDTO> updateAuthor(Long id, UpdateAuthorRequest updateAuthorRequest);

    void deleteAuthor(Long id);
}
