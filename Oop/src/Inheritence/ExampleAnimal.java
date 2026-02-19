package Inheritence;


class  Animal{
    String name;
    void eat(){
        System.out.println( name+ "eating ...");
    }
    void sleep(){
        System.out.println( name + "sleeping ....");
    }

}
class dog extends  Animal{
    void bark(){
        System.out.println(name+ "dog are barking ");
    }

}
public class ExampleAnimal {
    public static void main(String[] args) {
        dog a = new dog();
        a.name="tommy";
        a.eat();
        a.sleep();
        a.bark();

    }
}
