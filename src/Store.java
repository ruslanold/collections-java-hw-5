import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
    List<Product> productList;
    public Store(){
         this.productList = new ArrayList<Product>();
    }

    public void importProducts(){
        Product product1 = new Product("AlpenGold", 122, ProductType.CHOCOLATE, 2020);
        Product product2 = new Product("ProstoMilk", 60, ProductType.MILK, 2020);
        Product product3 = new Product("Mallboro", 54, ProductType.TOBACCO, 2020);
        Product product4 = new Product("Parlament", 56, ProductType.TOBACCO, 2020);

        this.productList.add(product1);
        this.productList.add(product2);
        this.productList.add(product3);
        this.productList.add(product4);
    }

    public void addProduct(Product product) {
        String name = product.getName();
        int price = product.getPrice();
        String[] nameWithoutDigits =  name.split("\\d");
        if(price <= 0){
            System.out.println("Price is not valid");
            return;
        }else if(nameWithoutDigits.length > 1){
            System.out.println("Name is not valid");
            return;
        }
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void deleteProduct(String productName){
        Iterator<Product> iterator = this.productList.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if((product.getName()).equals(productName)) {
                iterator.remove();
            }
        }

        /*
        for (Product product:this.productList) {
            if((product.getName()).equals(productName)) {
                this.productList.remove(product);
            }
        }
        */
    }

    public void increasePrice(ProductType type){
        for (Product product:this.productList) {
            if((product.getType()).equals(type)){
                int price = product.getPrice();
                product.setPrice(price * 2);
            }
        }
    }

    public List<Product> premiumProduct(int price){
        List<Product> premProductList = new ArrayList<>();
        for (Product product : this.productList) {
            if (product.getPrice() > price) {
                premProductList.add(product);
            }
        }
        return premProductList;
    }

    public int getAllPriceStoreByType(ProductType type) {
        int price = 0;
        for (Product product:this.productList) {
            if((product.getType()).equals(type)){
                price += product.getPrice();
            }
        }
        return price;
    }

    public int getAveragePriceStore() {
        int price = 0;
        for (Product product:this.productList) {
            price += product.getPrice();
        }

        return price / this.productList.size();
    }

}
