package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DigitalEdition extends BookEdition {
    @NotBlank
    @JsonProperty("editionType")
    private String editionType;

    @NotBlank
    @JsonProperty("format")
    private String format;

    @NotNull
    @Min(0L)
    @JsonProperty("fileSizeMb")
    private Float fileSizeMb;

    @JsonProperty("drm")
    private Boolean drm;
}
