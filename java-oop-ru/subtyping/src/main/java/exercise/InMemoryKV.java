package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage{
    private Map<String, String> data;





    public InMemoryKV(Map<String, String> data) {
        this.data =  new HashMap<>(data);
    }

    @Override
    public void set(String key, String value) {
        this.data.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.data.remove(key);
    }



    public String get(String key) {
        return this.data.get(key);
    }
    @Override
    public String get(String key, String defaultValue) {
        String result = this.data.get(key);

        if (result == null){ result = defaultValue;}

        return result;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<String ,String >(this.data);
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public static void main(String[] args) {

        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10", "key2", "20"));

        System.out.println("Initial Map: "+ storage.toString());

        storage.set("morgenstern", "El Primero");

        System.out.println("Map after putting a new values: "+ storage.toString());

        System.out.println(storage.get("morgenstern", "default"));

        storage.unset("morgenstern");

        System.out.println("Map after delete = " + storage.toString());



    }



}




// END
