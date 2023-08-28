import java.util.*;

import java.lang.*;

class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
    double discriminant = b * b - 4 * a * c;
    
    if (discriminant < 0) {
        throw new IllegalArgumentException("The equation has no real roots.");
    }
    System.out.println("Discriminant: " + discriminant);
    
    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    
    return new Roots(root1, root2);
}
    
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(1, 12, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}