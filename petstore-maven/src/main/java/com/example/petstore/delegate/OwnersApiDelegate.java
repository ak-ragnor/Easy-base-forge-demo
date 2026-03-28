package com.example.petstore.delegate;

import com.example.petstore.dto.CreateOwnerRequest;
import com.example.petstore.dto.OwnerDTO;
import com.example.petstore.dto.PetDTO;
import com.example.petstore.dto.UpdateOwnerRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

/**
 * @author EasyBase Demo
 * @author Akhash R
 * @generated
 */
public interface OwnersApiDelegate {
    ResponseEntity<Page<OwnerDTO>> listOwners(String city, Pageable pageable);

    ResponseEntity<OwnerDTO> createOwner(CreateOwnerRequest createOwnerRequest);

    ResponseEntity<OwnerDTO> getOwner(Long id);

    ResponseEntity<OwnerDTO> updateOwner(Long id, UpdateOwnerRequest updateOwnerRequest);

    ResponseEntity<Void> deleteOwner(Long id);

    ResponseEntity<Page<PetDTO>> listOwnerPets(Long id, Pageable pageable);
}
