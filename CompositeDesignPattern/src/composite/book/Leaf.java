package composite.book;

public class Leaf implements Component {

    String chapterName;

    public Leaf(String chapterName) {
        this.chapterName = chapterName;
    }

    @Override
    public void print() {
        System.out.println(chapterName);
    }

}