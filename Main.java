/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.*;  

public class Main {
    
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter your name: ");
        String iname = scanner.nextLine();
        if (iname.equals("Alice") || iname.equals("Bob")) {
            System.out.print("Hello " + iname + "!");
    }
        if (iname.equals("Will")) {
            System.out.print("All hail the creator!");
    }
}
}
