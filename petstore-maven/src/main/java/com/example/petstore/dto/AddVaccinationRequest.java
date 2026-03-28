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
public class AddVaccinationRequest {
    @NotBlank
    @Size(
            min = 1,
            max = 200
    )
    @JsonProperty("vaccineName")
    private String vaccineName;

    @NotBlank
    @JsonProperty("administeredDate")
    private LocalDate administeredDate;

    @Nullable
    @JsonProperty("nextDueDate")
    private LocalDate nextDueDate;

    @Nullable
    @Size(
            max = 200
    )
    @JsonProperty("vetName")
    private String vetName;

    @Nullable
    @Size(
            max = 50
    )
    @JsonProperty("batchNumber")
    private String batchNumber;
}
