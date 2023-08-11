package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.repository.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioRepositoryImpl implements IUsuarioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Usuario buscarPorUserName(String username) {
		TypedQuery<Usuario> myQuery = this.entityManager
				.createQuery("SELECT u FROM Usuario u WHERE u.username = :datoUser", Usuario.class);
		myQuery.setParameter("datoUser", username);
		return myQuery.getSingleResult();
	}

}
