package com.example.bookstore.authors.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class UpdateAuthorRequest {
    @NotBlank
    @Size(
            min = 1,
            max = 100
    )
    @JsonProperty("firstName")
    private String firstName;

    @NotBlank
    @Size(
            min = 1,
            max = 100
    )
    @JsonProperty("lastName")
    private String lastName;

    @NotBlank
    @Email
    @JsonProperty("email")
    private String email;

    @Nullable
    @Size(
            max = 100
    )
    @JsonProperty("nationality")
    private String nationality;

    @Nullable
    @Size(
            max = 2000
    )
    @JsonProperty("bio")
    private String bio;

    @Nullable
    @Size(
            max = 300
    )
    @JsonProperty("websiteUrl")
    private String websiteUrl;
}
