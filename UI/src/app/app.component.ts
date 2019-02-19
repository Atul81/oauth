import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiService } from './app-component-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'springio';

  constructor(private formBuilder: FormBuilder, private router: Router, private apiService: ApiService) { }

  public loggingOut() {
    window.sessionStorage.setItem('token', null);
    this.router.navigate(['login']);
  }
}
