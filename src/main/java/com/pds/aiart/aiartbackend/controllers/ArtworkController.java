package com.pds.aiart.aiartbackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pds.aiart.aiartbackend.model.Artwork;
import com.pds.aiart.aiartbackend.service.ArtworkService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/artwork")
public class ArtworkController {
    
    @Autowired
    private ArtworkService artworkService;

    @GetMapping("/{page}/{size}")
    public ResponseEntity<List<Artwork>> listArtworks(@PathVariable Integer page, @PathVariable Integer size) {
        List<Artwork> artworkList = new ArrayList<>();
        try {
            artworkList = artworkService.getAllArtworks(page, size);
            return new ResponseEntity<>(artworkList, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
