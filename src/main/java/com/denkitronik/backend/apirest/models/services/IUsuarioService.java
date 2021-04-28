package com.denkitronik.backend.apirest.models.services;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.denkitronik.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	List<Usuario> findAll();

	Page<Usuario> findAll(Pageable pageable);

	Usuario save(Usuario usuario);

	Usuario findById(Long id);

	void delete(Long id);
}
