import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Rotas Globais --> Rotas são URLs que o usuário pode acessar
const routes: Routes = [
  { path: '', redirectTo: '/stores', pathMatch: 'full' },
  { path: 'stores', loadChildren: () => import('./department/department.module').then(path => path.DepartmentModule) },
];
{}
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
