import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {StoresComponent} from "./stores/stores.component";


//  Rotas dos componentes do módulo Department  --> Rotas são URLs que o usuário pode acessar
const routes: Routes = [
  { path: '', component: StoresComponent }
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DepartmentRoutingModule { }
