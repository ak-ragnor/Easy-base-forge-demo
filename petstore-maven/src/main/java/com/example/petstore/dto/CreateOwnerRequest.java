package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class CreateOwnerRequest {
    @NotBlank
    @Size(
            min = 1,
            max = 50
    )
    @JsonProperty("firstName")
    private String firstName;

    @NotBlank
    @Size(
            min = 1,
            max = 50
    )
    @JsonProperty("lastName")
    private String lastName;

    @NotBlank
    @Email
    @JsonProperty("email")
    private String email;

    @Nullable
    @Pattern(
            regexp = "^\\+?[0-9]{7,15}$"
    )
    @JsonProperty("phone")
    private String phone;

    @NotNull
    @JsonProperty("address")
    private AddressDTO address;
}
