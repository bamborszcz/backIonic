package com.blam.ionic.mySql.repository;

import com.blam.ionic.mySql.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
