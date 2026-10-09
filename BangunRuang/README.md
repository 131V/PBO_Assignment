# Java 3D Geometry Calculator

This repository contains a Java project designed to calculate the volume and surface area of various 3D geometric shapes, specifically cubes, boxes (cuboids), and spheres. It demonstrates core object-oriented principles such as overloaded constructors, encapsulation via getters and setters, and mathematical computations.

## Project Structure

The project consists of two Java files:

*   **`BangunRuang.java`**: The core utility class (`BangunRuang`) representing a 3D shape. 
    *   It defines private attributes for different dimensions: `side`, `length`, `width`, `height`, and `radius`.
    *   It features overloaded constructors to instantiate objects for specific shapes easily (e.g., passing a single parameter for a cube, or three parameters for a box).
    *   It contains specific calculation methods for volumes (`calculateCubeVolume`, `calculateBoxVolume`, `calculateSphereVolume`) and surface areas (`calculateCubeSurfaceArea`, `calculateBoxSurfaceArea`, `calculateSphereSurfaceArea`).
*   **`BangunRuangDemo.java`**: The main driver class that tests the `BangunRuang` objects. It instantiates a cube, multiple boxes (using different constructor/setter approaches), and a sphere, then prints their calculated metrics to the console using formatted output (`System.out.printf`).

## Dependencies and Libraries

This project uses standard Java SE. The only specific built-in library utilized is `java.lang.Math` (which is imported by default in Java), used to access `Math.PI` for sphere calculations and `Math.pow()` for calculating exponents like squared and cubed values. No external third-party libraries are required.

## How to Compile and Run

Make sure you have the Java Development Kit (JDK) installed on your system. Run the following bash commands in your terminal to compile and run the application.

### 1. Compile the Code

Compile both `.java` files simultaneously using the `javac` command:

```bash
javac BangunRuang.java BangunRuangDemo.java
```

### 2. Run the Application

Execute the compiled demo class:

```bash
java BangunRuangDemo
```

### Expected Output

When you run the application, you should see the following formatted calculations output to the console:

```text
Volume of box (L=10, W=5, H=7) = 350.0
Surface area of cube (side=4) = 96.0
Volume of sphere (radius=3) = 113.1
```