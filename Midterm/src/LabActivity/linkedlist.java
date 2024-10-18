package LabActivity;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<>();


      person.add("BUDANG");
        person.addFirst("LALA");
        person.addLast("ATE CHE");
        person.add(1, "SWEETYCAT");

        System.out.println("Linked List Original: " + person);
        System.out.println(person.size());


        if (person.contains("SWEETYCAT")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = person.contains("SWEETYCAT");
        System.out.println(containslion);


    }

}