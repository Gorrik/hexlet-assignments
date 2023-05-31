package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

// BEGIN

public class App {

    public static List<String> buildApartmentsList(List<Home> app, int amountGet){

        if (!app.isEmpty()){
            List<String> result = new ArrayList<>();
            Collections.sort(app, Home::compareTo);
            for (int i = 0; i < amountGet; i++) {
                result.add(app.get(i).toString());
            }
            System.out.println(result);

        return result;}
        else {return List.of();}
    }

    public static void main(String[] args) {

        List<Home> apartments = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> result = App.buildApartmentsList(apartments, 10);






    }







}

// END
