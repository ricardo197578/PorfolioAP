import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';    
import {Persona} from '../model/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  
URL = 'https://richard2022.herokuapp.com';
       constructor(private http:HttpClient) { }                                                                         
     public getPersona():Observable<Persona>{                                          return this.http.get<Persona>(this.URL + '/persona/id/2');                                              }

	
}
