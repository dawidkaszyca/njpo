package factory;

public class PlainText extends AbstractPlainText {

    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public void write() {
        System.out.print(text);
    }
}
