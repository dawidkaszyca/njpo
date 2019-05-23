package composite.book;

public class Main {
    public static void main(String[] args) {
        Composite book1 = new Composite ("Second chapter");
        book1.addChapter(new Leaf("First subsection"));
        book1.addChapter(new Leaf("Second subsection"));

        Composite book4 = new Composite ("third");
        book4.addChapter(new Leaf("first "));
        book4.addChapter(new Leaf("second"));

        Composite book2 = new Composite ("Third subsection");
        book2.addChapter(new Leaf("first "));
        book2.addChapter(new Leaf("second"));
        book2.addChapter(book4);
        book2.addChapter(new Leaf("fourth"));

        book1.addChapter(book2);
        book1.addChapter(new Leaf("fourth"));

        Composite book = new Composite ("Harry Potter");
        book.addChapter(new Leaf("First chapter"));
        book.addChapter(book1);
        book.addChapter(new Leaf("Third chapter"));
        book.print();


    }
}
