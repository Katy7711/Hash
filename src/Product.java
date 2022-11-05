import java.util.Objects;
import java.util.jar.JarEntry;

public class Product {


    private final String name;
    private final float price;
    private final int weight;
    private boolean check;

    public Product(String name, float price, int weight) {
        this.check = false;
        if (name == null || name.isBlank() || price < 0 || weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck() {
        this.check = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name,product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = isCheck() ? "да" : "нет";
        return String.format("%s, цена: %s, колличество: %s, куплен: %s", this.name, this.price, this.weight, checkedString);
    }
}
