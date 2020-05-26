package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Circle(2.0));
		myShapes.add(new entities.Rectangle(3.0, 2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(4.0));
		myCircles.add(new Circle(5.0));
		
		
		System.out.println("Total area: " + totalArea(myCircles));

		
	}
	public static Double totalArea(List<? extends Shape> list) { 
		double sum = 0;
		for(Shape s : list) {
			sum =+ s.area();
		}
		return sum;
	}

}
