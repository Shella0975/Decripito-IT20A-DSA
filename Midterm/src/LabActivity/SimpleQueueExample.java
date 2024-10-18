package LabActivity;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("23");
        queue.add("42");
        queue.add("13");

        String firstElement = queue.poll();
        String secondElement = queue.poll();

        System.out.println("Remaining elements in the queue: " + queue);

        queue.add("Samsung");
        queue.add("Acer");

        String thirdElement = queue.poll();

        System.out.println("Remaining elements in the queue: " + queue);
    }
}