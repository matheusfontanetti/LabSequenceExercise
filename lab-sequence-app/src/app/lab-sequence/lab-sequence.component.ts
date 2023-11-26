import {Component, OnInit} from '@angular/core';
import { CommonModule } from '@angular/common';
import {HttpClient} from "@angular/common/http";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-lab-sequence',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './lab-sequence.component.html',
  styleUrl: './lab-sequence.component.css'
})
export class LabSequenceComponent implements OnInit{
  inputValue: number = 0;
  labSeqValue: number =0;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  calculateLabSeq(): void {
    this.http.get<number>(`http://localhost:8080/labseq/${this.inputValue}`).subscribe(
      data => {
        this.labSeqValue = data;
      },
      error => {
        console.error('Error fetching lab sequence value', error);
      }
    );
  }
}
