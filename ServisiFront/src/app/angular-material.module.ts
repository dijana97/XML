import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {
   MatButtonModule,
   MatToolbarModule,
   MatIconModule,
   MatBadgeModule,
   MatSidenavModule,
   MatListModule,
   MatGridListModule,
   MatFormFieldModule,
   MatInputModule,
   MatSelectModule,
   MatRadioModule,
   MatDatepickerModule,
   MatNativeDateModule,
   MatChipsModule,
   MatTooltipModule,
   MatSnackBarModule,
   MatDialogModule,
   MatTableModule,
   MatTabsModule,
   MatExpansionModule,
   MatPaginatorModule,
   MatProgressSpinnerModule,
   MatCardModule,
  MatSortModule,
  MatOptionModule,
  MatCheckboxModule,
} from '@angular/material';

@NgModule({
   imports: [
      CommonModule,
      MatButtonModule,
      MatToolbarModule,
      MatIconModule,
      MatSidenavModule,
      MatExpansionModule,
      MatSortModule,
      MatSnackBarModule,
      MatDialogModule,
      MatBadgeModule,
      MatListModule,
      MatGridListModule,
      MatFormFieldModule,
      MatInputModule,
      MatSelectModule,
      MatRadioModule,
      MatDatepickerModule,
      MatNativeDateModule,
      MatChipsModule,
      MatTooltipModule,
      MatTableModule,
      MatProgressSpinnerModule,
      MatTabsModule,
      MatPaginatorModule,
      MatCardModule
   ],
   exports: [
      MatButtonModule,
      MatToolbarModule,
      MatIconModule,
      MatSidenavModule,
      MatExpansionModule,
      MatBadgeModule,
      MatListModule,
      MatSortModule,
      MatGridListModule,
      MatSnackBarModule,
      MatDialogModule,
      MatInputModule,
      MatFormFieldModule,
      MatSelectModule,
      MatRadioModule,
      MatDatepickerModule,
      MatChipsModule,
      MatTooltipModule,
      MatTableModule,
      MatProgressSpinnerModule,
      MatTabsModule,
      MatPaginatorModule,
      MatCardModule
   ],
   providers: [
      MatDatepickerModule,
   ]
})

export class AngularMaterialModule { }