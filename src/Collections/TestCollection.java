package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class TestCollection {
    public  static  void main(String args[]){

//        Collection<String> collect = new ArrayList<>();

        Collection<String> listCities = new ArrayList<>();
        listCities.add("Hyderabad");
        listCities.add("Warangal");
        listCities.add("Siddipet");
        listCities.add("Karimnagar");
        listCities.add(null);


        System.out.println("List of Cities"+listCities);
        System.out.println("List of Cities"+listCities.size());
        System.out.println("Contains Karimnagar city?"+ listCities.contains("Krimnagar"));
        listCities.remove("Siddipet");
        System.out.println("After reomval"+ listCities);

    }

}
