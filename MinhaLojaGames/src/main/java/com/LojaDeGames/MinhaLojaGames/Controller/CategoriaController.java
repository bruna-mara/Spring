package com.LojaDeGames.MinhaLojaGames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.LojaDeGames.MinhaLojaGames.Model.CategoriaModel;
import com.LojaDeGames.MinhaLojaGames.Repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> getById(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		// .map e .orElse nesse caso serve para tratar o erro e devolver uma reposta caso ocorra.
		//o map vai mapear os Id's existentes. 
		//caso o usuario digite um id inexistente retorna um notfound
		
	}
	
	@GetMapping("/categoria/{categoria}")
	public ResponseEntity<List<CategoriaModel>> getByCategoria(@PathVariable String categoria){
		return ResponseEntity.ok(repository.findAllByCategoriaContainingIgnoreCase(categoria));
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel> postCategoria(@RequestBody CategoriaModel categoria){
		return ResponseEntity
				.status(HttpStatus.CREATED).body(repository.save(categoria));
		//esse RespEntity.status retorna la no postman o status 201, 
		//indicando q o post foi criado.
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CategoriaModel> putCategoria(@PathVariable Long id, @RequestBody CategoriaModel categoria){
		categoria.setId(id);
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
