package abstraction;
abstract class Animal{
    abstract  void sleep();
    public void eat(){
        System.out.println("eating ");
    }
}

 class dog extends  Animal{
    public   void sleep(){
        System.out.println("animal sleeping ");
    }
}
class Test1{
    public static void main(String[] args) {
        Animal a = new dog();
        a.sleep();
        a.eat();

    }
}