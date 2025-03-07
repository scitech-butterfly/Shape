// Main.java

// Name: Kashvi Singh
// PRN: 23070126057
// Batch: AIML A3

import java.util.*;

class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in); // Scanner to take input
  int choice; // To store user choice

  do {
   // Display menu and take input
   System.out.println("\nSelect Shape to Calculate:");
   System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
   System.out.print("Enter your choice: ");
   choice = sc.nextInt();

   // Implement switch case
   switch (choice) {
    case 1: // Rectangle
      System.out.print("Enter Length: ");
      double length = sc.nextDouble();
      System.out.print("Enter Width: ");
      double width = sc.nextDouble();
      Rectangle rect = new Rectangle(length, width);
      System.out.println("Area: " + rect.calculateArea());
      System.out.println("Perimeter: " + rect.calculatePerimeter());
      break;
    case 2: // Square
      System.out.print("Enter Side: ");
      double side = sc.nextDouble();
      Square sq = new Square(side);
      System.out.println("Area: " + sq.calculateArea());
      System.out.println("Perimeter: " + sq.calculatePerimeter());
      break;
    case 3: // Circle
     System.out.print("Enter Radius: ");
     double radius = sc.nextDouble();
     Circle circle = new Circle(radius);
     System.out.println("Area: " + circle.calculateArea());
     System.out.println("Perimeter: " + circle.calculatePerimeter());
     break;
    case 4: // Sphere
     System.out.print("Enter Radius: ");
     double sphereRadius = sc.nextDouble();
     Sphere sphere = new Sphere(sphereRadius);
     System.out.println("Surface Area: " + sphere.calculateArea());
     System.out.println("Volume: " + sphere.calculateVolume());
     break;
    case 5: // Cylinder
     System.out.print("Enter Radius: ");
     double rCyl = sc.nextDouble();
     System.out.print("Enter Height: ");
     double hCyl = sc.nextDouble();
     Cylinder cyl = new Cylinder(rCyl, hCyl);
     System.out.println("Surface Area: " + cyl.calculateArea());
     System.out.println("Volume: " + cyl.calculateVolume());
     break;
    case 6: // Equilateral Pyramid
     System.out.print("Enter Base Length: ");
     double base = sc.nextDouble();
     System.out.print("Enter Height: ");
     double height = sc.nextDouble();
     EquilateralPyramid pyramid = new EquilateralPyramid(base, height);
     System.out.println("Surface Area: " + pyramid.calculateArea());
     System.out.println("Volume: " + pyramid.calculateVolume());
     break;
    case 7:
     System.out.println("Exiting...");
     break;
    default:
     System.out.println("Invalid choice!");
    }
   } while (choice != 7);
  sc.close();
 }
}