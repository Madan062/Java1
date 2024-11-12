
package oopj1;
class Animal{
    void sound(){
        System.out.println("Aniaml makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args){
        Dog myDog=new Dog();
        myDog.sound();
        Animal myAnimal=new Animal();
        myAnimal.sound();
    }
    
}
