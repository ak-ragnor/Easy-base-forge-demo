package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class PatchBookRequest {
    @Nullable
    @Size(
            min = 1,
            max = 300
    )
    @JsonProperty("title")
    private String title;

    @Nullable
    @JsonProperty("genre")
    private String genre;

    @Nullable
    @JsonProperty("available")
    private Boolean available;

    @Nullable
    @Size(
            max = 500
    )
    @JsonProperty("coverUrl")
    private String coverUrl;
}
