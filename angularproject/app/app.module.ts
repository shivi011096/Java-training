import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { from } from 'rxjs';
import { ParentChildRealtionComponent } from './parent-child-realtion/parent-child-realtion.component';
import { PipesComponent } from './pipes/pipes.component';
import { TitlePipe } from './title.pipe';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavbarComponent,
    SidebarComponent,
    TwoWayBindingComponent,
    ParentChildRealtionComponent,
    PipesComponent,
    TitlePipe,
    EmployeeComponent,
    EmployeeListComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent,HeaderComponent,FooterComponent,NavbarComponent, SidebarComponent]
})
export class AppModule { }
