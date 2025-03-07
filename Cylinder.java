// Cylinder.java

class Cylinder extends Shape {

 // Cylinder constructor
 public Cylinder(double radius, double height) {
  super(radius, height, 0, 0);
 }

 // Method to calculate area
 public double calculateArea() {
  return 2 * Math.PI * dim_one * (dim_one + dim_two); // Area = 2 * pi * r * (r + h)
 }

 // Method to calculate perimeter
 public double calculatePerimeter() {
  return 0; // Cylinders don't have a perimeter
 }

 // Method to calculate volume
 public double calculateVolume() {
  return Math.PI * Math.pow(dim_one, 2) * dim_two; // Volume = pi * (r^2) * h
 }
}