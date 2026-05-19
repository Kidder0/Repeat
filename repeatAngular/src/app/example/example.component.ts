import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-example',
  templateUrl: './example.component.html',
  styleUrls: ['./example.component.css']
})
export class ExampleComponent implements OnInit {
  constructor(public router : Router) { }

  ngOnInit(): void {
  }
 
  buyNow(){
    window.alert("U Have To Login To Buy Product");
    this.router.navigateByUrl("login");
  }
}
