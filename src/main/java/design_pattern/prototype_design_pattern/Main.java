package design_pattern.prototype_design_pattern;

public class Main {
    public static void main(String[] args) {
        BookShop bookShop1 = new BookShop();
        bookShop1.loadBooksFromDb();

        BookShop bookShop2 = bookShop1.clone();

        bookShop1.books.remove(1); // Change in bookShop1 book does not effects other Shop book
        System.out.println(bookShop1.books);
        System.out.println(bookShop2.books);

    }
}
