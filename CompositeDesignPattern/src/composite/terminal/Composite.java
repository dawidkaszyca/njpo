package composite.terminal;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;
    Composite parent;
    private List<Component> list = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }
    public Composite(String name, Composite parent) {
        this.name = name;
        this.parent = parent;
    }

    public void add(Component folder) {
        folder.setParent(this);
        list.add(folder);
    }

    public Component getComponentByName(String name){
        for(Component con : list){
            if(con.getName().equalsIgnoreCase(name)){
                return con;
            }
        }
        return this;
    }
    
    public void printPath() {
        if (parent != null) {
            parent.printPath();
        }
        System.out.print(name + "\\");
    }

    public void printList(){
        for(Component con : list){
            if(con instanceof Leaf){
                System.out.format( "%-15s %5s %n",con.getName(),"<txt>");

            }

            else System.out.format( "%-15s %5s %n",con.getName(),"<DIR>");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setParent(Composite parent) {
        this.parent = parent;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

}

