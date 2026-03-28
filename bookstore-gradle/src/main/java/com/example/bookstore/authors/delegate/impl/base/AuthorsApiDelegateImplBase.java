package com.example.bookstore.authors.delegate.impl.base;

import com.example.bookstore.authors.delegate.AuthorsApiDelegate;
import com.example.bookstore.authors.dto.AuthorDTO;
import com.example.bookstore.authors.dto.CreateAuthorRequest;
import com.example.bookstore.authors.dto.UpdateAuthorRequest;
import com.example.bookstore.common.ApiPageResponse;
import com.example.bookstore.common.ApiResponse;
import org.springframework.data.domain.Pageable;

public abstract class AuthorsApiDelegateImplBase implements AuthorsApiDelegate {
    @Override
    public ApiPageResponse<AuthorDTO> listAuthors(String nationality, String genre,
            Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<AuthorDTO> createAuthor(CreateAuthorRequest createAuthorRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<AuthorDTO> getAuthor(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ApiResponse<AuthorDTO> updateAuthor(Long id, UpdateAuthorRequest updateAuthorRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void deleteAuthor(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
