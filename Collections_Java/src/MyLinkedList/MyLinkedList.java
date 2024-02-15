package MyLinkedList;
import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        //create the linked list
        LinkedList<String> carlist = new LinkedList<String>();

        //add elements to the linked list
        carlist.add("Honda");
        carlist.add("Vitz");
        carlist.add("Maruti");

        //print all the elements in the linked list
        System.out.println(carlist);

        //update a value in the linked list
        carlist.set(0,"Hybrid");

        //retrieve an element in the list
        System.out.println(carlist.get(1));

        //remove elements from the list
        String nme  = carlist.remove(0);
        System.out.println(nme);

        //add an element as the first
        carlist.addFirst("Padgero");

        System.out.println(carlist);

        carlist.pop();
    }
}
