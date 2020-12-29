import java.util.List;

public class Index {
    public static void main(String[] args) {

        Store store = new Store();
        store.importProducts();

        store.deleteProduct("AlpenGold");

        store.increasePrice(ProductType.TOBACCO);

        List<Product> premProductList = store.premiumProduct(100);
        System.out.println("у нас есть премиум товары" + premProductList);

        int price = store.getAllPriceStoreByType(ProductType.TOBACCO);
        System.out.println(price);

        int averagePrice = store.getAveragePriceStore();
        System.out.println(averagePrice);

        System.out.println(store.getProductList());
    }
}
