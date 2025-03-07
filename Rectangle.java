// Rectangle.java

class Rectangle extends Shape {

 // Rectangle Constructor
 public Rectangle(double length, double width) {
  super(length, width, 0, 4); // for super class Shape's parameterized constructor
 }

 // Method to calculate area
 public double calculateArea() {
  return dim_one * dim_two; // Area = (length * breadth)
 }

 // Method to calculate perimeter
 public double calculatePerimeter() {
  return 2 * (dim_one + dim_two); // Perimeter = 2 * (length + breadth)
 }
}
