import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { map } from "rxjs/operators";

@Injectable()
export class UserService {

  url: string = 'http://localhost:8080/api/all-users';

  constructor(private httpClient: HttpClient) {
  }

  getUsers() {
    return this.httpClient.get(this.url).pipe(map(data => {
      let users = data['List'];
      return users.map(user => {
        return {
          name: user.name.firstName + ' ' + user.name.lastName,
          address: user.address.city + ' ' + user.address.street,
          photo: user.photo
        };
      });
    }));
  }
}
