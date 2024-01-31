// Programmers: Bonita Rodrigues
// Course: CS212, Professor Nweke
// Due Date: 2/1/24
// Lab Assignment: Ski Jump (Class Assessment)
// Problem Statement: Compute the distance traveled by ski jumper and points earned for jump and assess the quality of the jump
// Data In: jump type (normal vs large), speed at end of the ramp
// Data Out: distanced traveled, points earned, statement on how the jumper did
// Credits: none

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // Opening statements
        Scanner input = new Scanner(System.in);
        System.out.println("This program will compute distance traveled and points earned by a ski jump and assess the overall jump score.");
        // Asks the user for jump type and ending speed of jumper
        System.out.println("What was the jump type (normal or large)? ");
        String jumpType = input.nextLine();
        jumpType = jumpType.toLowerCase();
        System.out.println("What was you speed at the end of the ramp? ");
        double endSpeed = input.nextDouble();
        // Initializes variables dist and points
        double dist = 0;
        double points = 0;

        // Determines distance and points earned based on jump type
        if (jumpType.equals("normal")) {
            dist = endSpeed * (Math.sqrt(92/9.8)); // calculations for distance
            points = 60 + (dist-90)*2; // calculations for points
        } else if (jumpType.equals("large")) {
            dist = endSpeed * (Math.sqrt(140/9.8));
            points = 60 + (dist-120)*1.8;
        }

        // Outputs distance traveled and points earned to the user
        System.out.println("\nYour distance is: " + dist);
        System.out.println("Your total points are: " + points);

        // Outputs statement according to how many points the user earned (how well they did)
        if (points >= 61){
            System.out.println("Great job doing better than par!"); // did good
        } else if (points < 10){
            System.out.println("What happened?"); // did badly
        } else {
            System.out.println("Sorry you didn't get very far"); // did okay
        }
        
    }
}
