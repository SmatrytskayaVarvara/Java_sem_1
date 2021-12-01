package laba1;

public class Main {
    public static void main(String[] args) {

        Book first = new Book ();
        Book second = new Book ();
        Book third = new Book ();

        first.setName("Harry Potter and the Philosopher's stone");
        first.setCost(12.99);
        first.setPresenceOfIllustrations(true);

        second.setCost(13.99);
        second.setName("Harry Potter and the Chamber of secrets");
        second.setPresenceOfIllustrations(false);

        third.setName("Harry Potter and the Prisoner of Azkaban");
        third.setCost(14.99);
        third.setPresenceOfIllustrations(true);

        String s = first.getName();
        System.out.println("Информация о книге " + s);
        first.Print();

        s = second.getName();
        System.out.println("Информация о книге " + s);
        second.Print();

        s = third.getName();
        System.out.println("Информация о книге " + s);
        third.Print();

    }
}
