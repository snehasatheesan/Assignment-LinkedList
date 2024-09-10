//1.Write a Java program that creates a `LinkedList` of integers.
    //Add the numbers 5, 10, 15, 20, and 25 to the list. Retrieve and print the first and last elements in the list

package linkedlist;
import java.util.Arrays;
import java.util.LinkedList;

public class code1 {
    public static void main(String[] args) {
        LinkedList<Integer> sc=new LinkedList<>();
        sc.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println("The first element is: "+sc.getFirst());
        System.out.println("The last element is: "+sc.getLast());
    }
}
