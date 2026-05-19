import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

 
  constructor(private emp:RserviceService,private route:Router) {
  
  }

 ngOnInit(): void {
   
 }
 header(){
 this.route.navigateByUrl("home")
 }

}