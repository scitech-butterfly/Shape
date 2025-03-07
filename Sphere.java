// Sphere.java

class Sphere extends Shape {

 // Sphere constructor
 public Sphere(double radius) {
  super(radius, 0, 0, 0);
 }

 // Mehtod to calculate area
 public double calculateArea() {
  return 4 * Math.PI * Math.pow(dim_one, 2); // Area = 4 * pi * (radius)^2
 }

 // Method to calculate perimeter
 public double calculatePerimeter() {
  return 0; // Spheres don't have a perimeter
 }

 // Method to calculate volume
 public double calculateVolume() {
  return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3); // Volume = (4/3) * pi * (radius)^3
 }
}