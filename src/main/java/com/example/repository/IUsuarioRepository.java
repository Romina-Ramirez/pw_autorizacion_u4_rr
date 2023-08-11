package com.example.repository;

import com.example.repository.modelo.Usuario;

public interface IUsuarioRepository {

	public Usuario buscarPorUserName(String username);

}
