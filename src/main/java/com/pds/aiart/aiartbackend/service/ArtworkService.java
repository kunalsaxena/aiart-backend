package com.pds.aiart.aiartbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pds.aiart.aiartbackend.model.Artwork;
import com.pds.aiart.aiartbackend.repository.ArtworkRepository;

@Service
public class ArtworkService {
    
    @Autowired
    private ArtworkRepository repository;

    public List<Artwork> getAllArtworks(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Artwork> pageResult = repository.findAll(pageable);
        return pageResult.getContent();
    }
}
