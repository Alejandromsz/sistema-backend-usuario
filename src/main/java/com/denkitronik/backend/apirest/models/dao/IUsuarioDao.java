package com.denkitronik.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denkitronik.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
