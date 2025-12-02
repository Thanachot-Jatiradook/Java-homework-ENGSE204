package Lab304;

public class Product {

    private String name ;
    private static int productCount = 0 ;

    public Product (String name) {

        this.name = name ;
        productCount++ ;

    }

    public String getName() {

        return this.name ;

    }

    public static int getProductCount() {

        return productCount ;

    }
    
}
