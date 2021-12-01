package laba4;

public class Pan implements Object, Title{
    public String Manufacturer;
    public double Cost;
    public String Style;
    private double Volume;
    private boolean Lid;
    private String title = "Pan";

    public Pan(String Manufacturer, double Cost, String Style, double Volume, boolean Lid){
        this.Manufacturer = Manufacturer;
        this.Cost = Cost;
        this.Style = Style;
        this.Volume = Volume;
        this.Lid = Lid;
    }
    public String getManufacturer(){
        return Manufacturer;
    };
    public double getCost(){
        return Cost;
    };
    public String getStyle(){
        return Style;
    };
    public boolean getLid(){
        return Lid;
    }
    public double getVolume(){
        return Volume;
    };

    public String printTitle(){
        return title;
    };

    @Override
    public void printInfo() {
        System.out.println("Title: "+printTitle()+"; Manufacturer: "+getManufacturer()+";" +
                " Cost: "+getCost()+"; Style: "+getStyle()+"; Lid: "+getLid()+"; Volume: "+getVolume()+"");
    }
}
