package decorator;

public class PlainTextTagMark extends PlainTextDecorator {
    public PlainTextTagMark(AbstractPlainText instance) {
        super(instance);
    }

    @Override
    public void write() {
        System.out.print("<mark>");
        super.write();
        System.out.print("</mark>");
    }
}
