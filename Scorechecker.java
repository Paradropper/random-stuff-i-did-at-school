import java.util.Scanner;
import java.util.Arrays;

public class Scorechecker {
    public static void main(String[] args) {
        Scanner drone = new Scanner(System.in);
        System.out.print("Input the maximum score: ");
        double maxscore = drone.nextDouble();

        System.out.print("Input your score: ");
        double score = drone.nextDouble();

        //conditions for scores
        if (score == maxscore) {
            System.out.println("You Got a Perfect Score!!!");
            } else if (score < (maxscore - 1) && score > 0) {
                 System.out.println("You made " + (maxscore - score) + " mistakes. You can do better than that!");
                } else if (score == (maxscore - 1)) {
                    System.out.println("Ooooh... so close. you made just one mistake.\nits okay, you'll get that perfect score next time.");
                    } else if (score < 0) {
                    System.out.println("How did you get a negative score? were you caught cheating??");
                        } else if (score > maxscore) {
                        System.out.println("Wow! You got " + (score - maxscore) + " points higher than the maximum score of  " + maxscore + "!\nDid you bribe the examiner?");
                        }
        
        System.out.println("");
        
        Scanner commands = new Scanner(System.in);
        String command = "";

        String hailey = "Hailey = " + (int)(maxscore*(59.0/100));
        String robert = "Robert = " + (int)(maxscore*(76.0/100));
        String emily = "Emily = " + (int)(maxscore*(91.0/100));
        String alfred = "Alfred = " + (int)(maxscore*(95.0/100));
        String you = "You = " + (int)score; 
        
        String[] rankings = {hailey, robert, emily, alfred, you};
        
        Arrays.sort(rankings, (a, b) -> {
            String[] partsA = a.split(" = ");
            String[] partsB = b.split(" = ");
            int scoreA = Integer.parseInt(partsA[1]);
            int scoreB = Integer.parseInt(partsB[1]);
            return Integer.compare(scoreB, scoreA);
        });
        
    do {
        System.out.print("Enter a command: ");
        command = commands.nextLine();

    if (command.equals("percentage")) {
        System.out.println("You got " + String.format("%.2f", ((score / maxscore) * 100)) + "%");
        } else if (command.equals("help")) {
            System.out.println("\nCommand List\npercentage - gives the percentage of the maximum score you got.\nrankings - shows your rank in class based on your score\nquit - exits the program.");
            }  else if (command.equals("rankings")) {
                for (int i = 0; i < rankings.length; i++) {
                    System.out.println(("#" + (i + 1)) + " is " + rankings[i]);
                }
            } else if (!command.equals("quit")) {
                System.out.println("Unknown command. Type 'help' for a list of available commands.");

            } 

            
    } while (!command.equals("quit"));  
        System.out.print("Quitting...");

        drone.close();
        commands.close();
    }
}

