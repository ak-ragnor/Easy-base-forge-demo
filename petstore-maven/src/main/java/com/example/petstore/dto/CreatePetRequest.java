package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class CreatePetRequest {
    @NotBlank
    @Size(
            min = 1,
            max = 100
    )
    @JsonProperty("name")
    private String name;

    @NotBlank
    @JsonProperty("species")
    private String species;

    @Nullable
    @Size(
            max = 100
    )
    @JsonProperty("breed")
    private String breed;

    @NotBlank
    @JsonProperty("status")
    private String status;

    @Nullable
    @JsonProperty("birthDate")
    private LocalDate birthDate;

    @Nullable
    @Min(0L)
    @Max(999L)
    @JsonProperty("weightKg")
    private Float weightKg;

    @Nullable
    @Pattern(
            regexp = "^[0-9]{15}$"
    )
    @JsonProperty("microchipNumber")
    private String microchipNumber;

    @Nullable
    @JsonProperty("ownerId")
    private Long ownerId;
}
