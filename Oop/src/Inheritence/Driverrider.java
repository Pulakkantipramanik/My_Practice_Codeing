package Inheritence;
class App{
     int size ;
    String type;
     App(int size ,String type){
         this.size=size;
         this.type=type;
     }
}
class Zomato extends  App{
    int No_Of_Hotel;
    Zomato(int  NoofHotel, int size ,String type){
        super(size,type);
        this.No_Of_Hotel=NoofHotel;

    }

}

public class Driverrider {
    public static void main(String[] args) {
         Zomato  ab = new Zomato(400,50 ,"food");
        System.out.println(ab.No_Of_Hotel);
        System.out.println(ab.size);
        System.out.println(ab.type);

    }
}
