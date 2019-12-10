public class interfaceJava {

    public static void main(String[] args) {

        Animal2 animal;
        Animal2 animal_parent_referncing_dog = new Dog2();
        animal_parent_referncing_dog.dogEats();
        animal_parent_referncing_dog.animalRuns();
    }



}



interface Animal2{
// constant variable may be decleared in the interface
    public static final float pi = 3.14f;
   abstract public void animalRuns();

    // may not have a body
    abstract public void dogEats();

}

class Dog2 implements Animal2{

    public void animalRuns(){
        System.out.println("Dog is eating");
    }

    public void dogEats(){
        System.out.println("Dog is eating");
    }

}