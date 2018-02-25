package com.orchestra;

import com.orchestra.model.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CRUD app for Score Management
 *
 * By Cleyra Uzcategui
 *
 */
public class App
{

    static List<Score> scores = new ArrayList<Score>();

    static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        while (true) {
            System.out.println("Please select an option");
            System.out.println(showMenu());
            selectOptionFromUser();
        }
    }

    private static void selectOptionFromUser() {
        System.out.println("Please select one of the following options:");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                createScore();
                break;
            case 2:
                listScores();
                break;
            case 3:
                deleteScore();
                break;
            case 4:
                updateScore();
             default:
                 System.out.println("That option doesn't exist.");
                 break;
        }
    }

    private static void updateScore() {
        listScores();
        System.out.println("Select the Id of the Score to update: ");
        int scoreToUpdate = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the new Score Author");
        scores.get(scoreToUpdate).author = scanner.nextLine();

        System.out.println("Insert the new Year for the Score:");
        scores.get(scoreToUpdate).year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert the new Tittle for the Score:");
        scores.get(scoreToUpdate).tittle = scanner.nextLine();

    }


    private static void deleteScore() {
        System.out.println("Select the Id of the Score to delete:");
        int scoreToDelete = scanner.nextInt();
        scores.remove(scoreToDelete);
    }

    private static void listScores() {
        int scoreId=0;
        for(Score score : scores){
            System.out.println("Id: "+scoreId+" "+score);
            scoreId++;
        }
    }

    private static String showMenu(){
        return  "1.- Add new Score\n" +
                "2.- Show Scores\n" +
                "3.- Delete a Score\n" +
                "4.- Update Score";
    }

    private static void createScore(){
        scanner.nextLine();
        Score score = new Score();
        System.out.println("Insert title of the Score:");
        score.tittle = scanner.nextLine();
        System.out.println("Insert the year of the Score:");
        score.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert the author of the Score:");
        score.author = scanner.nextLine();

        scores.add(score);
    }
}
