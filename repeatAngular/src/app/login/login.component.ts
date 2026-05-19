import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomepageComponent } from '../homepage/homepage.component';

import { RserviceService } from '../rservice.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
Employees:any;
user:any;
rakesh:any;
condition:any;
uName=''
password=''

  constructor(private router:Router,private Rservice:RserviceService) { 

    this.Employees="";
           this.user="";
   
  }

  ngOnInit(): void {
    this.Rservice.getusertable().subscribe((data: any)=> {
      console.log(data);
      this.Employees=data;});
  }

  loginSubmit2(loginForm:any){
  
          this.Employees.forEach((users:any)=>{
            
            if(loginForm.uName == users.uName && loginForm.password ==users.password){
               if(loginForm.uType == 'user' && users.uType=='user'){

               
              this.Rservice.setUserLoggedIn();
              alert('successful')
                this.router.navigate(['product']);
                this.condition=true;
               }
            }
            if(loginForm.uName == users.uName && loginForm.password ==users.password){
              if(loginForm.uType == 'admin' && users.uType=='admin'){

              
             this.Rservice.setUserLoggedIn();
             alert('successful')
               this.router.navigate(['producta']);
               this.condition=true;
              }
           }
           if(this.condition==false){
            alert('invalid username and password')
          }
            
          });
          

          
          

          



  // }
  

  // }
  //loginSubmit2(u_Form: any){
  //   if(u_Form.uName =='8897955854' && u_Form.password == 'Rakesh@#06'){
  //     this.Rservice.setUserLoggedIn();
  //     this.router.navigate(['product']);
  //   }else{
  //     this.Rservice.getusertable().subscribe((data: any)=> {
  //       console.log(data);
  //       this.Employees=data;
  //       this.Employees.forEach((this.rakesh)=>{
  //         if(u_Form.uName == this.Employees.uName && u_Form.password == this.Employees.password){
  //           this.Rservice.setUserLoggedIn();
  //           this.router.navigate(['product']);
  //         }  });

  //       }
       // if(u_Form.uName == this.Employees.uName && u_Form.password == this.Employees.password){
        //   this.Rservice.setUserLoggedIn();
        //   this.router.navigate(['product']);
        // }
      // });
    
        }
        home(){
          this.router.navigateByUrl("register")

        }
        back(){
          this.router.navigateByUrl('home')
        }
      }


