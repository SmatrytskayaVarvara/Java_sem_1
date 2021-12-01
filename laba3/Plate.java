package laba3;

public class Plate extends Dishes{
    private double Diameter;

    public Plate(String Manufacturer, double Cost, String Style, double Diameter){
        super (Manufacturer, Cost, Style);
        this.Diameter = Diameter;
    }

    public Plate(double Cost, String Style, double Diameter){
        super (Cost, Style);
        this.Diameter = Diameter;
    }

    public Plate(double Cost, String Style){
        super (Cost, Style);
    }

    public Plate(){
        super();
    }

    public String getManufacturer() {
        return Manufacturer;
    }
    public double getCost() {
        return Cost;
    }
    public String getStyle() {
        return Style;
    }
    public double getDiameter() {
        return Diameter;
    }

    public String Title(){
        String title = "Plate";
        return title;
    }
}
