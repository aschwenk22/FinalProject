/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author Andrew
 */
public class GameApp2 {
    public static void main(String[] args) {
        System.out.println("Game App 2");
        DAOGame games = new DAOGame();
        //games.create(new Game(1, 2012, 60, "Call of Duty", "M"));
        //games.create(new Game(2, 2014, 20, "Zombie Shooter", "T"));
        //games.create(new Game(3, 2010, 60, "Puzzle Game", "E"));
        //System.out.println(games);
        
        //System.out.println(games.retrieve(2));
        //System.out.println(games.retrieve(-1));
        
        //Game g1 = new Game(2, 2013, 25, "Zombie Shooter", "T");
        //games.update(g1);
        //System.out.println(games);
        System.out.println(games);
        
    }

    
}
