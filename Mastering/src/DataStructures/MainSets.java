package DataStructures;

import java.util.*;

public class MainSets {
    public static void main(String[] args) {
        // HashSet
        Set<Integer> set = new HashSet<>();
        int count[] = {3, 4, 6, 9, 10, 23, 10, 4, 5, 6, 9};
        try{
            for(int i=0;i<count.length;i++){
                set.add(count[i]);
            }
            System.out.println("Out set: " + set);
        } catch (Exception e) {

        }

        // TreeSet
        TreeSet sortedSet = new TreeSet(set);
        System.out.println("Sorted set: " + sortedSet);

        // LinkedSet - can contain null values.
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Allo");
        linkedHashSet.add("Lalo");
        linkedHashSet.add("Salo");

        Iterator<String> it = linkedHashSet.iterator();
        while(it.hasNext()){
            System.out.println("Items " + it.next());
        }
    }
}
