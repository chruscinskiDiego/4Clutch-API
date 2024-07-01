package com.clutch.api.repository;
import com.clutch.api.model.Exterior;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExteriorRepository extends JpaRepository<Exterior, Long> {
    List<Exterior> findByNameContaining(String name);
    Exterior findByName(String name);
}
