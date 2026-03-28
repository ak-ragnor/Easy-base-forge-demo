package com.example.petstore.delegate;

import com.example.petstore.dto.AddVaccinationRequest;
import com.example.petstore.dto.CreatePetRequest;
import com.example.petstore.dto.MedicalHistoryEntry;
import com.example.petstore.dto.PatchPetRequest;
import com.example.petstore.dto.PetDTO;
import com.example.petstore.dto.UpdatePetRequest;
import com.example.petstore.dto.VaccinationDTO;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
public interface PetsApiDelegate {
    ResponseEntity<Page<PetDTO>> listPets(String status, String species, Long ownerId,
            Pageable pageable);

    ResponseEntity<PetDTO> createPet(CreatePetRequest createPetRequest);

    ResponseEntity<PetDTO> getPet(UUID id);

    ResponseEntity<PetDTO> updatePet(UUID id, UpdatePetRequest updatePetRequest);

    ResponseEntity<Void> deletePet(UUID id);

    ResponseEntity<PetDTO> patchPet(UUID id, PatchPetRequest patchPetRequest);

    ResponseEntity<VaccinationDTO> addVaccination(UUID id,
            AddVaccinationRequest addVaccinationRequest);

    ResponseEntity<MedicalHistoryEntry> getPetMedicalHistory(UUID id);

    ResponseEntity<Object> listPetEvents(UUID id);
}
