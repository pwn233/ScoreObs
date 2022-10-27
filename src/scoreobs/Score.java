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
public class Score {
    private String scoreData;
    private ArrayList<ScoreObserver> scoreList;
    public Score() {
       scoreList = new ArrayList<ScoreObserver>();
    }
    public void setScore(String data) {
        scoreData = data;
        notifyAllObs();
        System.out.println("live result: "+scoreData);
    }
    public String getScore() {
        return scoreData;
    }
    
    public void add(ScoreObserver scob) {
        scoreList.add(scob);
    }
    public void notifyAllObs() {
        for(int i = 0; i< scoreList.size(); ++i) 
            scoreList.get(i).update(this);
    }
}
