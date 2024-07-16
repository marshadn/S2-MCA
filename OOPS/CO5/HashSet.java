//Program to demonstrate the creation of Set object using the LinkedHashset class.

import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        String element;
        int choice;

        do {
            System.out.print(
                    "\n----------------\n1: Add\n2: Remove\n3: Display\n4: Search\n0: Exit\n----------------\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = scanner.next();
                    linkedHashSet.add(element);
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    element = scanner.next();
                    linkedHashSet.remove(element);
                    break;
                case 3:
                    System.out.println("LinkedHashSet: " + linkedHashSet);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    element = scanner.next();
                    boolean containsElement = linkedHashSet.contains(element);
                    System.out.println("Set contains " + element + " : " + containsElement);
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
