package laba4;

public class Saucer extends Plate{

    public Saucer(){
        super ();
    }

    public String getManufacturer(){
        return Manufacturer;
    }
    public double getCost(){
        return Cost;
    }
    public String getStyle(){
        return Style;
    }

    public double GetDiameter(){
        double diameter = 10.6;
        return diameter;
    }

    public String printTitle(){
        String title = "Saucer";
        return title;
    }

    public void printInfo(){
        System.out.println("Title: "+printTitle()+";  Manufacturer: "+getManufacturer()+"; " +
                "Cost: "+getCost()+"; Style: "+getStyle()+";Diameter: "+GetDiameter()+"");
    }
}
