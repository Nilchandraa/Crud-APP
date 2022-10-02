import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';
import { Observable, VirtualTimeScheduler } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseURL = "http://localhost:8080/api/v1/product";
  constructor(private httpClient: HttpClient) { }

  getProductList(): Observable<Product[]>{

    return this.httpClient.get<Product[]>(`${this.baseURL}`);
  }
  createProduct(product: Product): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,product);
  }
}
