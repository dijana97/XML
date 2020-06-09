import { Component, OnInit } from '@angular/core';
import { VrstaMenjaca } from 'src/app/models/vrsta-menjaca';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-prikaz-svih-vrsta-menjaca',
  templateUrl: './prikaz-svih-vrsta-menjaca.component.html',
  styleUrls: ['./prikaz-svih-vrsta-menjaca.component.css']
})
export class PrikazSvihVrstaMenjacaComponent implements OnInit {

  menjaci:VrstaMenjaca[];
  vrstaMenjacalist$;

  constructor(private  vrstaMenjacaServis:AdminService) { 
    this.vrstaMenjacalist$= vrstaMenjacaServis.getVrsteMenjacaVozila();
  }

  public vrstaMenjaca:VrstaMenjaca=new VrstaMenjaca();

  ngOnInit() {
  }

  deleteVrsteMenjaca(menjac: VrstaMenjaca): void {
    console.log("brisanje vrste menjaca");
    this.vrstaMenjacaServis.deleteVrsteMenjaca(menjac)
      .subscribe( data => {
        this.menjaci = this.menjaci.filter(u => u !== menjac);
      })
  };
}