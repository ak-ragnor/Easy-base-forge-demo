package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class PhysicalEdition extends BookEdition {
    @NotBlank
    @JsonProperty("editionType")
    private String editionType;

    @NotBlank
    @JsonProperty("bindingType")
    private String bindingType;

    @NotNull
    @Min(50L)
    @Max(5000L)
    @JsonProperty("weightGrams")
    private Integer weightGrams;

    @Nullable
    @JsonProperty("dimensions")
    private String dimensions;
}
