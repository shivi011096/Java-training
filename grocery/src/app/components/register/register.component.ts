import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {

 public interests : any = ["Bakeries", "Beverages", "Drinks", "Desserts"];
 public userModel = new User('mark','mark@gamil','9485112547','','male',true)  
  constructor() { }

  ngOnInit(): void {
  }

}
