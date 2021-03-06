package com.denkitronik.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message ="no puede estar vacio")
	@Size(min=2, max=20, message="el tamaño tiene que estar entre 2 y 20")
	@Column(nullable=false, unique=true)
	private String usuario;

	@NotEmpty(message ="no puede estar vacio")
	@Size(min=2, max=20, message="el tamaño tiene que estar entre 2 y 20")
	@Column(nullable=false, unique=true)
	private String password;

	@NotEmpty(message ="no puede estar vacio")
	@Column(nullable=false)
	private String rol;

	@NotEmpty(message ="no puede estar vacio")
	@Size(min=2, max=20, message="el tamaño tiene que estar entre 2 y 20")
	@Column(nullable=false)
	private String nombre;

	@NotEmpty(message ="no puede estar vacio")
	private String apellido;

	@NotEmpty(message ="no puede estar vacio")
	@Email(message="no es una dirección de correo bien formada")
	@Column(nullable=false, unique=true)
	private String email;

	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	private static final long serialVersionUID = 1L;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
