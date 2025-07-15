--------------------Method Overloading (Compile-time Polymorphism)----------------

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add(2, 3): " + calc.add(2, 3));
        System.out.println("Add(2, 3, 4): " + calc.add(2, 3, 4));
        System.out.println("Add(2.5, 3.5): " + calc.add(2.5, 3.5));
    }
}
--------------------Method Overriding (Run-time Polymorphism)----------------
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.sound(); 
    }
}
