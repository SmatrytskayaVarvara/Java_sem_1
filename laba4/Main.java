package laba4;

public class Main {
    public static void main(String[] args){
        Pan pan1 = new Pan("Tefal", 30.5, "Dotted", 2.5, true);
        pan1.printInfo();

        FryingPan fryingpan1 = new FryingPan("Rondell", 50.3, "Black", 3.6, "Metal");
        fryingpan1.printInfo();

        SaladDish saladdish1 = new SaladDish();
        saladdish1.printInfo();

        Saucer saucer1 = new Saucer();
        saucer1.printInfo();
    }
}
