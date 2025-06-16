// BookDisplay.java
public class BookDisplay {
    public static void main(String[] args) {
        // Assign values using class name (because variables are static)
        Book.setDetails("Java Programming", "McGraw Hill", "Blue");

        // Display values
        System.out.println("Book Name: " + Book.bookName);
        System.out.println("Brand: " + Book.brand);
        System.out.println("Color: " + Book.color);
    }
}
