public class abstractClass {

    public static void main(String[] args) {

        Animal1 animal;
        Animal1 animal_parent_referncing_child = new Dog1();
        animal_parent_referncing_child.eat();
        animal_parent_referncing_child.run();

    }
}


abstract class Animal1{

    public void run(){
        System.out.println("Animal is running");
    }

    // may not have a body
    abstract public void eat();

}

class Dog1 extends Animal1{

    public void eat(){
        System.out.println("Dog is eating");
    }

}