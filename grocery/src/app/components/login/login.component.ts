import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // public userForm= new FormGroup({
  //   username: new FormControl('shivi@gmail.com'),
  //   password: new FormControl('53654365')

  // })
  // constructor() { }

  constructor(private fb: FormBuilder) { }
   userForm = this.fb.group({
     username: ['Shivangi'],
     password: ['123456789']
  })

  ngOnInit(): void {
    // this.createForm()
  }

  // createForm(){
  //   this.userForm=this.fb.group({
  //     'username': [null, Validators.required],
  //     'password': [null, Validators.required]
  //   })
  // }

  // onSubmit(data)
  // {
  //   console.log(data);
  // }
}

