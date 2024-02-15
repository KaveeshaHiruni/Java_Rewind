package ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        //call an arraylist
        ArrayList<String> fruitlist = new ArrayList<String>();

        //add the fruits to the list
        fruitlist.add("Banana");
        fruitlist.add("Orange");
        fruitlist.add("Apple");

        //Display the list
        System.out.println(fruitlist);

        //Retrieve a value from the list
        System.out.println(fruitlist.get(0));
        System.out.println(fruitlist.get(1));

        //Update a value
        System.out.println(fruitlist.set(0,"Guwava"));
        System.out.println(fruitlist);

        //Remove fruits from the list
        String fruit = fruitlist.remove(0);
        System.out.println(fruit);
    }
}
