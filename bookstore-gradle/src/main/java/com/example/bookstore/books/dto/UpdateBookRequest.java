package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class UpdateBookRequest {
    @NotBlank
    @Size(
            min = 1,
            max = 300
    )
    @JsonProperty("title")
    private String title;

    @NotBlank
    @Pattern(
            regexp = "^\\d{3}-\\d{10}$"
    )
    @JsonProperty("isbn")
    private String isbn;

    @NotBlank
    @JsonProperty("genre")
    private String genre;

    @NotBlank
    @Size(
            min = 2,
            max = 10
    )
    @JsonProperty("language")
    private String language;

    @NotNull
    @Min(1L)
    @Max(10000L)
    @JsonProperty("pageCount")
    private Integer pageCount;

    @JsonProperty("available")
    private Boolean available;

    @Nullable
    @Size(
            max = 500
    )
    @JsonProperty("coverUrl")
    private String coverUrl;

    @NotNull
    @JsonProperty("authorId")
    private Long authorId;
}
