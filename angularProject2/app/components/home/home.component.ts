import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private dataservice:DataService, private router: Router) { }
  categories: any;

  ngOnInit(): void {
    this.dataservice.getCategories().subscribe(x => this.categories=x.data);
  }

  onSelectCategory(category){
    console.log(category.catId)
    this.router.navigate(['/products',category.catId])
  }

}
