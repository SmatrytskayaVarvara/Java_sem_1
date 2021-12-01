package laba3;

public class FryingPan extends Dishes{
    private double HandleLength;
    private String Cover;

    public FryingPan(String Manufacturer, double Cost, String Style, double HandleLength, String Cover){
        super (Manufacturer, Cost, Style);
        this.HandleLength = HandleLength;
        this.Cover = Cover;
    }

    public FryingPan(double Cost, String Style, double HandleLength){
        super (Cost, Style);
        this.HandleLength = HandleLength;
    }

    public FryingPan(){
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
    public double getHandleLength() {
        return HandleLength;
    }
    public String getCover() {
        return Cover;
    }
    public String Title(){
        String title = "FryingPan";
        return title;
    }
}
