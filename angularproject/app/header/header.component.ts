import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor() { }

  classSuccess = "text-success"
  hasLine = true
  hasError = true

  message = {
    'text-success': this.hasError,
    'text-danger': !this.hasError,
    'text-underline': this.hasLine
  }

  ngOnInit(): void {
  }

}
