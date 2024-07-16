/*Program to maintain a list of Strings using ArrayList from collection framework, 
perform built-in operations. */

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String element;
        int choice;

        do {
            System.out.print(
                    "\n----------------\n1: Add\n2: Size\n3: Search by Index\n4: Find Index\n5: Contains\n6: Remove\n7: Remove by Index\n8: Display\n9: Clear List\n0: Exit\n----------------\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = scanner.next();
                    arrayList.add(element);
                    break;
                case 2:
                    System.out.println("Size of the ArrayList: " + arrayList.size());
                    break;
                case 3:
                    System.out.print("Enter index of element to search: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < arrayList.size()) {
                        System.out.println("Element at index " + index + " is " + arrayList.get(index));
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 4:
                    System.out.print("Enter an element to find index: ");
                    element = scanner.next();
                    int foundIndex = arrayList.indexOf(element);
                    if (foundIndex != -1) {
                        System.out.println("Index of " + element + " is " + foundIndex);
                    } else {
                        System.out.println(element + " not found in the ArrayList.");
                    }
                    break;
                case 5:
                    System.out.print("Enter an element to check: ");
                    element = scanner.next();
                    boolean containsElement = arrayList.contains(element);
                    System.out.println(element + " is in the ArrayList: " + containsElement);
                    break;
                case 6:
                    System.out.print("Enter the element to be removed: ");
                    element = scanner.next();
                    boolean removed = arrayList.remove(element);
                    if (removed) {
                        System.out.println("After removing " + element + ", ArrayList: " + arrayList);
                    } else {
                        System.out.println(element + " not found in the ArrayList.");
                    }
                    break;
                case 7:
                    System.out.print("Enter the index to remove the element: ");
                    index = scanner.nextInt();
                    if (index >= 0 && index < arrayList.size()) {
                        arrayList.remove(index);
                        System.out.println("After removing the element, ArrayList: " + arrayList);
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 8:
                    System.out.println("ArrayList: " + arrayList);
                    break;
                case 9:
                    arrayList.clear();
                    System.out.println("ArrayList cleared.");
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
