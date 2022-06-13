import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { LogoApComponent } from './COMPONENTES/logo-ap/logo-ap.component';
import { BannerComponent } from './COMPONENTES/banner/banner.component';
import { HeaderComponent } from './COMPONENTES/header/header.component';
import { AcercaDeComponent } from './COMPONENTES/acerca-de/acerca-de.component';
import { EducacionComponent } from './COMPONENTES/educacion/educacion.component';
import { ExperienciaComponent } from './COMPONENTES/experiencia/experiencia.component';


import { IniciarSesionComponent } from './COMPONENTES/iniciar-sesion/iniciar-sesion.component';

import { NgCircleProgressModule } from 'ng-circle-progress';

import { HysComponent } from './COMPONENTES/hys/hys.component';
import { ProyectoComponent } from './COMPONENTES/proyecto/proyecto.component';
import { FooterComponent } from './COMPONENTES/footer/footer.component';
import { PorfolioComponent } from './COMPONENTES/porfolio/porfolio.component';
import{ReactiveFormsModule}from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    LogoApComponent,
    BannerComponent,
    HeaderComponent,
    AcercaDeComponent,
    EducacionComponent,
    ExperienciaComponent,
    IniciarSesionComponent,
    HysComponent,
    ProyectoComponent,
    FooterComponent,
    PorfolioComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    ReactiveFormsModule,
    HttpClientModule
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
