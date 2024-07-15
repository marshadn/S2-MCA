// public class Product {

//     private int pcode;
//     private String pname;
//     private double price;

//     public Product(int pcode, String pname, double price) {
//         this.pcode = pcode;
//         this.pname = pname;
//         this.price = price;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public static Product findProductWithLowestPrice(Product[] products) {
//         if (products == null || products.length == 0) {
//             return null;
//         }

//         Product lowestPriceProduct = products[0];

//         for (int i = 1; i < products.length; i++) {
//             if (products[i].getPrice() < lowestPriceProduct.getPrice()) {
//                 lowestPriceProduct = products[i];
//             }
//         }

//         return lowestPriceProduct;
//     }

//     public static void main(String[] args) {

//         Product product1 = new Product(1, "Product1", 20.99);
//         Product product2 = new Product(2, "Product2", 19.49);
//         Product product3 = new Product(3, "Product3", 18.75);

//         Product[] products = { product1, product2, product3 };

//         Product lowestPriceProduct = Product.findProductWithLowestPrice(products);

//         System.out.println("Product with the lowest price:");
//         System.out.println("Product Code: " + lowestPriceProduct.pcode);
//         System.out.println("Product Name: " + lowestPriceProduct.pname);
//         System.out.println("Product Price: " + lowestPriceProduct.price);
//     }
// }

public class Product {
    String pcode;
    String pname;
    double price;

    // Constructor
    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Create three Product objects
        Product product1 = new Product("P001", "Product1", 100.0);
        Product product2 = new Product("P002", "Product2", 200.0);
        Product product3 = new Product("P003", "Product3", 50.0);

        // Display product details
        System.out.println("Product 1 details:");
        product1.display();
        System.out.println();

        System.out.println("Product 2 details:");
        product2.display();
        System.out.println();

        System.out.println("Product 3 details:");
        product3.display();
        System.out.println();

        // Find the product with the lowest price
        Product lowestPriceProduct = product1;

        if (product2.price < lowestPriceProduct.price) {
            lowestPriceProduct = product2;
        }
        if (product3.price < lowestPriceProduct.price) {
            lowestPriceProduct = product3;
        }

        // Display the product with the lowest price
        System.out.println("Product with the lowest price:");
        lowestPriceProduct.display();
    }
}
