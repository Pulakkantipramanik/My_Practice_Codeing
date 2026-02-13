public class Circle {
    int radious;
    public Circle(){
        System.out.println("Hello");
    }
    public  void setRadious(int radious){
        this.radious=radious;

    }
    public  int setPrint(){
        int a =200;
        return  a;
    }

    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        System.out.println("value"+  c1.setPrint());
         c2.setRadious(10);
        System.out.println(c2.setPrint());



    }
}
