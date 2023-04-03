package com.pds.aiart.aiartbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "ARTWORK")
@Entity
public class Artwork {
    
    @Id
    private Integer id;

    private String imgSrc;

    private String descr;
}
