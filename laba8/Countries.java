package laba8;

import java.util.Comparator;

public class Countries {
    private String name;
    private String capital;
    private int square;
    private int population;
    private String continent;

    public Countries(String name, String capital, int square, int population, String continent) {
        this.name = name;
        this.capital = capital;
        this.square = square;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getSquare() {
        return square;
    }

    public int getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }



    @Override
    public String toString() {
        return
                " Название: " + name +
                        " /Столица: " + capital +
                        " /Площадь: " + square +
                        " /Население: " + population +
                        " /Континент: " + continent + "\n" ;
    }


    public static class TypeComparator implements Comparator<Countries>{

        @Override
        public int compare(Countries o1, Countries o2) {
            return o1.capital.compareTo(o2.capital);
        }

    }

    public static class NameComparator implements Comparator<Countries>{
        @Override
        public int compare(Countries o1, Countries o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
