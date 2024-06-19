public class Product {

    private int pcode;
    private String pname;
    private double price;

    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static Product findProductWithLowestPrice(Product[] products) {
        if (products == null || products.length == 0) {
            return null;
        }

        Product lowestPriceProduct = products[0];

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() < lowestPriceProduct.getPrice()) {
                lowestPriceProduct = products[i];
            }
        }

        return lowestPriceProduct;
    }

    public static void main(String[] args) {

        Product product1 = new Product(1, "Product1", 20.99);
        Product product2 = new Product(2, "Product2", 19.49);
        Product product3 = new Product(3, "Product3", 18.75);

        Product[] products = { product1, product2, product3 };

        Product lowestPriceProduct = Product.findProductWithLowestPrice(products);

        System.out.println("Product with the lowest price:");
        System.out.println("Product Code: " + lowestPriceProduct.pcode);
        System.out.println("Product Name: " + lowestPriceProduct.pname);
        System.out.println("Product Price: " + lowestPriceProduct.price);
    }
}
