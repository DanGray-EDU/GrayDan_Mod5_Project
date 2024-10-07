import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
/**
 * Collection: This class implements a program that reads a list of integers
 * from user input, stores them into a Stack, and sorts them
 * from smallest to largest.
 * @author Dan Gray
 * CSC6301
 * Module 5 Project
 * 
 * Task: Plan and execute a maintenance task to your last project (Project #4) adapting to be now a Stack and not a LinkedList
 */
public class Collection 
{
/**
     * The main method of the Collection class takes a list of integers 
     * defined by the user using the scanner class until the user types 'done'. 
     * If there are any non-integer values input the program will ask again until 
     * an integer is input  or get the escape pharse done. Once the list is input 
     * all the integers are added to the Stack 'myCollection' and sorted using the
     * Collection library with its built in sort method.
     * 
     * @param args default parameter for a main - not used
     * 
     * myCollection: Stack object that holds the list of integers
     * inputScanner: Scanner object the accepts the input from the user
     */
    public static void main(String[] args)
    {
        Stack<Integer> myCollection = new Stack<>(); // Object instantiated by Stack Class
        Scanner inputScanner = new Scanner(System.in); // Object instantiated by the Scanner Class
        
        System.out.println("Input a list of integers pressing the 'return key' after each integer (type 'done' to finish):");
        
        while (inputScanner.hasNext()) 
        {
            String input = inputScanner.next();
            
            if (input.equalsIgnoreCase("done")) // Break condition for the while loop 
            {
                break;
            }
            
            try 
            {
                // Tries to parse 'input' into an integer if fails an exception is raised and asks for another integer
                int myNumber = Integer.parseInt(input); 
                myCollection.add(myNumber);       
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please input an integer or 'done' to finish.");
            }
        }
        inputScanner.close();
    
        Collections.sort(myCollection); // Sorts myCollection

        System.out.println("Sorted Collection: " + myCollection);
    }
}
