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
public class GameArray {
    private final Game[] games;
    private int n;
    
    public GameArray() {
        games = new Game[1000];
        n = 0;
    }
    
    public void create(Game game) {
        games[n] = game;
        n++;
    }
    @Override
    public String toString() {        
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<n; i++) {
            sb.append(games[i]).append("\n");
        }
        return sb.toString();
    }
}
