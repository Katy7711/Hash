import java.util.*;

public class ProductList {


    HashMap<Product, Integer> products = new HashMap<>();

    public void putProductList(Product product, int amount) {
        if (this.products.containsKey(product)) {
            throw new ProductAlreadyExistsException(); }
            if (this.products.containsValue(null)) {
                this.products.values().add(1);
        } else {
            this.products.put(product,amount);
        }
    }

    public void checkProduct(String name) {
        for (Product product : products.keySet()) {
            if (product.getName().equals(name)) {
                product.setCheck();
                break;
            }
        }
    }

//    public void removeProduct (String name) {
//        Iterator<Product> productsIterator = this.products.();
//        while (productsIterator.hasNext()) {
//            if (productsIterator.next().getName().equals(name)) {
//                productsIterator.remove();
//                break;
//            }
////
////        }
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Product product: products.keySet()) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
