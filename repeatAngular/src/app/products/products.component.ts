import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  show:any
  products:any;
  constructor(private service:RserviceService,private router:Router) {
    this.products="";
   }

  ngOnInit(): void {
    this.service.getProducts().subscribe((data:any)=>{
      console.log(data);
      this.products=data
    })
  }

  addproduct(){
    this.router.navigateByUrl
  }

  logout(){
    this.router.navigateByUrl('home')
  }

  payment(){
    this.router.navigateByUrl('payment')
  }
  search(prod:any){
    this.service.searchByProduct(prod).subscribe((data:any)=>
    this.show=data);
    }
    
    addToCart(product:any){
      this.service.cart(product).subscribe((data:any)=>{
        this.router.navigate(['cart']);
    
    });
  
  }
  c(){
    this.router.navigateByUrl('cart')
  }
}
