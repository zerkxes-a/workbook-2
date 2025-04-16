package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the scoring information: ");
 // Home:Visitor|21:9
        String userinput = input.nextLine();
        String[] tokens = userinput.trim().split(Pattern.quote("|"));
        String[] teams = tokens[0].split(Pattern.quote(":"));

        String home = teams[0];
        String away = teams[1];


        String[] scores = tokens[1].split(Pattern.quote(":"));

        int home_score = Integer.parseInt(scores[0]);
        int away_score = Integer.parseInt(scores[1]);


        if (home_score > away_score){
            System.out.printf("Winner: %s", home);
        }else if (away_score > home_score){
            System.out.printf("Winner: %s", away);
        }else System.out.println("The game is tied!");



    }
}
