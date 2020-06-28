package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {


    public static void main(String[] args) {

Queue<String> line = new LinkedList<>();
line.add("Tahsin");
line.add("Tahmid");
line.add("Ayan");
line.add("Akil");
line.offer("Rahman");

line.remove();
line.poll();
line.peek();
line.element();


for(String name : line){
    System.out.println(name);
}




    }
}
