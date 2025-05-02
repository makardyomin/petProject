package com.example.petproject.repository;

import com.example.petproject.model.Material;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
    @Query(value = "SELECT m.* FROM material m " +
            "JOIN furnace_material mf ON m.id = mf.material_id " +
            "JOIN furnace f ON mf.furnace_id = f.id " +
            "WHERE f.type = :type", nativeQuery = true)
    List<Material> findByFurnaceType(@Param("type") String type);
}
