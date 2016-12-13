package myproject;

import java.awt.BorderLayout;

/**
 *
 * @author Andrew
 */
public class GameApp {
    
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.setId(1);
        g1.setReleaseYear(2012);
        g1.setCost(60.00);
        g1.setTitle("Call of Duty");
        g1.setRating("M");
        
        Game g2 = new Game();
        g2.setId(2);
        g2.setReleaseYear(2014);
        g2.setCost(20.00);
        g2.setTitle("Zombie Shooter");
        g2.setRating("T");
        
        Game g3 = new Game();
        g3.setId(3);
        g3.setReleaseYear(2010);
        g3.setCost(40.00);
        g3.setTitle("Puzzle Game");
        g3.setRating("E");
        
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());
    }    
    
}
