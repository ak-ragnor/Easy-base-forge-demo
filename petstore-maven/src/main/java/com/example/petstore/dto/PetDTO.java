package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class PetDTO {
    @JsonProperty(
            value = "id",
            access = JsonProperty.Access.READ_ONLY
    )
    private UUID id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("species")
    private String species;

    @Nullable
    @JsonProperty("breed")
    private String breed;

    @JsonProperty("status")
    private String status;

    @Nullable
    @JsonProperty("birthDate")
    private LocalDate birthDate;

    @Nullable
    @JsonProperty("weightKg")
    private Float weightKg;

    @Nullable
    @JsonProperty("microchipNumber")
    private String microchipNumber;

    @Nullable
    @JsonProperty("ownerId")
    private Long ownerId;

    @JsonProperty(
            value = "createdAt",
            access = JsonProperty.Access.READ_ONLY
    )
    private OffsetDateTime createdAt;

    @JsonProperty(
            value = "updatedAt",
            access = JsonProperty.Access.READ_ONLY
    )
    private OffsetDateTime updatedAt;
}
