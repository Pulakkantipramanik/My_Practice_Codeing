public class Employee {
    //    String name ;
//    Double salary ;
//    int id;
//    public static void main(String[] args) {
//
//        Employee a1=new Employee();
//        a1.name= "Pulak";
//        a1.id=3;
//        a1.salary= 50000.0;
//        System.out.println(a1);
//    }
//}
    String Laptop;
    int Ram;

     Employee(String Laptop, int Ram) {
        this.Laptop = Laptop;
        this.Ram = Ram;
    }

    public static void main(String[] args) {
        Employee b1 = new Employee("Hp", 16);
        System.out.println(b1.Laptop);
        System.out.println(b1.Ram);
    }
}
