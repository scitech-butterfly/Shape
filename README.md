# **Shape Area & Volume Calculator**  

## **Description**  
This is a **menu-driven Java program** that calculates the **area, perimeter, and volume** of different geometric shapes.  
It demonstrates the use of:  
- **Abstract Classes** (for common shape properties and methods)  
- **Interfaces** (to define volume calculation)  
- **Constructors** (for object initialization)  
- **Method Overriding** (to implement abstract methods)  
- **Switch-Case Menu** (for user interaction)  

## **Features**  
1. **Calculate Area & Perimeter** of **Rectangle, Square, Circle**
2. **Calculate Surface Area & Volume** of **Sphere, Cylinder, and Equilateral Pyramid**  
3. **Uses Abstract Class & Interface for Code Reusability**  
4. **Takes User Input Dynamically**  
5. **Menu-Driven Interface**  

---

## **How to Run**  

### 1️. Clone the Repository  
```sh
git clone https://github.com/yourusername/Shape-Calculator.git
cd Shape-Calculator
```
### 2️. Compile the Java Files  
```sh
javac Main.java
```
### 3️. Run the Program  
```sh
java Main
```

---

## **Class & Method Descriptions**  

### **1️. Shape.java (Abstract Class)**
Defines a blueprint for all shapes.  
 `abstract double calculateArea()` – Calculates the shape's area.  
 `abstract double calculatePerimeter()` – Calculates the shape's perimeter.  

### **2️. Volume.java (Interface)**
Defines the volume calculation for 3D shapes.  
 `double calculateVolume();`  

### **3️. Rectangle.java**  
- **Constructor:** `Rectangle(double length, double width)`  
- **Methods:**  
  - `calculateArea()` → Returns **length × width**  
  - `calculatePerimeter()` → Returns **2 × (length + width)**  

### **4️. Square.java**  
- **Constructor:** `Square(double side)`  
- **Methods:**  
  - `calculateArea()` → Returns **side²**  
  - `calculatePerimeter()` → Returns **4 × side**  

### **5️. Circle.java**  
- **Constructor:** `Circle(double radius)`  
- **Methods:**  
  - `calculateArea()` → Returns **π × radius²**  
  - `calculatePerimeter()` → Returns **2 × π × radius**  

### **6️. Sphere.java (Implements Volume)**  
- **Constructor:** `Sphere(double radius)`  
- **Methods:**  
  - `calculateArea()` → Returns **4 × π × radius²**  
  - `calculateVolume()` → Returns **(4/3) × π × radius³**  

### **7️. Cylinder.java (Implements Volume)**  
- **Constructor:** `Cylinder(double radius, double height)`  
- **Methods:**  
  - `calculateArea()` → Returns **2 × π × radius × (radius + height)**  
  - `calculateVolume()` → Returns **π × radius² × height**  

### **8️. EquilateralPyramid.java (Implements Volume)**  
- **Constructor:** `EquilateralPyramid(double base, double height)`  
- **Methods:**  
  - `calculateArea()` → Returns **Base Area + Triangular Faces Area**  
  - `calculateVolume()` → Returns **(1/3) × Base Area × Height**  

### **9️. Main.java (Menu-Driven Program)**  
- **Displays Menu Options** for user selection  
- **Accepts Input Dynamically** and calls respective shape class  
- **Handles multiple shape calculations** in a loop  

---


## **Author**  
 **Name:** Kashvi Singh 
 
 **PRN:** 23070126057 
 
 **Batch:** AIML A3

--- 
