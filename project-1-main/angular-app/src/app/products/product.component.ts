import { Component } from '@angular/core';

@Component({
    selector: "app-product",
    template: '
        <div>
            <h3>{{title}}</h3>
            <p>{{price}}</p>
        </div>
    '
})
export class ProductComponent{
    title:string = 'Marcus';
    price:number = 2;
}