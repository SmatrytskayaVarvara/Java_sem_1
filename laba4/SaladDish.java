package laba4;

public class SaladDish extends Plate{

    public SaladDish(){
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
        double diameter = 15.5;
            return diameter;
    }

    public String printTitle(){
        String title = "SaladDish";
        return title;
    }

    public void printInfo(){
        System.out.println("Title: "+printTitle()+"; Manufacturer: "+getManufacturer()+"; " +
                "Cost: "+getCost()+"; Style: "+getStyle()+"; Diameter: "+GetDiameter()+"");
    }
}
