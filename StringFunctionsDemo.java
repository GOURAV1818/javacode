package lab3a;

import java.util.*;

public class StringFunctionsDemo {
    public static void main(String[] args) {

        // String Creation and Basic Operations
        String str = "  Welcome to AIET College  ";
        System.out.println("Original String: " + str);

        // Length and Character Access
        System.out.println("Length of String: " + str.length());
        System.out.println("Character at index 4: " + str.charAt(4));

        // String Comparison
        String s1 = "Java";
        String s2 = "java";

        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
        System.out.println("CompareTo: " + s1.compareTo(s2));

        // String Searching
        System.out.println("Contains AIET: " + str.contains("AIET"));
        System.out.println("Index of College: " + str.indexOf("College"));

        // Substring Operations
        System.out.println("Substring (2,10): " + str.substring(2,10));

        // String Modification
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace AIET with XYZ: " + str.replace("AIET", "XYZ"));

        // Whitespace Handling
        System.out.println("Trimmed String: " + str.trim());

        // String Concatenation
        String first = "Java";
        String second = "Programming";
        System.out.println("Concatenated String: " + first.concat(" " + second));

        // String Splitting
        String colors = "Red,Blue,Green,Yellow";
        String arr[] = colors.split(",");

        System.out.println("After Splitting:");
        for(String color : arr) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" AIET");
        System.out.println("StringBuilder Output: " + sb);

        // String Formatting
        String name = "Student";
        int marks = 90;
        System.out.println(String.format("Name: %s Marks: %d", name, marks));

        // Validate Email
        String email = "student@gmail.com";

        if(email.contains("@") &&
           email.startsWith("student") &&
           email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}