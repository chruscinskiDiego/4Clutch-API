package com.clutch.api.repository;
import com.clutch.api.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByNameContaining(String name);
    Model findByName(String name);
}
