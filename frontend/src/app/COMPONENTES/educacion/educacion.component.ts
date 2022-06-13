import { Component, OnInit } from '@angular/core';
import {Educacion} from 'src/app/model/educacion'
import {EducacionService} from 'src/app/SERVICE/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
	
lista:any=[];
  constructor(private educacionService: EducacionService) { }

  ngOnInit(): void {
    this.listarEducaciones();
  }

  listarEducaciones()
  	{
    this.educacionService.getEducacion().subscribe( res=>{
	this.lista=res;
	console.log(res);
    },
    err=> console.log(err)
	 );
  }

}
