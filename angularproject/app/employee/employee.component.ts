import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  public name;
  constructor(private abc: DataService) {
   this.name=abc.getEmployees();
   }

  ngOnInit(): void {
  }

}
