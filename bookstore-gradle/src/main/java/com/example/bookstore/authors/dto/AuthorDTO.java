package com.example.bookstore.authors.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class AuthorDTO {
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
    @JsonProperty("nationality")
    private String nationality;

    @Nullable
    @JsonProperty("birthYear")
    private Integer birthYear;

    @Nullable
    @JsonProperty("bio")
    private String bio;

    @Nullable
    @JsonProperty("websiteUrl")
    private String websiteUrl;

    @JsonProperty(
            value = "bookCount",
            access = JsonProperty.Access.READ_ONLY
    )
    private Integer bookCount;

    @JsonProperty(
            value = "createdAt",
            access = JsonProperty.Access.READ_ONLY
    )
    private OffsetDateTime createdAt;
}
