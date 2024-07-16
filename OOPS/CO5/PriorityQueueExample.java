//Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        String element;
        int choice;

        do {
            System.out.print(
                    "\n----------------\n1: Add\n2: Remove\n3: Display\n4: Head\n0: Exit\n----------------\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = scanner.next();
                    priorityQueue.add(element);
                    break;
                case 2:
                    if (!priorityQueue.isEmpty()) {
                        priorityQueue.remove();
                    } else {
                        System.out.println("Queue is empty, cannot remove.");
                    }
                    break;
                case 3:
                    System.out.println("Priority Queue: " + priorityQueue);
                    break;
                case 4:
                    if (!priorityQueue.isEmpty()) {
                        System.out.println("Head of the queue: " + priorityQueue.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
