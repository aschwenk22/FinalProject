package myproject;

import java.util.Scanner;
import utilities.Prompt;

/**
 *
 * @author Andrew
 */
public class GameAppMenu {
    Scanner sc = new Scanner(System.in);
    DAOGame data = new DAOGame();
    
    public GameAppMenu() {
        menuLoop();
    }
    
    private void menuLoop() {
        int choice = 1;
        int id;
        int releaseYear;
        double cost;
        String title;
        String rating;
    
        while (choice != 0) {
            System.out.println("\nGame App");
            System.out.println("0 = Quit");
            System.out.println("1 = Retrieve All Records");
            System.out.println("2 = Create New Record");
            System.out.println("3 = Retrieve Single Record");
            System.out.println("4 = Update");
            System.out.println("5 = Delete");
            System.out.println("6 = Retrieve All: Order by Id");
            System.out.println("7 = Retrieve All: Order by Title");
            System.out.println("8 = Retrieve All: Order by Release Year");
            System.out.println("9 = Retrieve All: Order by Price");
            System.out.println("10 = Retrieve All: Order by Rating");
            System.out.println("11 = Retrieve All: Order by Title / Release Year");
            System.out.println("12 = Retrieve All: Order by Title / Price");
            System.out.println("13 = Retrieve All: Order by Title / Rating");
            System.out.println("14 = Retrieve All: Order by Release Year / Price");
            System.out.println("15 = Retrieve All: Order by Release Year / Rating");
            System.out.println("16 = Retrieve All: Order by Price / Rating");
            System.out.println("17 = Statistics");
            choice = Prompt.getInt("Number of choice: ", 0, 17);
            
            if (choice == 1) {
                System.out.println(data.toString());
            } else if (choice == 2) {
                id = Prompt.getInt("Enter game id: ");
                title = Prompt.getLine("Enter title: ");
                releaseYear = Prompt.getInt("Enter release year: ");
                cost = Prompt.getDouble("Enter price: ");
                rating = Prompt.getLine("Enter rating: ");
                Game g = new Game(id, releaseYear, cost, title, rating);
                data.create(g);
            } else if (choice == 3) {
                id = Prompt.getInt("Enter game id: ");
                System.out.println(data.retrieve(id));
            } else if (choice == 4) {
                id = Prompt.getInt("Enter game id: ");
                releaseYear = Prompt.getInt("Enter release year: ");
                cost = Prompt.getDouble("Enter price: ");
                title = Prompt.getLine("Enter title: ");
                rating = Prompt.getLine("Enter rating: ");
                Game game = new Game(id, releaseYear, cost, title, rating);
                data.update(game);
            } else if (choice == 5) {
                id = Prompt.getInt("Enter game id: ");
                data.delete(id);
            } else if (choice == 6) {
                System.out.println(data.orderById());
            } else if (choice == 7) {
                System.out.println(data.orderByTitle());
            } else if (choice == 8) {
                System.out.println(data.orderByReleaseYear());
            } else if (choice == 9) {
                System.out.println(data.orderByCost());
            } else if (choice == 10) {
                System.out.println(data.orderByRating());
            } else if (choice == 11) {
                System.out.println(data.orderByTitleReleaseYear());
            } else if (choice == 12) {
                System.out.println(data.orderByTitleCost());
            } else if (choice == 13) {
                System.out.println(data.orderByTitleRating());
            } else if (choice == 14) {
                System.out.println(data.orderByReleaseYearCost());
            } else if (choice == 15) {
                System.out.println(data.orderByReleaseYearRating());
            } else if (choice == 16) {
                System.out.println(data.orderByCostRating());
            } else if (choice == 17) {
                ;
            } else if (choice == 0) {
                ;
            }
            
        }
    }
    
    public static void main(String[] args) {
        GameAppMenu Menu = new GameAppMenu();
        System.out.println(Menu);
    }
}
        

    