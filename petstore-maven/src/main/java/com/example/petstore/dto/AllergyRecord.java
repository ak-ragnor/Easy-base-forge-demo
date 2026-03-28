package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
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
public class AllergyRecord extends MedicalHistoryEntry {
    @NotBlank
    @JsonProperty("recordType")
    private String recordType;

    @NotBlank
    @Size(
            min = 1
    )
    @JsonProperty("allergen")
    private String allergen;

    @Nullable
    @JsonProperty("severity")
    private String severity;

    @NotBlank
    @JsonProperty("diagnosedDate")
    private LocalDate diagnosedDate;

    @Nullable
    @Size(
            max = 500
    )
    @JsonProperty("notes")
    private String notes;
}
