import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  public name;
  constructor(private abc: DataService) {
   this.name=abc.getEmployees();
   }

  ngOnInit(): void {
  }

}
