public class Books {
    public static void main(String[] args) {
        String[] books = {
            "Alice in Wonderland",
            "Atomic Habits",
            "The Alchemist",
            "Animal Farm",
            "Adventures of Tom Sawyer",
            "Harry Potter",
            "A Brief History of Time",
            "The Hobbit",
            "Around the World",
            "Java Programming"
        };

        System.out.println("Books starting with A:");

        for (int i = 0; i < 10; i++) {
            if (books[i].startsWith("A")) {
                System.out.println(books[i]);
            }
        }
    }
}