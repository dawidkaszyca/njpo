package composite.book;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;
    private List<Component> list = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }



    public void addChapter(Component chapter) {
        list.add(chapter);
    }

    private void print(String gap) {
        System.out.println(gap+"."+name);
        int numberChapter = 1;
        gap = "    "+gap;
        for(Component j : list) {
            if(j instanceof Leaf) { //its leaf
                System.out.print(gap+"."+numberChapter+".");
                j.print();
                numberChapter++;
            }
            if(j instanceof Composite) {
                ((Composite) j).print(gap+"."+numberChapter);
                numberChapter++;
            }

        }
    }

    @Override
    public void print() {
        System.out.println(name);
        int numberChapter = 1;
        for(Component j : list) {
            if(j instanceof Leaf) { //its leaf
                System.out.print(numberChapter+".");
                j.print();
                numberChapter++;
            }
            if(j instanceof Composite) {
                String gap  = ""+numberChapter;
                ((Composite) j).print(gap);
                numberChapter++;
            }

        }

    }

}