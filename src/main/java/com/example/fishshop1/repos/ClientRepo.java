package com.example.fishshop1.repos;

import com.example.fishshop1.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<ClientModel, Long> {
    List<ClientModel> findClientModelsByActual(boolean actual);
}
