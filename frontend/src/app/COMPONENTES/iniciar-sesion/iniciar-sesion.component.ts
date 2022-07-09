/*import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,Validators} from '@angular/forms';

@Component({
  selector: 'app-iniciar-sesion',
  templateUrl: './iniciar-sesion.component.html',
  styleUrls: ['./iniciar-sesion.component.css']
})
export class IniciarSesionComponent implements OnInit {

	
  constructor(private formBuilder:FormBuilder) { }

  ngOnInit(): void {
  }

}*/


import { Component, OnInit } from '@angular/core';
import { LoginUsuario } from 'src/app/model/login-usuario';
import { AuthService } from 'src/app/SERVICE/auth.service';
import { TokenService } from 'src/app/SERVICE/token.service';
import { Router } from '@angular/router';

@Component({

	selector: 'app-iniciar-sesion',      templateUrl: './iniciar-sesion.component.html',                           styleUrls: ['./iniciar-sesion.component.css']
})
export class IniciarSesionComponent implements OnInit {

  form: any = {};
  loginUsuario!: LoginUsuario;
  nombreUsuario!:string;
  password!:string;
  isLogged = false;
  isLogginFail = false;
  roles: string[] = [];
  errorMsg!:string;

  constructor(private authService: AuthService, private tokenService: TokenService, private router: Router) { }

  ngOnInit() {
    if (this.tokenService.getToken()) {
      this.isLogged = true;
      this.isLogginFail = false;
      this.roles = this.tokenService.getAuthorities();
    }
  }

  onLogin(): void {
    this.loginUsuario = new LoginUsuario(this.nombreUsuario, this.password);
    this.authService.login(this.loginUsuario).subscribe(data => {                                                                                                       this.isLogged = true;   

				           this.isLogginFail = false;  
  this.tokenService.setToken(data.token);  this.tokenService.setUserName(data.nombreUsuario);
  this.tokenService.setAuthorities(data.authorities);
  this.roles = data.authorities;
  this.router.navigate([''])             },err =>{
  this.isLogged=false;
  this.isLogginFail=true;
	
  this.errorMsg = err.error.message;

  }
    );
  }
}

