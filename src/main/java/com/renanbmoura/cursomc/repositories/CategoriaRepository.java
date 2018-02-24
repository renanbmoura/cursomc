package com.renanbmoura.cursomc.repositories;

/*
 * Objeto da camada de acesso a dados referente ao tipo categoria.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renanbmoura.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
