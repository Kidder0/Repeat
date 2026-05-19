import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { AuthGuard } from './auth.guard';
import { CartComponent } from './cart/cart.component';
// import { HeaderComponent } from './header/header.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { PaymentComponent } from './payment/payment.component';
import { ProductsComponent } from './products/products.component';
import { ProductsaComponent } from './productsa/productsa.component';
import { RegisterComponent } from './register/register.component';
import { ShowusersComponent } from './showusers/showusers.component';
import { WelcomeComponent } from './welcome/welcome.component';
// import { AddProductComponent } from './add-product/add-product.component';

const routes: Routes = [
  {path:"",component:WelcomeComponent},



{path:"header",component:HomepageComponent},
{path:"login",component:LoginComponent},
{path:"register",component:RegisterComponent},
{path:"product",component:ProductsComponent},
{path:"payment",component:PaymentComponent},
{path:"cart",component:CartComponent},
{path:"producta",component:ProductsaComponent},
{path:"home",component:HomepageComponent},

{path:"addproduct",component:AddProductComponent},

{path:"user",component:ShowusersComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
