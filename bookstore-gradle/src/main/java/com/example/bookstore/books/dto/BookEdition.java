package com.example.bookstore.books.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "editionType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PhysicalEdition.class, name = "physical"),
        @JsonSubTypes.Type(value = DigitalEdition.class, name = "digital"),
        @JsonSubTypes.Type(value = AudioEdition.class, name = "audio")
})
public abstract class BookEdition {
}
