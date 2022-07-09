import { Component, OnInit } from '@angular/core';
import {Educacion} from 'src/app/model/educacion'
import {EducacionService} from 'src/app/SERVICE/educacion.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
	
listarEducacion:any=[]
  constructor(private educacionService: EducacionService) { }

  ngOnInit(): void {
    this.listarEducacion();
  }

 getEducacion(){
	this.educacionService.getEducacion().subscribe(res=>{
		this.listarEducacion=res;
		console.log(res)
	;
	},
	err=>console.log(err)
		
	
	);
}

}
