package new_package;
import java.util.*;

class Dog implements Animal {
   
    public void fillup() {
        System.out.println(Animal.color);
    }
    static void main(String[] args) {
        Dog dog = new Dog();
        dog.fillup();
    }
}