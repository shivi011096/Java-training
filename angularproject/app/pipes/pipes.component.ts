import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  // public currentDate= new Date;
  // name= "Shivangi";
 
  public employees = [
    {"empId": 101, "empName" : "James", "gender" : 
    "Male","salary" : 25000, "email" : "ja@gmail.com","dob": 6/15/15},
    {"empId": 102, "empName" : "Lala", "gender" : 
    "Male","salary" : 25095, "email" : "gigi@gmail.com","dob": 6/15/97},

    {"empId": 103, "empName" : "Lali", "gender" : 
    "Female","salary" : 25095, "email" : "gigi@gmail.com","dob": 6/15/97}
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
