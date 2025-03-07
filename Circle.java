// Circle.java

import java.lang.Math;

class Circle extends Shape {

 // Circle Constructor
 public Circle(double radius) {
  super(radius, 0, 0, 0);
 }

 // Method to calculate area
 public double calculateArea() {
  return Math.PI * Math.pow(dim_one, 2);
 }

 // Method to calculate perimeter (circumference)
 public double calculatePerimeter() {
  return 2 * Math.PI * dim_one;
 }
}