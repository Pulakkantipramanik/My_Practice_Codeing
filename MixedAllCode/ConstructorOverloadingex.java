public class ConstructorOverloadingex {

    String name ;
    int mobilenumber ;
    int id ;
    ConstructorOverloadingex(String name){
        this.name=name;
    }
    ConstructorOverloadingex(String name , int number){
        this.name=name;
        this.mobilenumber=number;

    }
    ConstructorOverloadingex(int id){
        this.id=id;
    }

    public static void main(String[] args) {
        ConstructorOverloadingex a1=new ConstructorOverloadingex("Ram");
        ConstructorOverloadingex a2=new ConstructorOverloadingex("Shyam",321);
        ConstructorOverloadingex a3=new ConstructorOverloadingex(1000);
        System.out.println(a1.name);
    }
}
