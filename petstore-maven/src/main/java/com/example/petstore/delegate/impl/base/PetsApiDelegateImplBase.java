package com.example.petstore.delegate.impl.base;

import com.example.petstore.delegate.PetsApiDelegate;
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

public abstract class PetsApiDelegateImplBase implements PetsApiDelegate {
    @Override
    public ResponseEntity<Page<PetDTO>> listPets(String status, String species, Long ownerId,
            Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<PetDTO> createPet(CreatePetRequest createPetRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<PetDTO> getPet(UUID id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<PetDTO> updatePet(UUID id, UpdatePetRequest updatePetRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> deletePet(UUID id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<PetDTO> patchPet(UUID id, PatchPetRequest patchPetRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<VaccinationDTO> addVaccination(UUID id,
            AddVaccinationRequest addVaccinationRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<MedicalHistoryEntry> getPetMedicalHistory(UUID id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Object> listPetEvents(UUID id) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
