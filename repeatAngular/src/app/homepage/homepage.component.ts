import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  products:any;
  show:any;
  
  constructor(private service:RserviceService, private router:Router) { 
    this.products='';
  }

  ngOnInit(): void {
    this.service.getProducts().subscribe((data:any)=>{
      console.log(data);
      this.products=data
    })
  }
login(){
this.router.navigateByUrl("login")
}
register(){
  this.router.navigateByUrl("register")
}
home(){
  this.router.navigateByUrl('home')
}
product(){
  this.router.navigateByUrl('producta')
}
user(){
  this.router.navigateByUrl('user')
}
buyNow(){
  window.alert("U Have To Login To Buy Product");
  this.router.navigateByUrl("login");
}
alert(){
  alert('you have to login to buy product')
this.router.navigateByUrl('login')
}
search(prod:any){
this.service.searchByProduct(prod).subscribe((data:any)=>
this.show=data);
}
alert1(){
  alert('you have to login to add product')
this.router.navigateByUrl('login')
}

}
