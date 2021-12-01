package laba3;

public class Pan extends Dishes{
    private double Volume;
    private boolean Lid;

    public Pan(String Manufacturer, double Cost, String Style, double Volume, boolean Lid){
        super (Manufacturer, Cost, Style);
        this.Volume = Volume;
        this.Lid = Lid;
    }

    public Pan(double Cost, String Style, double Volume){
        super (Cost, Style);
        this.Volume = Volume;
    }

    public Pan(){
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
    public double getVolume() {
        return Volume;
    }
    public boolean getLid() {
        return Lid;
    }
    public String Title(){
        String title = "Pan";
        return title;
    }
}
