package myproject;

/**
 *
 * @author Andrew
 */
public class GameApp3 {
    public static void main(String[] args) {
        System.out.println("Game App 3");
        DAOGame data = new DAOGame();
        //data.create(new Game(1, 2012, 60, "Call of Duty", "M"));
        //data.create(new Game(2, 2014, 20, "Zombie Shooter", "T"));
        //data.create(new Game(3, 2010, 40, "Puzzle Game", "E"));
        System.out.println(data.toString());
    }
}
