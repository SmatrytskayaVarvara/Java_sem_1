package laba4;

public class FryingPan implements Object, Title {
    public String Manufacturer;
    public double Cost;
    public String Style;
    private double HandleLength;
    private String Cover;
    private String title = "FryingPan";

    public FryingPan(String Manufacturer, double Cost, String Style, double HandleLength, String Cover){
        this.Manufacturer = Manufacturer;
        this.Cost = Cost;
        this.Style = Style;
        this.HandleLength = HandleLength;
        this.Cover = Cover;
    }

    public String getManufacturer(){
        return Manufacturer;
    };
    public double getCost(){
        return Cost;
    };
    public String getStyle() {
        return Style;
    }
    public double getHandleLength(){
        return HandleLength;
    }
    public String getCover(){
        return Cover;
    }

    public String printTitle(){
        return title;
    };

    @Override
    public void printInfo() {
        System.out.println("Title: "+printTitle()+"; Manufacturer: "+getManufacturer()+"; " +
                "Cost: "+getCost()+"; Style: "+getStyle()+"; HandleLength: "+getHandleLength()+"; Cover: "+getCover()+"");
    }
}
