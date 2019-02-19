import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './interfaces/user-model';

@Injectable()
export class ApiService {

    constructor(public http: HttpClient) { }
    baseUrl: string = 'http://localhost:8080/users/';

    login(loginPayload) {
        const headers = {
            'Authorization': 'Basic ' + btoa('devglan-client:devglan-secret'),
            'Content-type': 'application/x-www-form-urlencoded'
        }
        return this.http.post('http://localhost:8080/' + 'userAuthentication', loginPayload, { headers });
    }

    getUsers(): Observable<any> {
        return this.http.get(this.baseUrl + 'user?access_token=' + JSON.parse(window.sessionStorage.getItem('token')).access_token);
    }

    getUserById(id: number) {
        return this.http.get(this.baseUrl + 'user/' + id + '?access_token=' + JSON.parse(window.sessionStorage.getItem('token')).access_token);
    }

    createUser(user: User) {
        return this.http.post(this.baseUrl + 'user?access_token=' + JSON.parse(window.sessionStorage.getItem('token')).access_token, user);
    }

    updateUser(user: User): Observable<any> {
        return this.http.put(this.baseUrl + 'user/' + user.id + '?access_token=' + JSON.parse(window.sessionStorage.getItem('token')).access_token, user);
    }

    deleteUser(id: number) {
        return this.http.delete(this.baseUrl + 'user/' + id + '?access_token=' + JSON.parse(window.sessionStorage.getItem('token')).access_token);
    }
}