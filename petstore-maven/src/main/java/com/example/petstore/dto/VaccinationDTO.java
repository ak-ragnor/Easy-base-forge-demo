package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class VaccinationDTO {
    @JsonProperty(
            value = "id",
            access = JsonProperty.Access.READ_ONLY
    )
    private UUID id;

    @JsonProperty("vaccineName")
    private String vaccineName;

    @JsonProperty("administeredDate")
    private LocalDate administeredDate;

    @Nullable
    @JsonProperty("nextDueDate")
    private LocalDate nextDueDate;

    @Nullable
    @JsonProperty("vetName")
    private String vetName;

    @Nullable
    @JsonProperty("batchNumber")
    private String batchNumber;
}
