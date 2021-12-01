package laba2;

import laba1.Book;

public class Main {
    public static void main (String [] args){
        Book []b1 = new Book [4];

        b1[0] = new Book ("Jane Eyre", 12, true);
        b1[1] = new Book ("Pride and Prejudice", false);
        b1[2] = new Book ();
        b1[3] = new Book (b1[0]);

        for (int i=0; i<4; i++)
            b1[i].Print();
        System.out.println ("Total cost: " + Book.TotalCost(b1));
        System.out.println ("Books with illustrations: " + Book.HasIllustrations(b1));
    }
}
