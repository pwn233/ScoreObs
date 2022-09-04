/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreobs;

/**
 *
 * @author pwn233
 */
public class ScoreObserver {
    public void update(Score x) {
        System.out.println("live result "+x.getScore());
    }
}
