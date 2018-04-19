import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'InfinityEyes';
  result = '';

  constructor(private http: HttpClient) {}

  onKey(event: any) {
    this.http.post('/counter', {'text': event.target.value})
      .subscribe(data =>
        this.result = "We counted " + data.toString() + " character I's for You.");
  }
}
