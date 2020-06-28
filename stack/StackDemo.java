package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        //Creating a stack;

        Stack <String> stackofcards = new Stack<>();


        //pushing new item to the stack;

        stackofcards.push("Jack");
        stackofcards.push("Queen");
        stackofcards.push("King");
        stackofcards.push("Ace");




        while(!stackofcards.isEmpty())

        System.out.println(stackofcards.pop());



    }
}
