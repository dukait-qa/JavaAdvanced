package exercise_9.collection.hashmap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("123456789123", "John Davidson");
        hashMap.put("1234567891234", "Tom Dvorak");

        System.out.println(hashMap.get("123456789123"));
        System.out.println(hashMap.get("1234567891234"));
    }
}
