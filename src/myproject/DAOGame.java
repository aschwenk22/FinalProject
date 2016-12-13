package myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew
 */
public class DAOGame {
    
    private final String fileName = "gamefile.txt";
    private List<Game> gameList;  
    private int[] x = new int[2000];
    private int n;
    private int listLength;
    
    public DAOGame() {
        
        gameList = new ArrayList();
        
        try {
            Files.createFile(Paths.get(fileName));
        } catch (FileAlreadyExistsException fae) {
            ;
        } catch (IOException ex) {
            Logger.getLogger(DAOGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        readList();
    }
    
    
        
    private void readList() {
        Path path = Paths.get(fileName);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data;
                data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String title = data[1];
                int releaseYear = Integer.parseInt(data[2]);
                double cost = Double.parseDouble(data[3]);
                String rating = data[4];
                                
                Game mygame = new Game(id, releaseYear, cost, title, rating);
                gameList.add(mygame);
            }
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void writeList() {
        Path path = Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            for (Game game : gameList) {
                writer.write(String.format("%d,%s,%d,%.2f,%s\n", 
                        game.getId(), 
                        game.getTitle(),
                        game.getReleaseYear(),
                        game.getCost(),
                        game.getRating()));
            }
        } catch (IOException ex) {
            Logger.getLogger(DAOGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void create(Game game){
        gameList.add(game);
        writeList();
    }
    
    
    public Game retrieve(int id){
        for(Game game : gameList){
            if(game.getId() == id){
                return game;
            }
        }
        return null;
    }
    
    public void update(Game game){
        for(Game g : gameList){
           if(g.getId() == game.getId()){
               g.setTitle(game.getTitle());
               g.setCost(game.getCost());
               g.setRating(game.getRating());
               g.setReleaseYear(game.getReleaseYear());
               break;
           }
        }
        writeList();
    }
    
    public void delete(int id){
        Game myGame = null;
        for(Game g : gameList){
            if(g.getId() == id){
                myGame = g;
                break;
            }
        }
        gameList.remove(myGame);
        writeList();
    }
    
    public String orderById() {
        gameList.sort(Comparator.comparing(Game::getId));
        return this.toString();       
    }
    
    public String orderByTitle() {
        gameList.sort(Comparator.comparing(Game::getTitle));
        return this.toString();       
    }
    
    public String orderByReleaseYear() {
        gameList.sort(Comparator.comparing(Game::getReleaseYear));
        return this.toString();       
    }
    
    public String orderByCost() {
        gameList.sort(Comparator.comparing(Game::getCost));
        return this.toString();       
    }
    
    public String orderByRating() {
        gameList.sort(Comparator.comparing(Game::getRating));
        return this.toString();       
    }
    
    public String orderByTitleReleaseYear() {
        gameList.sort(Comparator.comparing(Game::getTitle).thenComparing(Game::getReleaseYear));
        return this.toString();     
    }
    
    public String orderByTitleCost() {
        gameList.sort(Comparator.comparing(Game::getTitle).thenComparing(Game::getCost).reversed());
        return this.toString();     
    }
    
    public String orderByTitleRating() {
        gameList.sort(Comparator.comparing(Game::getTitle).thenComparing(Game::getRating));
        return this.toString();     
    }
    
    public String orderByReleaseYearCost() {
        gameList.sort(Comparator.comparing(Game::getReleaseYear).thenComparing(Game::getCost));
        return this.toString();     
    }
    
    public String orderByReleaseYearRating() {
        gameList.sort(Comparator.comparing(Game::getReleaseYear).thenComparing(Game::getRating));
        return this.toString();     
    }
    
    public String orderByCostRating() {
        gameList.sort(Comparator.comparing(Game::getCost).thenComparing(Game::getRating));
        return this.toString();     
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Game game : gameList) {
            sb.append(game).append("\n");
        }
        return sb.toString();
    }
}
