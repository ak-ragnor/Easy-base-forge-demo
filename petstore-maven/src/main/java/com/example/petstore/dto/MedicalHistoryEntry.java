package com.example.petstore.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "recordType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = VaccinationRecord.class, name = "vaccination"),
        @JsonSubTypes.Type(value = SurgeryRecord.class, name = "surgery"),
        @JsonSubTypes.Type(value = AllergyRecord.class, name = "allergy")
})
public abstract class MedicalHistoryEntry {
}
