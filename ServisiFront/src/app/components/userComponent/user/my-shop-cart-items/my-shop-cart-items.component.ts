import { ZahtevService } from './../../../../services/zahtev.service';
import { ShopCartItems } from './../../../../models/shop-cart-items';
import { Zahtev } from './../../../../models/zahtev';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-my-shop-cart-items',
  templateUrl: './my-shop-cart-items.component.html',
  styleUrls: ['./my-shop-cart-items.component.css']
})
export class MyShopCartItemsComponent implements OnInit {

  selectedOptions = []; //Selektovane opcije koje ce biti grupisane u BUNDLE

  shopCartItems: Zahtev[] = [];
  selektovaniZaBundle: Zahtev[] = [];

  sendShopCart: ShopCartItems = new ShopCartItems();

  constructor(private zahtevService: ZahtevService) { }

  ngOnInit() {
    this.shopCartItems = JSON.parse(window.localStorage.getItem('ShopCartItem'));
  }

  onNgModelChange(event){
    this.selektovaniZaBundle = event;
  }

  rezervisi(){
    for(let z of this.shopCartItems){
      if(this.selektovaniZaBundle.indexOf(z) > -1){
        z.bundle = true;
      }else {
        z.bundle = false;
      }
    }
    console.log(this.shopCartItems);
    for(let z of this.shopCartItems){
      this.sendShopCart.zahtevi.push(z);
    }

    console.log(this.sendShopCart);
    // this.zahtevService.rezervisi(this.sendShopCart).subscribe(
    //   data => {
    //     console.log('Sacuvano!');
    //     window.localStorage.clear();
    //   }
    // );
    
  }
}
