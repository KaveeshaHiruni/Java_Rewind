package Map;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        //Implementation of the Hashmap
        //Map has a key value pair
        //Hash map does not maintain a insertion order
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("Amila",(50));
        m1.put("Kaveesha",(10));
        m1.put("Kavindya",(30));
        System.out.println("Hash Map : " +m1);

        //Implementation of the LinkedHashMap
        //Maintains the insertion order
        //No sorted order
        Map<String, Integer> m2 = new LinkedHashMap<String, Integer>();
        m2.put("Kavindya",(100));
        m2.put("Kaveesha",(30));
        m2.put("Kaushuni",(200));
        System.out.println("Linked Hash Map : "+m2);

        //Implementation of the TreeMap
        //Doesn't Maintain the insertion order
        //sorted order
        Map<String, Integer> m3 = new TreeMap<>();
        m3.put("Kavindya",(100));
        m3.put("Kaveesha",(30));
        m3.put("Kaushuni",(200));
        m3.put("Kavin",(300));
        System.out.println("Tree Map : "+m3);


        for (Map.Entry map : m3.entrySet()) {
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
    }
}

