// Book.java
class Book {
    // Static variables
    static String bookName;
    static String brand;
    static String color;

    // Static method to assign values
    static void setDetails(String name, String br, String clr) {
        bookName = name;
        brand = br;
        color = clr;
    }
}
