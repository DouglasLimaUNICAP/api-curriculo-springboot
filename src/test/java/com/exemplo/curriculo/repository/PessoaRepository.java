package com.exemplo.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemplo.curriculo.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
