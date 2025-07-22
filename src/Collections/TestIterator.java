package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public  static  void main(String args[]){
        List<String> listCities = new ArrayList<>();
        listCities.add("Hyderabad");
        listCities.add("Warangal");
        listCities.add("Siddipet");
        listCities.add("Karimnagar");
        listCities.add(null);

        Iterator<String> iterator = listCities.iterator();

        while (iterator.hasNext()) {
            String city= iterator.next();
            System.out.println(city);
            iterator.remove();
//            if (city.equals("Siddipet")){
//                iterator.remove();
//            }
        }
        System.out.println("After remove city"+ listCities);

    }

}
