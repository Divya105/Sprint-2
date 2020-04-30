import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { UpdateprofileComponent } from './updateprofile/updateprofile.component';


const routes: Routes = [
 {path:'register',component:RegisterComponent},
 {path:'updateprofile',component:UpdateprofileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
