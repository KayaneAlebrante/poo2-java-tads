package com.example.crud.repositories;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.domain.Aluno.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long>{
  List<AlunoEntity> findAllByActiveTrue();
}
