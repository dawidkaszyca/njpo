package composite.terminal;

public class Leaf implements Component {

    String name;
    Composite parent;
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void setParent(Composite parent) {
        this.parent = parent;
    }

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    }
