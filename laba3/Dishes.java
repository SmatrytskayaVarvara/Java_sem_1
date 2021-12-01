package laba3;

public class Dishes {

    protected String Manufacturer;
    protected double Cost;
    protected String Style;

    public String getManufacturer() {
        return Manufacturer;
    }
    public double getCost() {
        return Cost;
    }
    public String getStyle() {
        return Style;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public String Title (){
        String title = "Unknown";
        return title;
    }

    public Dishes(String manufacturer1, double cost1, String style1){
        Manufacturer = manufacturer1;
        Cost = cost1;
        Style = style1;
    }

    public Dishes(double cost1, String style1){
        Cost = cost1;
        Style = style1;
    }

    public Dishes(){
    }
}
