package com.devsuperior.dsExercise1.repositories;

import com.devsuperior.dsExercise1.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
