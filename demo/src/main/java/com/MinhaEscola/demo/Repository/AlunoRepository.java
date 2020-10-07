package com.MinhaEscola.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MinhaEscola.demo.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}


