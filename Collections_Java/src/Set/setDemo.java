package Set;

import java.util.*;

//Does not print duplicate values in set
public class setDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("Sam");
        s.add("Nimal");
        s.add("Kamal");
        s.add("Nimal");

        System.out.println(s);

        s.remove("Nimal");
        System.out.println(s);

        //Hash Set : Only duplicates does not care the sorted order
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(4);
        set.add(20);
        set.add(3);
        set.add(3);
        set.add(5);
        System.out.println("Hash Set : " +set);

        //Duplicates and also sorted
        Set<Integer> tree = new TreeSet<Integer>();
        tree.add(10);
        tree.add(4);
        tree.add(3);
        tree.add(5);
        System.out.println("Tree Set : "+tree);

    }
}
