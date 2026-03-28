package com.example.petstore.controller.base;

import com.example.petstore.delegate.PetsApiDelegate;
import com.example.petstore.dto.AddVaccinationRequest;
import com.example.petstore.dto.CreatePetRequest;
import com.example.petstore.dto.MedicalHistoryEntry;
import com.example.petstore.dto.PatchPetRequest;
import com.example.petstore.dto.PetDTO;
import com.example.petstore.dto.UpdatePetRequest;
import com.example.petstore.dto.VaccinationDTO;
import jakarta.validation.Valid;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
public abstract class PetsControllerBase {
    private final PetsApiDelegate delegate;

    protected PetsControllerBase(PetsApiDelegate delegate) {
        this.delegate = delegate;
    }

    protected PetsApiDelegate getDelegate() {
        return delegate;
    }

    /**
     * <pre>curl -X GET http://localhost:8080/pets</pre>
     */
    @GetMapping("/pets")
    public ResponseEntity<Page<PetDTO>> listPets(
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "species", required = false) String species,
            @RequestParam(value = "ownerId", required = false) Long ownerId, Pageable pageable) {
        return delegate.listPets(status, species, ownerId, pageable);
    }

    /**
     * <pre>curl -X POST http://localhost:8080/pets \
     *   -H 'Content-Type: application/json' \
     *   -d '{}'</pre>
     */
    @PostMapping("/pets")
    public ResponseEntity<PetDTO> createPet(
            @Valid @RequestBody(required = true) CreatePetRequest createPetRequest) {
        return delegate.createPet(createPetRequest);
    }

    /**
     * <pre>curl -X GET http://localhost:8080/pets/{id}</pre>
     */
    @GetMapping("/pets/{id}")
    public ResponseEntity<PetDTO> getPet(@PathVariable("id") UUID id) {
        return delegate.getPet(id);
    }

    /**
     * <pre>curl -X PUT http://localhost:8080/pets/{id} \
     *   -H 'Content-Type: application/json' \
     *   -d '{}'</pre>
     */
    @PutMapping("/pets/{id}")
    public ResponseEntity<PetDTO> updatePet(@PathVariable("id") UUID id,
            @Valid @RequestBody(required = true) UpdatePetRequest updatePetRequest) {
        return delegate.updatePet(id, updatePetRequest);
    }

    /**
     * <pre>curl -X DELETE http://localhost:8080/pets/{id}</pre>
     */
    @DeleteMapping("/pets/{id}")
    public ResponseEntity<Void> deletePet(@PathVariable("id") UUID id) {
        return delegate.deletePet(id);
    }

    /**
     * <pre>curl -X PATCH http://localhost:8080/pets/{id} \
     *   -H 'Content-Type: application/json' \
     *   -d '{}'</pre>
     */
    @PatchMapping("/pets/{id}")
    public ResponseEntity<PetDTO> patchPet(@PathVariable("id") UUID id,
            @Valid @RequestBody(required = true) PatchPetRequest patchPetRequest) {
        return delegate.patchPet(id, patchPetRequest);
    }

    /**
     * <pre>curl -X POST http://localhost:8080/pets/{id}/vaccinations \
     *   -H 'Content-Type: application/json' \
     *   -d '{}'</pre>
     */
    @PostMapping("/pets/{id}/vaccinations")
    public ResponseEntity<VaccinationDTO> addVaccination(@PathVariable("id") UUID id,
            @Valid @RequestBody(required = true) AddVaccinationRequest addVaccinationRequest) {
        return delegate.addVaccination(id, addVaccinationRequest);
    }

    /**
     * <pre>curl -X GET http://localhost:8080/pets/{id}/medical-history</pre>
     */
    @GetMapping("/pets/{id}/medical-history")
    public ResponseEntity<MedicalHistoryEntry> getPetMedicalHistory(@PathVariable("id") UUID id) {
        return delegate.getPetMedicalHistory(id);
    }

    /**
     * <pre>curl -X GET http://localhost:8080/pets/{id}/events</pre>
     */
    @GetMapping("/pets/{id}/events")
    public ResponseEntity<Object> listPetEvents(@PathVariable("id") UUID id) {
        return delegate.listPetEvents(id);
    }
}
