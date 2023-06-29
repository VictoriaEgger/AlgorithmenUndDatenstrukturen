package UE02_LibraryHash;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash
{
    private String[] books;

    // Konstruktor
    public LibraryHash(int size)
    {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile()
    {
        String line;
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader("books.txt"));

            while ((line = br.readLine()) != null)   {
                add(line);
            }

            br.close();
        } catch (Exception | HashFullException e)
        {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen
    public void add(String bookTitle) throws HashFullException
    {
        // TODO: Implementieren

        int calcValue = Math.abs(bookTitle.hashCode());  //Macht den buchtitel zu eine zahl. Math.abs verhindert negative zahlen
        int index = calcValue % books.length;            //index berechnen nach linearer sondierung

        if (books[index] == null){          //Wenn an dieser stelle noch kein buchtitel ist
            books[index] = bookTitle;       //einfügen
            System.out.println("The book " +bookTitle+ " has been added.");

        }else {
            int probe = 1;
            while (books[(index + probe)%books.length] != null){    //solange immer etwas drinnen steht
                probe++;                                              //erhöht sich die probe wie bei der linearen sondierungs rechnung
            }

            books[(index + probe) % books.length] = bookTitle;         //ansonsten wird der berechnete der index, der index für den buchtitel
            System.out.println("The book " +bookTitle+ " has been added.");
        }

        //oder so
//
//        for (int i = 0; i < books.length; i++){
//            int pos = (calcValue + i) % books.length;
//            if (books[pos] == null){
//                books[pos] = bookTitle;
//        System.out.println("The book " +bookTitle+ " has been added.");
//                break;
//
//            }
//        }

    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle)
    {
        // TODO: Implementieren

        int calcValue = Math.abs(bookTitle.hashCode());

        for (int i = 0; i < books.length; i++){
            int pos = (calcValue + i) % books.length;

            if (books[pos] == null){
                System.out.println("Sorry, the book ''" +bookTitle+ "'' is not available....");
                return false;
            }

            if (books[pos].equals(bookTitle) == true){
                books[pos] = null;
                System.out.println("The book " +bookTitle+ " has been removed.");
                return true;
            }
        }

        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle)
    {
        // TODO: Implementieren

        int calcValue = Math.abs(bookTitle.hashCode());

        for (int i = 0; i < books.length; i++){
            int pos = (calcValue + i) % books.length;
            if (books[pos] == null){
                System.out.println("Sorry, the book ''" +bookTitle+ "'' is not available....");
                return false;
            }
            if (books[pos].equals(bookTitle)){
                System.out.println("Yes we have this book called: " + bookTitle);
                return true;

            }
        }

        return false;
    }

}
