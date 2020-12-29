import java.util.Objects;

public class Product {

    private String name;
    private int price;
    private ProductType type;
    private int prodYear;

    public Product(){}

    public Product(String name, int price, ProductType type, int prodYear) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.prodYear = prodYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && prodYear == product.prodYear && Objects.equals(name, product.name) && type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, prodYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", prodYear=" + prodYear +
                '}';
    }
}
