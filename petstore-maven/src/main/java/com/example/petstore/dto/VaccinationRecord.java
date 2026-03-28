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
public class VaccinationRecord extends MedicalHistoryEntry {
    @NotBlank
    @JsonProperty("recordType")
    private String recordType;

    @NotBlank
    @Size(
            min = 1
    )
    @JsonProperty("vaccineName")
    private String vaccineName;

    @NotBlank
    @JsonProperty("date")
    private LocalDate date;

    @Nullable
    @JsonProperty("vetName")
    private String vetName;
}
