package decorator;

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
