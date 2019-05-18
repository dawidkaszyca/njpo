package composite.terminal;

public interface Component {
    public String getName();
    public void setParent(Composite parent);
    void setName(String newName);
}
