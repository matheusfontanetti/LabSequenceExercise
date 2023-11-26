import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabSequenceComponent } from './lab-sequence.component';

describe('LabSequenceComponent', () => {
  let component: LabSequenceComponent;
  let fixture: ComponentFixture<LabSequenceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LabSequenceComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LabSequenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
