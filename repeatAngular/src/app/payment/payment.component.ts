import { Component, OnInit } from '@angular/core';
import { RserviceService } from '../rservice.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  constructor(private rservice:RserviceService) { }

  ngOnInit(): void {
    this.rzp1 = new this.rservice.nativeWindow.Razorpay(this.options);
      this.rzp1.open(); 
  }
  options = {
    "key": "rzp_test_7HdkaZ1xFGPomB", // Enter the Key ID generated from the Dashboard
    "amount": "50000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
    "currency": "INR",
    "name": "Acme Corp",
    "description": "Test Transaction",
    "image": "https://example.com/your_logo",
    "order_id": "", //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
    "callback_url": "http://goodluckhours.com/payment-successful/",
    "prefill": {
        "name": "Rakesh",
        "email": "rakesh.kumar@example.com",
        "contact": "8897955754"
    },
    "notes": { 
        "address": "Razorpay Corporate Office"
    },
    "theme": {
        "color": "#3399cc"
    }
};
rzp1:any;
// pay(){
//   this.rzp1 = new this.studentservice.nativeWindow.Razorpay(this.options);
//   this.rzp1.open(); 
}



