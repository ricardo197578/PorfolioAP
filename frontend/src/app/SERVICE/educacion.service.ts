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
	     return this.http.get(this.URL + 'educacion/all');                }
	
	public addEducacion(educacion:Educacion):Observable<any>{
	return this.http.post(this.URL + 'educacion/add',educacion);

	}
	public updateEducacion(id:string,educacion:Educacion):Observable<any>{
        return this.http.put(this.URL + 'educacion/update',educacion);

        }
	public deleteEducacion(id:string):Observable<any>{
        return this.http.delete(this.URL + 'educacion/delete/id');

        }
}
