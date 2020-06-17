import { Component, OnInit } from '@angular/core';
import { SvaVozilaService } from 'src/app/services/sva-vozila.service';
import { Vozilo } from 'src/app/models/vozilo';
import { PraviOglasComponent } from '../pravi-oglas/pravi-oglas.component';
import { MatDialog } from '@angular/material';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sva-vozila',
  templateUrl: './sva-vozila.component.html',
  styleUrls: ['./sva-vozila.component.css']
})
export class SvaVozilaComponent implements OnInit {
  vozila:Vozilo[];
  vozilolist$;
  constructor(private vozilaServis:SvaVozilaService,public dialog: MatDialog,private authService: AuthenticationService, private router: Router) {

    this.vozilolist$=vozilaServis.getVozila();
   }

  ngOnInit() {
  }


  public openDialogOglas(id: number) {

    const dialogRef = this.dialog.open(PraviOglasComponent, {
      data: { id: id }
      
      
    });
    dialogRef.afterClosed().subscribe(result => {
      console.log(id);

    });

  }

  onOdjaviMe(){
    window.localStorage.clear();
    this.authService.logout();
  }

  onZahtevi(){
    this.router.navigateByUrl('user/zahtev');
  }

  shopCart(){
    this.router.navigateByUrl('cart');
  }

  onVozilo(){
    this.router.navigateByUrl('vozilo/novoVozilo');
  }

  onMojaVozila(){
    this.router.navigateByUrl('svavozila');
  }
}
