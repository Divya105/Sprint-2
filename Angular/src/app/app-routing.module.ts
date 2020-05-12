import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { MyuserComponent } from './myuser/myuser.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  {path:'',redirectTo:'user',pathMatch:'full'},
  {path:'register',component:RegisterComponent},
  {path:'myuser',component:MyuserComponent},
{path:'add',component:CreateUserComponent},
{path:'update/:id',component:UpdateUserComponent},
{path:'detail/:id',component:UserDetailsComponent},
{path:'login',component:LoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
