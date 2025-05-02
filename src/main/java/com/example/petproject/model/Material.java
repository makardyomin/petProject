package com.example.petproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long cost;

    @Column
    private String thermalInsulation;

    @ManyToMany(mappedBy = "materialIds")
    @JsonIgnore
    private List<Furnace> furnaces;

    public Material() {}

    public Material(String name) {
        this.name = name;
    }
}
