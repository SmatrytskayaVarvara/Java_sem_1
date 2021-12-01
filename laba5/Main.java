package laba5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws Exception {
        int n = 2;
        Book[] books;
        books = new Book[n];

        for (int i=0; i<n; i++ )
            books[i] = new Book();
        for (int i=0; i<n; i++ )
            books[i].InputInFile();
        Book.OutputOfFile();

        for (int i=0; i<n; i++ )
            books[i].InputInFile2(books);
        Book.OutputOfFile2();

    }

}
