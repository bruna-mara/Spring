package com.LojaDeGames.MinhaLojaGames.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.LojaDeGames.MinhaLojaGames.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);
}
