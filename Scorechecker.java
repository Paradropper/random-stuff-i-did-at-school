import java.util.Scanner;

public class Scorechecker{
    public static void main(String[] args){
        Scanner drone = new Scanner(System.in);
        System.out.print("Input the maximum score: ");
        int maxscore = drone.nextInt();
        
        System.out.print("Input your score: ");
        int score = drone.nextInt();
        
        if (score == maxscore) {
            System.out.println("You Got a Perfect Score!!!"); 
            } else if (score < (maxscore-1) && score > 0) {
                System.out.println("You made " + (maxscore-score) + " mistakes. You can do better than that!");
            } else if (score == (maxscore-1)) { 
                System.out.println("Ooooh... so close. you made just one mistake.\nits okay, you'll get that perfect score next time.");
            } else if (score < 0) {
                System.out.println("How did you get a negative score? were you caught cheating??");
            } else if (score > maxscore) {
                System.out.println("Wow! You got " + (score-maxscore) + " points higher than the maximum score of  " + maxscore + "!\nDid you bribe the examiner?");
            }
    
}
}
