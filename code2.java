 //2. Create a Java program that initializes a `LinkedList` of strings with the values {"one", "two", "three", "four", "five"}.
    // Use a `ListIterator` to iterate through the list and replace every occurrence of the word "three" with "THREE".
    // Print the modified list.
package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class code2 {
   
    public static void main(String[] args) {
        LinkedList<String> sc=new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five"));
        ListIterator<String> listIterator= sc.listIterator();
        while (listIterator.hasNext()){
            String current = listIterator.next();
            if (current.equals("five")) {
                listIterator.set("FIVE");
            }
        }
        System.out.println(sc);
    }
}
