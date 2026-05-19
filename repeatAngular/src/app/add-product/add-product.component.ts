import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  carts:any;

  constructor(private service:RserviceService,private router:Router) { }

  ngOnInit(): void {
    
    this.service.getProducts().subscribe((data:any)=>{
      console.log(data);
      this.carts=data
    })
    





  }

  addProduct(upForm: any){
    console.log(upForm)
    this.service.addP(upForm).subscribe((data: any)=>console.log(data));
  }
  ok(){
    alert('Added Product Successfully')
    
  }


}
