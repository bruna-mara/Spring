package com.LojaDeGames.MinhaLojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.LojaDeGames.MinhaLojaGames.Model.CategoriaModel;


@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {


	public List<CategoriaModel> findAllByCategoriaContainingIgnoreCase(String categoria);

}
