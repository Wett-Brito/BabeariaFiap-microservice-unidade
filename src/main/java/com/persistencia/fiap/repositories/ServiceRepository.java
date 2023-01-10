package com.persistencia.fiap.repositories;

import com.persistencia.fiap.entities.Unity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Unity, Long>{
}
