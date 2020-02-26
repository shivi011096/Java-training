import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  public productId: any;
  public subCategory: any;
  public catId: any;
  public products: any;
  public _image_url =  'http://rjtmobile.com/grocery/images/';


  constructor(private dataService: DataService, private route: ActivatedRoute) {
    this.catId=this.route.snapshot.paramMap.get('id');
    this.productId=this.route.snapshot.paramMap.get('catId');
   
    
   }

  ngOnInit(): void {
    this.dataService.getSubCategory(this.catId).subscribe(
      x => this.subCategory = x.data
    )

    this.dataService.getProducts(this.productId).subscribe(
      x => this.products = x.data
    )
  }

  addToCart(product){
    if(localStorage.cart == undefined)
    {
      var cartItems = [];
      cartItems.push(product);
      localStorage.cart = JSON.stringify(cartItems);//stringify: coverts object to string
    }

    else{
      var products = JSON.parse(localStorage.cart);//parse: converts string back to object
      products.push(product)
      localStorage.cart = JSON.stringify(products)
    }
  }
  onSelectSubCategory(subId){
    console.log(subId);
   this.dataService.getProducts(subId).subscribe(x=> this.products=x.data);
  }
}