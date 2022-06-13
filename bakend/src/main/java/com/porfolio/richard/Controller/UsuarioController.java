package com.porfolio.richard.Controller;

import com.porfolio.richard.Entity.Usuario;
import com.porfolio.richard.Service.UsuarioService;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins= {"*"})
public class UsuarioController{
	private final UsuarioService usuarioService;
	
	/*consructor*/
	public UsuarioController(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}

	/*get mapping para que en la direccion indicada nos traiga el usuario*/
	@GetMapping("/id/{id}")
	public ResponseEntity<Usuario>obtenerUsuario(@PathVariable("id")Long id){
		Usuario usuario = usuarioService.buscarUsuarioPorId(id);
		return new ResponseEntity<>(usuario,HttpStatus.OK);
	}

	/*para editar uso put*/
	@PutMapping("/update")                           
	public ResponseEntity<Usuario>editarUsuario(@RequestBody Usuario usuario){
                Usuario updateUsuario = usuarioService.editarUsuario(usuario);                
	return new ResponseEntity<>(updateUsuario,HttpStatus.OK);              }

	
}
