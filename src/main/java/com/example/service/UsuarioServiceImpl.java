package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.repository.IUsuarioRepository;
import com.example.repository.modelo.Usuario;

import static java.util.Collections.emptyList;

@Service
public class UsuarioServiceImpl implements UserDetailsService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = this.usuarioRepository.buscarPorUserName(username);
		
		return new User(usuario.getUsername(), usuario.getPassword(), emptyList());
	}

}
