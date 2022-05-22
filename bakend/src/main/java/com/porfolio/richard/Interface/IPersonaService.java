package com.porfolio.richard.Interface;

import com.porfolio.richard.Entity.Persona;
import java.util.List;

public interface IPersonaService {

	/*TRAER UNA LISTA DE PERSONA*/
	public List<Persona>getPersona();

	/*GUARDAR UN OBJETO PERSONA
variable:persona */
	public void savePersona(Persona persona);

	/*ELIMINAR UN USUARIO*/
	public void deletePersona(Long id);

	/*BUSCAR UNA PERSONA*/
	public Persona findPersona(Long id);
}

