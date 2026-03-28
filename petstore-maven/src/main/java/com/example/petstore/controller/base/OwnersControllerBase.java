package com.example.petstore.controller.base;

import com.example.petstore.delegate.OwnersApiDelegate;
import com.example.petstore.dto.CreateOwnerRequest;
import com.example.petstore.dto.OwnerDTO;
import com.example.petstore.dto.PetDTO;
import com.example.petstore.dto.UpdateOwnerRequest;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
public abstract class OwnersControllerBase {
    private final OwnersApiDelegate delegate;

    protected OwnersControllerBase(OwnersApiDelegate delegate) {
        this.delegate = delegate;
    }

    protected OwnersApiDelegate getDelegate() {
        return delegate;
    }

    /**
     * <pre>curl -X GET http://localhost:8080/owners</pre>
     */
    @GetMapping("/owners")
    public ResponseEntity<Page<OwnerDTO>> listOwners(
            @RequestParam(value = "city", required = false) String city, Pageable pageable) {
        return delegate.listOwners(city, pageable);
    }

    /**
     * <pre>curl -X POST http://localhost:8080/owners \
     *   -H 'Content-Type: application/json' \
     *   -d '{}'</pre>
     */
    @PostMapping("/owners")
    public ResponseEntity<OwnerDTO> createOwner(
            @Valid @RequestBody(required = true) CreateOwnerRequest createOwnerRequest) {
        return delegate.createOwner(createOwnerRequest);
    }

    /**
     * <pre>curl -X GET http://localhost:8080/owners/{id}</pre>
     */
    @GetMapping("/owners/{id}")
    public ResponseEntity<OwnerDTO> getOwner(@PathVariable("id") Long id) {
        return delegate.getOwner(id);
    }

    /**
     * <pre>curl -X PUT http://localhost:8080/owners/{id} \
     *   -H 'Content-Type: application/json' \
     *   -d '{}'</pre>
     */
    @PutMapping("/owners/{id}")
    public ResponseEntity<OwnerDTO> updateOwner(@PathVariable("id") Long id,
            @Valid @RequestBody(required = true) UpdateOwnerRequest updateOwnerRequest) {
        return delegate.updateOwner(id, updateOwnerRequest);
    }

    /**
     * <pre>curl -X DELETE http://localhost:8080/owners/{id}</pre>
     */
    @DeleteMapping("/owners/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable("id") Long id) {
        return delegate.deleteOwner(id);
    }

    /**
     * <pre>curl -X GET http://localhost:8080/owners/{id}/pets</pre>
     */
    @GetMapping("/owners/{id}/pets")
    public ResponseEntity<Page<PetDTO>> listOwnerPets(@PathVariable("id") Long id,
            Pageable pageable) {
        return delegate.listOwnerPets(id, pageable);
    }
}
