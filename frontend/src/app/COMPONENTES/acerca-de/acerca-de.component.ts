
import { Component, OnInit } from '@angular/core';
import { Usuario} from 'src/app/model/usuario';
import {UsuarioService} from 'src/app/SERVICE/usuario.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
 
	usuario: Usuario = new Usuario(" "," "," "," "," ");

  constructor(public usuarioService:UsuarioService) { }

  ngOnInit(): void {
          this.usuarioService.getUsuario().subscribe(data =>{this.usuario = data})
  }

}
