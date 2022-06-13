import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Educacion} from '../model/educacion';


@Injectable({
  providedIn: 'root'
})
export class EducacionService {

	URL =' https://richard2022.herokuapp.com/educacion';              
	constructor(private http:HttpClient) { }                              
     public getEducacion():Observable<any>{                    
	     return this.http.get(this.URL + '/all');                }
	


}


  
