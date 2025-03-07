// EquilateralPyramid.java

class EquilateralPyramid extends Shape {

 // EquilateralPyramid Constructor
 public EquilateralPyramid(double base, double height) {
  super(base, height, 0, 4);
 }

 // Method to calculate area
 public double calculateArea() {
  return (dim_one * dim_one) + (2 * dim_one * Math.sqrt((dim_one * dim_one / 4) + (dim_two * dim_two)));
 }

 // Method to calculate perimeter
 public double calculatePerimeter() {
  return 4 * dim_one;
 }

 // Method to calculate volume
 public double calculateVolume() {
  return (1.0 / 3.0) * (dim_one * dim_one) * dim_two;
 }

}