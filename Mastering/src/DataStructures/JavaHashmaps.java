package DataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaHashmaps {
    public static void main(String[] args) {
        // We can declare the type of key and value using <key, value>
        HashMap users = new HashMap<>();

        users.put("Ar", 32);
        users.put("Mo", 22);
        users.put("La", 24);

        System.out.println(users.get("Mo"));

        if(users.containsKey("Ar")) System.out.println("Yes");

        System.out.println("Values : " + users.values());
        System.out.println("Entire DS : " + users.entrySet());

        // Iterate though the hashmap.
        Iterator it = users.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        // Can't use primitive data type, have to use object.
        HashMap<String, Integer> newUser = new HashMap<String, Integer>();
        newUser.put("Su" , 45);
        newUser.put("Al" , 87);
        System.out.println(newUser.entrySet());
    }
}
