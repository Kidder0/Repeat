import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';


function _window() : any {
  // return the global native browser window object
  return window;
}

@Injectable({
  providedIn: 'root'
})
export class RserviceService {
  get nativeWindow() : any {
    return _window();
 }

  private userLoggedIn: boolean;
  

user:any;
  public cartItemList : any =[]
  public productList = new BehaviorSubject<any>([]);
  public search = new BehaviorSubject<string>("");

  constructor(private httpclient:HttpClient) { 
    this.userLoggedIn=false;
  }
  setUserLoggedIn(){
    this.userLoggedIn=true;
  }
  getUserLoggedIn(){
    return this.userLoggedIn;
  }
  
  getusertable(){
    return this.httpclient.get('http://localhost:8080/users/list')
  }
  getProducts(){
    return this.httpclient.get('http://localhost:8080/products/list')
  }
  getProducts1(){
    return this.productList.asObservable();
  }

  
  addtoCart(product : any){
    this.cartItemList.push(product);
    this.productList.next(this.cartItemList);
    this.getTotalPrice();
    console.log(this.cartItemList)
  }
  getTotalPrice() : number{
    let grandTotal = 0;
    this.cartItemList.map((a:any)=>{
      grandTotal += a.total;
    })
    return grandTotal;
  }
  removeCartItem(product: any){
    this.cartItemList.map((a:any, index:any)=>{
      if(product.id=== a.id){
        this.cartItemList.splice(index,1);
      }
    })
    this.productList.next(this.cartItemList);
  }
  removeAllCart(){
    this.cartItemList = []
    this.productList.next(this.cartItemList);
  }
  // deletebyid(){
  //   return this.httpclient.delete('delete/{id}')
  // }


  update(product:any){
    return this.httpclient.put('http://localhost:8080/products/list',product)

  }
  updatep(product:any){
    return this.httpclient.put('http://localhost:8080/products/list',product)
  }
  addP(product:any){
   return this.httpclient.post("http://localhost:8080/products/add",product)
  }

  userinsert(user:any){
    return this.httpclient.post('http://localhost:8080/users/add',user)
  }
  proddelete(prod:number){
    return this.httpclient.delete('http://localhost:8080/products/delete/'+prod)
  }
   
   searchByProduct(product:any){
    return this.httpclient.get('http://localhost:8080/products/search?query='+product)
   }

   getProduct(id:any){
    // console.log(id);
    return this.httpclient.get('http://localhost:8080/products/list'+id);
  }
  getUser(){
    return this.user;
  }
  deleteCart(id:number){
    return this.httpclient.delete('htpp://localhost:8080/cart/list/{cartId}'+id);
  }
  cart(product:any){
    return this.httpclient.post('http://localhost:8080/cart/add',product)
  }

  getCart(){
    return this.httpclient.get('http://localhost:8080/cart/list')
  }

}


