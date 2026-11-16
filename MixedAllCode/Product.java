public class Product {
    String name;
    int price;
    int weight;

    public String ProductI(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        return name + price +weight;
    }
    public void ProductPrint(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        p1.ProductI("dettol soap", 200, 150);
        p2.ProductI("coconut_oil ", 500, 50);
         p1.ProductPrint();
         p2.ProductPrint();
    }

}
