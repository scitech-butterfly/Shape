// Square.java

class Square extends Shape {

 // Constructor
 public Square(double side) {
  super(side, 0, 0, 4); // for super class Shape's parameterized constructor
 }

 // Method to calculate area
 public double calculateArea() {
  return dim_one * dim_one; // Area = (side * side)
 }

 // Method to calculate perimeter
 public double calculatePerimeter() {
  return 4 * dim_one; // Perimeter = (4 * side)
 }

}