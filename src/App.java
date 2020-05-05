import processing.core.PApplet;

public class App extends PApplet {

    Card c = new Card();

    public static void main(String[] args) {
        PApplet.main("App");
    }


    public void settings() {
        size(800, 600);


        Rank r = new Rank("Jack", 11);
        Rank jack = new Rank("Jack", 11);
        Rank ace = new Rank("Ace", 14);

        if (ace.getValue() > jack.getValue()) {
            //ace is greater
        }
    }
}