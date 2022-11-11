import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final Set<Product> products;

    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.products = products;
    }

    public float getRecipeProduct () {
        float sum = 0;
        for (Product product : products) {
            sum = (sum + product.getPrice()) * product.getValue();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
}
