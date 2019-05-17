package tags;
import factory.PlainTextDecorator;
import factory.AbstractPlainText;
public class PlainTextTagP extends PlainTextDecorator {

    public PlainTextTagP(AbstractPlainText instance) {
        super(instance);
    }

    @Override
    public void write() {
        System.out.print("<p>");
        super.write();
        System.out.print("</p>");
    }
}
