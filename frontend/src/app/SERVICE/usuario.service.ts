import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';    
import {Usuario} from '../model/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  
URL = 'https://richard2022.herokuapp.com';                               constructor(private http:HttpClient) { }                                                                         
     public getUsuario():Observable<Usuario>{                                          return this.http.get<Usuario>(this.URL + '/usuario/id/2');                                              }

	
}
