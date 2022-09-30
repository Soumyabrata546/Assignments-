package com.cognizant.shapes;

import Assignments.*;

public class Shape {
	int numberOfSides;
	void calculateShapeArea(int ns,int sl) {
		switch(ns) {
		case 1:
			Circle ob1=new Circle();
			ob1.calculateArea(sl);
			break;
		case 3:
			Triangle t =new Triangle();
			t.calculateArea(sl);
			break;
		
		case 4:
			Square s =new Square();
			s.calculateArea(sl);
			break;
	
	default:
		System.out.println("No Shapes Present.");

		}	
//		if(ns==1) {
//			Circle ob1=new Circle();
//			ob1.calculateArea(sl);
//		}
//		else if(ns==3) {
//			Triangle t =new Triangle();
//			t.calculateArea(sl);
//		}
//		else if(ns==4) {
//			Square s =new Square();
//			s.calculateArea(sl);
//		}
//		else {
//		
//			System.out.println("No Shapes Present.");
//		}
			
	}
	public static void main(String[] args) {
		new Shape().calculateShapeArea (3,12);
		new Shape().calculateShapeArea (4,15);
		new Shape().calculateShapeArea (5,15);
	}
}
