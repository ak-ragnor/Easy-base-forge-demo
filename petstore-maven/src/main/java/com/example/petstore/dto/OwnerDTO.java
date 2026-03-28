package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class OwnerDTO {
    @JsonProperty(
            value = "id",
            access = JsonProperty.Access.READ_ONLY
    )
    private Long id;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @Email
    @JsonProperty("email")
    private String email;

    @Nullable
    @JsonProperty("phone")
    private String phone;

    @JsonProperty("address")
    private AddressDTO address;

    @JsonProperty(
            value = "petCount",
            access = JsonProperty.Access.READ_ONLY
    )
    private Integer petCount;

    @JsonProperty(
            value = "createdAt",
            access = JsonProperty.Access.READ_ONLY
    )
    private OffsetDateTime createdAt;
}
