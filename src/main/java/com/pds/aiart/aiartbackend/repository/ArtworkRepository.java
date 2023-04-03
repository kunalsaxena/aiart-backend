package com.pds.aiart.aiartbackend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pds.aiart.aiartbackend.model.Artwork;

@Repository
public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {
    Page<Artwork> findAll(Pageable pageable);
}
