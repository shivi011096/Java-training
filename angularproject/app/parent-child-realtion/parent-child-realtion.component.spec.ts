import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentChildRealtionComponent } from './parent-child-realtion.component';

describe('ParentChildRealtionComponent', () => {
  let component: ParentChildRealtionComponent;
  let fixture: ComponentFixture<ParentChildRealtionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentChildRealtionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentChildRealtionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
