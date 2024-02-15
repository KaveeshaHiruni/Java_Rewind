package Vector;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        //create a vector
        Vector newVector = new Vector();

        //check the capacity
        int capacity = newVector.capacity();

        //print the capacity
        System.out.println(capacity);

        //newVector
        newVector.add("Apple");
        newVector.add("Orange");
        newVector.add("Grapes");
        newVector.add("Guwava");

        System.out.println(newVector);

        System.out.println(newVector.size());
    }
}
