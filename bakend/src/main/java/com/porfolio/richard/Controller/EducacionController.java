package com.porfolio.richard.Controller;

import com.porfolio.richard.Entity.Educacion;
import com.porfolio.richard.Service.EducacionService;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;


@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins= {"*"})
public class EducacionController{
        private final EducacionService educacionService;

        /*consructor*/
        public EducacionController(EducacionService educacionService){
                this.educacionService = educacionService;
        }

        /*get mapping para que en la direccion indicada nos traiga el usuario*/
        @GetMapping("/all")
        public ResponseEntity<List<Educacion>>obtenerEducacion(){
                List<Educacion> educaciones = educacionService.buscarEducaciones();
                return new ResponseEntity<>(educaciones,HttpStatus.OK);
        }

        /*para editar uso put*/
        @PutMapping("/update")
        public ResponseEntity<Educacion>editarEducacion(@RequestBody Educacion educacion){
                Educacion updateEducacion = educacionService.editarEducacion(educacion);          
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);              }
	@PostMapping("/add")
	  public ResponseEntity<Educacion>crearEducacion(@RequestBody Educacion educacion){
	 Educacion nuevaEducacion=educacionService.addEducacion(educacion);
	 return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
	  }
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>borrarEducacion(@PathVariable("id")Long id){
		educacionService.borrarEducacion(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

