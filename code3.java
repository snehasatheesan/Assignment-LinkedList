//3. Write a Java program that creates a `LinkedList` of integers.
    // Add the numbers 1 to 10 to the list.
    // Then, remove the third element (index 2) and the last element from the list. Print the resulting list.
package linkedlist;
import java.util.LinkedList;

public class code3 {
    
    public static void main(String[] args) {
        LinkedList<Integer> sc=new LinkedList<>();
        for(int i=1;i<=10;i++)
            sc.add(i);
        sc.remove(2);
        sc.removeLast();
        System.out.println("Linked List is: "+sc);
    }
}
