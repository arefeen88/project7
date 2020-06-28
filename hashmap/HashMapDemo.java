package hashmap;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {




    public static void main(String[] args) {


        HashMap<Integer,String> student = new HashMap<Integer,String>();

        student.put(101,  "Tahmid");
        student.put(102,  "Tahsin");
        student.put(103,   "Akil");
        student.put(104,    "Ayan");

        System.out.println(student.get(101));
        System.out.println(student.get(103));
        System.out.println(student.get(104));
        }

    }

