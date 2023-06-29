package UE02_LibraryHash;

public class Main {
    public static void main(String[] args) {
        LibraryHash libraryHash = new LibraryHash(10);

        try {
            libraryHash.add("Harry Potter");
        } catch (HashFullException e) {
            throw new RuntimeException(e);
        }
    }
}

