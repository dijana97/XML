import { MojaVozilaComponent } from './components/userComponent/agent/moja-vozila/moja-vozila.component';
import { VoziloDetailsComponent } from './components/userComponent/user/vozilo-details/vozilo-details.component';
import { UserComponent } from './components/userComponent/user/user.component';
import { AgentComponent } from './components/userComponent/agent/agent.component';
import { AdministratorComponent } from './components/userComponent/administrator/administrator.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NoviOglasComponent } from './components/userComponent/user/novi-oglas/novi-oglas.component';
import { PraviOglasComponent } from './components/userComponent/user/pravi-oglas/pravi-oglas.component';
import { MyShopCartItemsComponent } from './components/userComponent/user/my-shop-cart-items/my-shop-cart-items.component';


const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'home' },
  { path: 'home', component: HomePageComponent },
  { path: 'login', component: LoginComponent },
  { path: 'administrator', component:  AdministratorComponent },
  { path: 'agent', component: AgentComponent },
  { path: 'user', component: UserComponent },
  { path: 'vozilo/novoVozilo', component: NoviOglasComponent },
  { path: 'vozilo/:id', component: VoziloDetailsComponent },
  { path: 'vozila', component: MojaVozilaComponent },
  { path: 'oglas/create', component: PraviOglasComponent },
  { path: 'cart', component: MyShopCartItemsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
