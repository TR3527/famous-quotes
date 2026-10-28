package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String[] favoriteQuotes = new String[10];

        favoriteQuotes[0] = "The secret of getting ahead is getting started.";
        favoriteQuotes[1] = "You don't have to be great to start, but you have to start to be great.";
        favoriteQuotes[2] = "Act as if what you do makes a difference. It does.";
        favoriteQuotes[3] = "If you can't fly, then run... keep moving forward.";
        favoriteQuotes[4] = "It's not whether you get knocked down, it's whether you get up.";
        favoriteQuotes[5] = "When nothing goes right, go left.";
        favoriteQuotes[6] = "Whether you think you can or think you can't, you're right.";
        favoriteQuotes[7] = "Life begins at the end of your comfort zone.";
        favoriteQuotes[8] = "Create your own sunshine.";
        favoriteQuotes[9] = "Work hard in silence, let your success be your noise.";

        System.out.print("Select a number between 1-10 to display a quote: ");
        int numberChoice = read.nextInt();

        System.out.println(favoriteQuotes[numberChoice-1]);




//        for(int i = 0; i < favoriteQuotes.length; i++){
//
//            if(numberChoice == favoriteQuotes[i]){
//                System.out.println(favoriteQuotes[i]);
//            }
//        }








    }
}
