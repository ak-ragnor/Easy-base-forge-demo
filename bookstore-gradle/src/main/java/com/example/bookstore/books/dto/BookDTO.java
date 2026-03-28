package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class BookDTO {
    @JsonProperty(
            value = "id",
            access = JsonProperty.Access.READ_ONLY
    )
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("genre")
    private String genre;

    @JsonProperty("language")
    private String language;

    @JsonProperty("pageCount")
    private Integer pageCount;

    @JsonProperty("available")
    private Boolean available;

    @JsonProperty(
            value = "featured",
            access = JsonProperty.Access.READ_ONLY
    )
    private Boolean featured;

    @Nullable
    @JsonProperty("coverUrl")
    private String coverUrl;

    @JsonProperty("authorId")
    private Long authorId;

    @JsonProperty(
            value = "publishedAt",
            access = JsonProperty.Access.READ_ONLY
    )
    private LocalDate publishedAt;

    @JsonProperty(
            value = "createdAt",
            access = JsonProperty.Access.READ_ONLY
    )
    private OffsetDateTime createdAt;
}
