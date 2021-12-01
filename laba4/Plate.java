package laba4;

public abstract class Plate {
    private double Diameter;
    public String Manufacturer;
    public double Cost;
    public String Style;

    public Plate(){
        this.Manufacturer = "Luminarc";
        this.Cost = 5.5;
        this.Style = "Rectangular";
    }


    public abstract double GetDiameter();
}
