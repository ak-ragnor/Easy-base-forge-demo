package com.example.petstore.delegate.impl.base;

import com.example.petstore.delegate.OwnersApiDelegate;
import com.example.petstore.dto.CreateOwnerRequest;
import com.example.petstore.dto.OwnerDTO;
import com.example.petstore.dto.PetDTO;
import com.example.petstore.dto.UpdateOwnerRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public abstract class OwnersApiDelegateImplBase implements OwnersApiDelegate {
    @Override
    public ResponseEntity<Page<OwnerDTO>> listOwners(String city, Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<OwnerDTO> createOwner(CreateOwnerRequest createOwnerRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<OwnerDTO> getOwner(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<OwnerDTO> updateOwner(Long id, UpdateOwnerRequest updateOwnerRequest) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> deleteOwner(Long id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Page<PetDTO>> listOwnerPets(Long id, Pageable pageable) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
