package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class PatchPetRequest {
    @Nullable
    @Size(
            min = 1,
            max = 100
    )
    @JsonProperty("name")
    private String name;

    @Nullable
    @JsonProperty("species")
    private String species;

    @Nullable
    @Size(
            max = 100
    )
    @JsonProperty("breed")
    private String breed;

    @Nullable
    @JsonProperty("status")
    private String status;

    @Nullable
    @Min(0L)
    @Max(999L)
    @JsonProperty("weightKg")
    private Float weightKg;

    @Nullable
    @JsonProperty("ownerId")
    private Long ownerId;
}
