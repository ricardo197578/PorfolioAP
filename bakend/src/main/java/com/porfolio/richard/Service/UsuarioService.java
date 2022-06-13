package com.porfolio.richard.Service;
import com.porfolio.richard.Entity.Usuario;

import com.porfolio.richard.Entity.Educacion;
import com.porfolio.richard.Repository.UsuarioRepository;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository){
	this.usuarioRepository = usuarioRepository;
	}

	public Usuario addUser(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	public List<Usuario>buscarUsuario(){
		return usuarioRepository.findAll();
	}
	public Usuario editarUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	public void borrarUsuario(Long id){
		usuarioRepository.deleteById(id);
	}
	public Usuario buscarUsuarioPorId(Long id){
		return usuarioRepository.findById(id).orElse(null);
	}

}
