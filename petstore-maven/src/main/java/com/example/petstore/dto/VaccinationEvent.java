package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import lombok.Data;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class VaccinationEvent {
    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("vaccineName")
    private String vaccineName;

    @JsonProperty("administeredAt")
    private OffsetDateTime administeredAt;
}
