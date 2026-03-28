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
public class SurgeryRecord extends MedicalHistoryEntry {
    @NotBlank
    @JsonProperty("recordType")
    private String recordType;

    @NotBlank
    @Size(
            min = 1,
            max = 300
    )
    @JsonProperty("procedure")
    private String procedure;

    @NotBlank
    @JsonProperty("date")
    private LocalDate date;

    @Nullable
    @JsonProperty("surgeonName")
    private String surgeonName;

    @Nullable
    @Size(
            max = 1000
    )
    @JsonProperty("notes")
    private String notes;

    @JsonProperty("successful")
    private Boolean successful;
}
