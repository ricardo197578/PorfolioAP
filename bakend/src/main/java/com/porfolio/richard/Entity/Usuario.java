package com.porfolio.richard.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity

public class Usuario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull                                              @Size (min = 1, max = 50,message = "LONGITUD INCORRECTA")
	private String nombre;
	@NotNull
	@Size(min = 1,max = 50,message = "LONGITUD INCORRECTA")
	private String apellido;

	private String titulo;

	private String descripcion;

	@Size(min =1,max = 50 ,message= "LONGITUD INCORRECTA")
	private String img;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy ="idEdu")
	private List<Educacion> educacionList;
	@OneToMany(fetch = FetchType.LAZY,mappedBy ="idSkill")
	private List<Skills>skillList;
	@OneToMany(fetch = FetchType.LAZY,mappedBy ="idExp")
	private List<Experiencia> experienciaList;

	
	public Usuario(){
	}
	
	public Usuario (Long id,String nombre,String apellido,String titulo,String descripcion,String img){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.img = img;

	}

	/*getter y setter*/
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}

	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getDescripcion(){
		return descripcion;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}


	public String getImg(){
		return img;
	}
	public void setImg(String img){
		this.img=img;
	}

}
