package laba3;

public class WriterInfo {
    public static void main(String[] args) {
        Pan pan1 = new Pan("Tefal", 30.5, "Dotted", 2.5, true);
        System.out.println("Pan1: manufacturer - " + pan1.getManufacturer() + "; cost - " + pan1.getCost() + ";" +
                " style - " + pan1.getStyle() + "; volume - " + pan1.getVolume() + "; lid - " + pan1.getLid() + " ");

        Pan pan2 = new Pan(33.2, "Striped", 1.5);
        System.out.println("Pan2: manufacturer - " + pan2.getManufacturer() + "; cost - " + pan2.getCost() + ";" +
                " style - " + pan2.getStyle() + "; volume - " + pan2.getVolume() + "; lid - " + pan2.getLid() + " ");

        Pan pan3 = new Pan();
        System.out.println("Pan3: manufacturer - " +pan3.getManufacturer() + "; cost - " + pan3.getCost() + ";" +
                " style - " + pan3.getStyle() + "; volume - " +pan3.getVolume() + "; lid - " + pan3.getLid() + " ");

        FryingPan fryingpan1 = new FryingPan("Rondell", 50.3, "Black", 3.6, "Metal");
        System.out.println("Frying Pan1: manufacturer - " + fryingpan1.getManufacturer() + "; cost - " + fryingpan1.getCost() + ";" +
                " style - " + fryingpan1.getStyle() + "; volume - " + fryingpan1.getHandleLength() + "; cover - " + fryingpan1.getCover() + " ");

        FryingPan fryingpan2 = new FryingPan(55.4, "Brown", 4.3);
        System.out.println("Frying Pan2: manufacturer - " + fryingpan2.getManufacturer() + "; cost - " + fryingpan2.getCost() + ";" +
                " style - " + fryingpan2.getStyle() + "; volume - " + fryingpan2.getHandleLength() + "; cover - " + fryingpan2.getCover() + " ");

        FryingPan fryingpan3 = new FryingPan();
        System.out.println("Frying Pan3: manufacturer - " + fryingpan3.getManufacturer() + "; cost - " + fryingpan3.getCost() + ";" +
                " style - " + fryingpan3.getStyle() + "; volume - " + fryingpan3.getHandleLength() + "; cover - " + fryingpan3.getCover() + " ");

        Plate plate1 = new Plate("Luminarc", 4.9, "Rectangular", 20.5);
        System.out.println("Plate1: manufacturer - " + plate1.getManufacturer() + "; cost - " + plate1.getCost() + ";" +
                " style - " + plate1.getStyle() + "; volume - " + plate1.getDiameter() + " ");

        Plate plate2 = new Plate(3.8, "Circular");
        System.out.println("Plate2: manufacturer - " + plate2.getManufacturer() + "; cost - " + plate2.getCost() + ";" +
                " style - " + plate2.getStyle() + "; volume - " + plate2.getDiameter() + " ");

        Plate plate3 = new Plate();
        System.out.println("Plate3: manufacturer - " + plate3.getManufacturer() + "; cost - " + plate3.getCost() + ";" +
                " style - " + plate3.getStyle() + "; volume - " + plate3.getDiameter() + " ");
    }
}
