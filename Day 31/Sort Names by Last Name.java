import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // List to hold the names entered by the user
        List<String> names = new ArrayList<>();

        // Prompt the user to enter names
        System.out.println("Enter names (press Enter without input to finish):");

        // Read names from the user until an empty line is entered
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Exit the loop if an empty line is entered
            }
            names.add(input);
        }

        // Sort the names based on last name
        Collections.sort(names, Comparator.comparing(name -> {
            String[] parts = name.split("\\s+");
            return parts[parts.length - 1]; // Return the last name
        }));

        // Output the sorted names
        System.out.println("Sorted names by last name:");
        for (String name : names) {
            System.out.println(name);
        }

        // Close the scanner
        scanner.close();
    }
}
