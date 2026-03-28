package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class AudioEdition extends BookEdition {
    @NotBlank
    @JsonProperty("editionType")
    private String editionType;

    @NotNull
    @Min(1L)
    @JsonProperty("durationMinutes")
    private Integer durationMinutes;

    @NotBlank
    @Size(
            min = 1,
            max = 200
    )
    @JsonProperty("narrator")
    private String narrator;

    @Nullable
    @JsonProperty("audioFormat")
    private String audioFormat;
}
