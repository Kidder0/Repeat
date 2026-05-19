
import { Component, OnInit } from '@angular/core';

import { RserviceService } from '../rservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private Rservice:RserviceService,private router:Router) { }
// countriesList:any;

ngOnInit(): void {
  
}
  registrationok(value : any ){
    console.log(value)
    this.Rservice.userinsert(value).subscribe((data:any)=>console.log(data));
  }

  ok(){
    alert('Registration successful')
    // this.router.navigateByUrl('login')
  }
  back(){
    this.router.navigateByUrl('home')
  }

}
