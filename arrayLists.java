import java.util.ArrayList;
import java.util.Collections;
public class arrayLists{
    public static void main(String[] args) {
        //arraylist creation
        ArrayList<Integer> list=new ArrayList<>();
        //method to add elements in arraylist
        list.add(20);
        list.add(30);
        list.add(210);
        list.add(2,30); // adding according to index values
        list.remove(2); //removing elements 
        System.out.println(list); //we can simply print the list
        for(Integer i:list)
         System.out.println(i); // we can also iterate over list;
        Collections.sort(list); //method to sort the list 
    }
}