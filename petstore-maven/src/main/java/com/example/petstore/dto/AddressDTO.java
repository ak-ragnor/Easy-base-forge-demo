package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@Data
public class AddressDTO {
    @NotBlank
    @Size(
            min = 1,
            max = 200
    )
    @JsonProperty("street")
    private String street;

    @NotBlank
    @Size(
            min = 1,
            max = 100
    )
    @JsonProperty("city")
    private String city;

    @Nullable
    @Size(
            max = 100
    )
    @JsonProperty("state")
    private String state;

    @Nullable
    @Pattern(
            regexp = "^\\d{5}(-\\d{4})?$"
    )
    @JsonProperty("zipCode")
    private String zipCode;

    @NotBlank
    @Size(
            min = 2,
            max = 2
    )
    @JsonProperty("country")
    private String country;
}
