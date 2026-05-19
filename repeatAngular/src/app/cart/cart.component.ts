import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  carts:any;
  total:any;
   temp:any;
  constructor(private service:RserviceService,private router:Router) { 
    this.carts="";
  }
  
  ngOnInit(): void {
    this.service.getCart().subscribe((data:any)=>{
      console.log(data);
      this.carts=data
    })
  }

  // deleteProduct(id:number){
  //   // if(confirm("Are you sure you want to delete?"))
    
  // }
  delete(pod:any){
    this.service.proddelete(pod).subscribe((data:any) =>{console.log(data) 
       this.carts=data;this.ngOnInit();})
      
       }
   
  }

 


