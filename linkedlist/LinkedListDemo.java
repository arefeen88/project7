package linkedlist;


import java.util.LinkedList;

public class LinkedListDemo {

    public static <string> void main(String[] args) {

        LinkedList <String> countryNames = new LinkedList <String>();


        countryNames.add("Bhutan");
        countryNames.add("Australia");
        countryNames.add("Nepal");
        countryNames.add("Pakistan");
        countryNames.add("Germany");
        countryNames.addFirst("Canada");
        countryNames.addLast("Singapore");
        countryNames.remove(5);
        countryNames.removeFirst();
        countryNames.removeLast();

        for(String x : countryNames){
            System.out.println(x);
        }

    }
}
