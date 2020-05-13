package Inheritence;

public class Cat extends Animal {
    public static void testStaticMethod() {
        System.out.println("This is static method in cat");
    }
    
    @Override
    public void testInstanceMethod() {
        System.out.println("This is instance method in cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testStaticMethod();
        myCat.testInstanceMethod();
        Cat.testStaticMethod();
        myAnimal.testInstanceMethod();
    }
}