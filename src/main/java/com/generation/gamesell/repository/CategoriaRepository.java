package com.generation.gamesell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gamesell.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByTipoProdutoContainingIgnoreCase(@Param("tipoProduto") String tipoProduto);
	public List<Categoria> findAllByTipoSistemaContainingIgnoreCase(@Param("tipoSistema") String tipoSistema);
}
