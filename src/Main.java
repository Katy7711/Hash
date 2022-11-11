import Passport.Passport;
import multiply.MultiplicationTable;
import multiply.Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("морковь", 45.0f, 1);
        Product product1 = new Product("картошка", 60f, 5);
        ProductList productList = new ProductList();
        productList.putProductList(product,4);
        productList.putProductList(product1,6);
        System.out.println(productList);



    }

    public static void numbersSetRemove () {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 21; i++);
        numbers.add((int) (Math.random() * (20 - 1)) + 1);
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while ((iterator.hasNext())) {
            Integer next = iterator.next();
            if (next %2 != 0) {
                iterator.remove();
            }
            System.out.println(numbers);
        }




}}