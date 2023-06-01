package exercise;

import java.util.Map;
import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage dict){

        Map<String ,String> temp = dict.toMap();
        for (String key: temp.keySet()) {
            dict.unset(key);
            dict.set(temp.get(key),key);
        }




    }


}


// END
