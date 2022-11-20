package design_pattern.prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    List<String> books = new ArrayList<>();

    BookShop(){
    }

    public void loadBooksFromDb() {
        for (int i = 0; i < 10 ; i++) {
            books.add("Book"+i);
        }
    }

    // This could be ok if the book content will not be modified or common for all objects
    // below method will return shallow copy of the class
    // we want a deep copy so that change in one object does not effect other
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    @Override
    protected BookShop clone() {

        BookShop bs2 = new BookShop();
            // Assume we dont want to use the same value
        // then we need to do deep copy

        List<String> bk2 = new ArrayList<>();
        for (String book: books) {
            bk2.add(book);
        }
        bs2.books = bk2;

        return bs2;
    }
}
