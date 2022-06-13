import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PorfolioComponent} from './COMPONENTES/porfolio/porfolio.component';
import {IniciarSesionComponent} from './COMPONENTES/iniciar-sesion/iniciar-sesion.component';

const routes: Routes = [
	{path:'porfolio',component:PorfolioComponent},
	{path:'iniciar-sesion',component:IniciarSesionComponent},
	{path:'',redirectTo:'porfolio',pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
