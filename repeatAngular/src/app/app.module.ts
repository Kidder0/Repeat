import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import{HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';

import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
// import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './register/register.component';
import { AddProductComponent } from './add-product/add-product.component';
import { CartComponent } from './cart/cart.component';
// import { CategoryComponent } from './category/category.component';
import { ProductsComponent } from './products/products.component';
import { VeiwproductComponent } from './veiwproduct/veiwproduct.component';
import { RouterModule } from '@angular/router';
import { FilterPipe } from './filter.pipe';
import { ShowusersComponent } from './showusers/showusers.component';
import { ProductsaComponent } from './productsa/productsa.component';
// import { AdheaderComponent } from './adheader/adheader.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ExampleComponent } from './example/example.component';
import { PaymentComponent } from './payment/payment.component';
import { SuccessComponent } from './success/success.component';

// import { AddproductComponent } from './addproduct/addproduct.component';
// import { Category2Component } from './category2/category2.component';
// import { Category3Component } from './category3/category3.component';
// import { Category4Component } from './category4/category4.component';
// import { Category5Component } from './category5/category5.component';
// import { SidebarComponent } from './sidebar/sidebar.component';




@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    
    LoginComponent,
    
    RegisterComponent,
    AddProductComponent,
    CartComponent, 
    // CategoryComponent,
    ProductsComponent,
    VeiwproductComponent,
    FilterPipe,
    ShowusersComponent,
    ProductsaComponent,
    // AdheaderComponent,
    WelcomeComponent,
    ExampleComponent,
    PaymentComponent,
    SuccessComponent
    
  
    
    
  
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  
    FormsModule,
    HttpClientModule,

    RouterModule,
  

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
