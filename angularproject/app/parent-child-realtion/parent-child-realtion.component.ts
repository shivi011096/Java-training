import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-parent-child-realtion',
  templateUrl: './parent-child-realtion.component.html',
  styleUrls: ['./parent-child-realtion.component.css']
})
export class ParentChildRealtionComponent implements OnInit {

  // @Input()
  // parentvalue;

  // @Input()
  // fName;

  // @Input()
  // lName;

  // @Input()
  // details;
  
  @Output()
  childEvent =  new EventEmitter();

  onButtonClick()
  {
     this.childEvent.emit("message");
  }

  constructor() { }

  ngOnInit(): void {
  }

}
