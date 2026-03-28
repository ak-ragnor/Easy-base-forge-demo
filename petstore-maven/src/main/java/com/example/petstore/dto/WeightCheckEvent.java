package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class WeightCheckEvent {
    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("weightKg")
    private Float weightKg;

    @JsonProperty("measuredAt")
    private OffsetDateTime measuredAt;

    @Nullable
    @JsonProperty("measuredBy")
    private String measuredBy;
}
