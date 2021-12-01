package laba1;

public class Book {
    public String Name;
    public double Cost;
    public boolean PresenceOfIllustrations;

    public String getName() {
        return Name;
    }

    public double getCost() {
        return Cost;
    }

    public boolean isPresenceOfIllustrations() {
        return PresenceOfIllustrations;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public void setPresenceOfIllustrations(boolean presenceOfIllustrations) {
        PresenceOfIllustrations = presenceOfIllustrations;
    }

    public void Print(){
        System.out.println("Название: " + Name);
        if (Cost !=0)
            System.out.println("Цена: " + Cost);
        if (PresenceOfIllustrations)
            System.out.println("Есть иллюстрации");
        else
            System.out.println("Нет иллюстраций");
    }
//для лабораторной 2

    public Book (){

    }

    public Book (String name, double cost, boolean presenceofillustrations){
        this.Name = name;
        this.Cost = cost;
        this.PresenceOfIllustrations = presenceofillustrations;
    }

    public Book (Book o){
        this.Name = o.Name;
        this.Cost = o.Cost;
        this.PresenceOfIllustrations = o.PresenceOfIllustrations;
    }

    public Book (String name, boolean presenceofillustrations){
        this.Name = name;
        this.PresenceOfIllustrations = presenceofillustrations;
    }

    public static int TotalCost (Book []book){
        int c = 0;
        for (int i=0; i<4; i++)
            c += book[i].Cost;
        return c;
    }

    public static int HasIllustrations (Book []book){
        int ill = 0;
        for (int i=0; i<4; i++)
            if (book[i].PresenceOfIllustrations)
                ill++;
        return ill;
    }

}
