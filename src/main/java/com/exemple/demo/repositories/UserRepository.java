package com.exemple.demo.repositories;

import com.exemple.demo.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Persona,Long> {
}
