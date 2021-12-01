package laba5;

import java.io.*;
import java.util.Arrays;

public class Book {
    public String Name;
    public double Cost;
    public boolean PresenceOfIllustrations;
    public int number_of_books = 0;
    public int unit_price = 0;

    Book() throws Exception {
        String str;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
        System.out.print("\nInput the title of the book: ");
        this.Name = input.readLine();
        System.out.print("\nInput the cost: ");
        this.Cost = Double.parseDouble(input.readLine());
        unit_price+=this.Cost;
        while (true) {
            System.out.print("\nPresence of illustrations (Yes/No): ");
            str = input.readLine();
            if ("Yes".equals(str)) {
                this.PresenceOfIllustrations = true;
                number_of_books +=1;
                break;
            }
            if ("No".equals(str)) {
                this.PresenceOfIllustrations = false;
                break;
            }
            System.out.print("\n Error! Input again!");
        }
    }

    public double UnitSum(Book[] array) {
        double sum = 0;
        for ( Book books : array) sum += books.Cost;
        return sum;
    }

    public int BooksWithIllustrations(Book[] array) {
        int counter=0;
        for (Book books : array)
            if (books.PresenceOfIllustrations) {
                counter++;
            }

        return counter;
    }

    public void InputInFile() throws IOException{
        File file = new File ("document.doc");
        file.deleteOnExit();

        FileWriter writer1;
        writer1 = new FileWriter (file, true);
        writer1.append("\nThe title of the book: "+this.Name+"; the cost: "+this.Cost+";");
        if (this.PresenceOfIllustrations)
            writer1.append(" with illustrations.\n");
        else
            writer1.append(" without illustrations.\n");
        writer1.flush();
        writer1.close();

    }

    public static void OutputOfFile() throws IOException{
        File file = new File ("document.doc");
        FileReader reader;
        char buffer[];
        int numb;
        buffer = new char[1];
        reader = new FileReader(file);
        do{
            numb = reader.read(buffer);
            System.out.print(buffer[0]);
        } while (numb ==1);
        reader.close();
    }

    public void InputInFile2(Book[]books)throws IOException {
        File file = new File ("document2.doc");
        file.deleteOnExit();

        FileWriter writer2;
        writer2 = new FileWriter (file, true);
        writer2.append("\nThe number of books with illustrations is "+BooksWithIllustrations(books)+"");
        writer2.append("\nThe unit price of the books is "+UnitSum(books)+"");
        writer2.flush();
        writer2.close();
    }

    public static void OutputOfFile2() throws IOException{
        File file = new File ("document2.doc");
        FileReader reader;
        char buffer[];
        int numb;
        buffer = new char[1];
        reader = new FileReader(file);
        do{
            numb = reader.read(buffer);
            System.out.print(buffer[0]);
        } while (numb ==1);
        reader.close();
    }


}
