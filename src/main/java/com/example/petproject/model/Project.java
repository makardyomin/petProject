package com.example.petproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Project {
    @Id
    private Long id;

    private String name;

    @Column
    private Long overallCost;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Furnace> furnaces = new ArrayList<>();

    public Project() { }

    public Project(
            final String newName, final Long cost, final Long newId) {
        this.name = newName;
        this.overallCost = cost;
        this.id = newId;
    }
}
