import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-productsa',
  templateUrl: './productsa.component.html',
  styleUrls: ['./productsa.component.css']
})
export class ProductsaComponent implements OnInit {

  products:any;
  updatebyid:any;
  show:any;
  
  constructor(private service:RserviceService,private route:Router) {
    this.updatebyid={
      pId:'',
      pCId:'',
      pName:'',
      pImg:'',
      pPrice:'',
      pDescription:'',
      pWeight:''
     
    }
   }

  ngOnInit(): void {
    this.service.getProducts().subscribe((data:any)=>{
      console.log(data);
      this.products=data
    })
  }
  
  delete(pod:any){
    this.service.proddelete(pod).subscribe((data:any) =>{console.log(data) 
       this.products=data;this.ngOnInit();})
      
       }
       editproduct(std:any){
        
        this.service.update(this.updatebyid).subscribe((data:any)=>
       this.products=data);
      }
      update(products:any){
        this.updatebyid=products;
      }
    home(){
      this.route.navigateByUrl('home')
    }

    addproduct(){
      this.route.navigateByUrl('addproduct')
    }
    search(prod:any){
      this.service.searchByProduct(prod).subscribe((data:any)=>
      this.show=data);
      }
      payment(){
        this.route.navigateByUrl('payment')
      }

      back(){
        this.route.navigateByUrl('login')
      }
      usertable(){
        this.route.navigateByUrl('user')
      }
       

}
