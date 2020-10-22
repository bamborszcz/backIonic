package com.blam.ionic.mySql.repository;

import com.blam.ionic.mySql.domain.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comida, Long> {
}
