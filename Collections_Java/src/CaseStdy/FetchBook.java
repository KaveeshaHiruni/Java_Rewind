package CaseStdy;
import java.util.*;

public class FetchBook {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<String>();

        bookList.add("Macbirth");
        bookList.add("Madol Duwa");
        bookList.add("Hathpana");
        bookList.add("Anne");
        bookList.add("Anne");
        bookList.add("Jayamaha");

        System.out.println("The size of the book list : " + bookList.size());

        Set<String> distinct_books = new HashSet<String>();

        for(int i=0 ; i<bookList.size(); i++){
            distinct_books.add(bookList.get(i));
        }
        System.out.println("The distinct book size : " +distinct_books.size());

        Map<String,ArrayList<String>> library = new LinkedHashMap<String,ArrayList<String>>();

        ArrayList<String> blist = new ArrayList<String>();
        blist.add("Java");
        blist.add("Python");
        blist.add("Javascript");
        blist.add("Python");

        library.put("Educational" , blist);

        ArrayList<String> novel = new ArrayList<String>();

        novel.add("nov1");
        novel.add("nov2");
        novel.add("nov3");
        novel.add("nov4");

        library.put("Novel", novel);

        ArrayList<String> detective_novel = new ArrayList<String>();

        detective_novel.add("dov1");
        detective_novel.add("dov2");
        detective_novel.add("dov3");
        detective_novel.add("dov4");

        library.put("detective_novel", detective_novel);

        for(Map.Entry map:library.entrySet()){
            System.out.println("Key : " +map.getKey() + "," +" Value : " + map.getValue());
        }
    }
}
