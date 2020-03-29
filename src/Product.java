//whatever we write in the class is actually the property of the object as we are describing it
//if you want something to belong to the class make it static
public class Product {

    //Attributes (State)
    int pid;
    String name;
    int price;

    //Constructor
    Product() {
        System.out.println(">> Product Object Constructed");
    }

    //Methods (Behavior)
    // To write data in Product Object we have this method
    void setProductDetails(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">> Data Written in Product Obj");
    }

    //To read data from Product Object and print it in this format
    void showProductDetails() {
        System.out.println("------Product ID: " + pid +  "------");
        System.out.println("Name: \t" + name);
        System.out.println("Price: \t" + price);
        System.out.println("------------------------------------");
    }


    public static void main(String[] args) {
        // Creat an object : Product
        Product product1 = new Product();
        //writing data in object
        product1.setProductDetails(101, "iphoneX", 7000);
        //reading data from Object
        product1.showProductDetails();

        System.out.println();

        //lets write data directly in new product obj
        Product product2 = new Product();
        product2.pid = 201;
        product2.name = "Samsung Galaxy s20";
        product2.price = 7000;
        product2.showProductDetails();


    }
}
