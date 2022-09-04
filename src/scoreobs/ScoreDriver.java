/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreobs;
import java.util.*;
/**
 *
 * @author pwn233
 */
public class ScoreDriver {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String sc = "";
        Score score = new Score();
        ScoreObserver user_1 = new ScoreObserver();
        ScoreObserver user_2 = new ScoreObserver();
        score.add(user_1);
        score.add(user_2);
        System.out.print("Enter Score ");
        sc = input.nextLine();
        while(!sc.isEmpty()) {
            score.setScore(sc);
            sc = "";
            System.out.print("Enter score ");
            sc = input.nextLine();
        }
    }
}
