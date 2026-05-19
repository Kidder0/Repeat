import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';
@Component({
  selector: 'app-showusers',
  templateUrl: './showusers.component.html',
  styleUrls: ['./showusers.component.css']
})
export class ShowusersComponent implements OnInit {

  details:any;
  constructor(private emp:RserviceService) {
    this.details="";
   }

  ngOnInit(): void {
    this.emp.getusertable().subscribe((data:any)=>{
      console.log(data);
      this.details=data
    })
  }

}

