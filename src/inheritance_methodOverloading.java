public class inheritance_methodOverloading {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.color = "black";
        dog.breed = "labra";


        Animal animal = new Animal();
        animal.color = "xyz";
        animal.eat();
    }
}

class Animal{
    String color;
    public void eat(){
        System.out.println("Animal eating");

    }
}


class Dog extends Animal {

    String breed;

    public void bark(){

    }
    // overriding
    public void eat(){
        super.eat();
        System.out.println("Dog eating");
    }
}

