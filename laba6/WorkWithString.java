package laba6;

import java.io.*;

public class WorkWithString {
    String data;
    String filename;
    String choice;
    String choice2;
    RandomAccessFile fio;
    BufferedReader in;

    public WorkWithString() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
    }

    public void runConsole() throws IOException{
        while (true){
            printMenu();
            choice = in.readLine();

            if (choice.compareTo("1")==0)
                textIntoFile();
            else if (choice.compareTo("2")==0){
                printRedactMenu();
                choice2=in.readLine();
                 if (choice2.compareTo("1")==0)
                     addStart();
                 else if (choice2.compareTo("2")==0)
                     addEnd();
                 else if (choice2.compareTo("3")==0)
                     addRandom();
            }
            else if(choice.compareTo("3")==0)
                textFromFile();
            else if (choice.compareTo("4")==0)
                return;
        }
    }

    public void printMenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Enter text into a file");
        System.out.println("2. Edit text in the file");
        System.out.println("3. Read the text from the file and perform actions");
        System.out.println("4. Exit");
    }

    public void textIntoFile() throws IOException{
        System.out.println ("Enter text: ");
        data = in.readLine();
        System.out.println ("Enter file name: ");
        filename = in.readLine();
        fio = new RandomAccessFile (new File (filename), "rw");
        fio.writeBytes(data);
        fio.close();
        System.out.println ("Your text has been saved");
    }

    public void printRedactMenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Adding text to the beginning of the file");
        System.out.println("2. Adding text to the end of the file");
        System.out.println("3. Adding text to a random position in the file");
    }

    public void addStart() throws IOException{
        System.out.println ("Enter file name: ");
        filename = in.readLine();
        fio = new RandomAccessFile (new File (filename), "rw");
        data = fio.readLine();
        System.out.println ("Enter a string to be put in the beginning: ");
        String s;
        s = in.readLine();
        fio.seek (0);
        fio.writeBytes(s);
        fio.seek(s.length());
        fio.writeBytes(data);
        fio.close();
        System.out.println ("The string has been added to the beginning of the file");
    }

    public void addEnd() throws IOException{
        System.out.println ("Enter file name: ");
        filename = in.readLine();
        fio = new RandomAccessFile (new File (filename), "rw");
        data = fio.readLine();
        System.out.println ("Enter a string to be put in the end: ");
        String s;
        s = in.readLine();
        fio.seek (fio.length());
        fio.writeBytes(s);
        fio.close();
        System.out.println ("The string has been added to the end of the file");
    }
    public void addRandom() throws IOException{
        System.out.println ("Enter file name: ");
        filename = in.readLine();
        fio = new RandomAccessFile (new File (filename), "rw");
        data = fio.readLine();
        System.out.println ("Enter a string to be put in the selected position in the file: ");
        String s;
        s = in.readLine();
        System.out.println ("Enter a position in the file: ");
        int n;
        n = Integer.parseInt(in.readLine());
        fio.seek (n);
        data = fio.readLine();
        fio.seek (n);
        fio.writeBytes(s);
        fio.writeBytes(data);
        fio.close();
        System.out.println ("The string has been added to the file");
    }

    public void textFromFile() throws IOException{
        System.out.println ("Enter file name: ");
        filename = in.readLine();
        fio = new RandomAccessFile (new File (filename), "r");
        data = fio.readLine();
        fio.close();
        System.out.println ("Info from the file:\n" + data);

        int number_of_symbols = 0;
        char ch;
        for (int i=0; i< data.length(); i++){
            ch= data.charAt(i);
            if (ch == '?'){
                i++;
                if (data.charAt(i)=='!')
                    number_of_symbols++;
            }
        }
        System.out.println ("The number of ?! is: " + number_of_symbols);
    }
}
