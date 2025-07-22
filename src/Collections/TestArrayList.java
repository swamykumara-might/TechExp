package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrayList {
    public static void main(String args[]) {
        List<Product> listOfProducts = Arrays.asList(new Product(101L,"Paracetmol","20-0102025","20-01-2027"),
                new Product(102L,"Dolo650","28-01-2025","28-01-2027"),
                new Product(103L,"B-VITA","29-01-2025","29-01-2027"),
                new Product(104L,"D-VITAMIN","19-01-2025","19-01-2027"));

        List<Product> item= listOfProducts.stream().filter(n->"D-VITAMIN".equalsIgnoreCase(n.getProdName()))
                .collect(Collectors.toList());
        System.out.println(item);
        item.forEach(System.out::println);


    }
}
