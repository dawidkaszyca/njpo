package decorator;

public class PlainTextTagStrong extends PlainTextDecorator{
    public PlainTextTagStrong(AbstractPlainText instance) {
        super(instance);
    }

    @Override
    public void write() {
        System.out.print("<strong>");
        super.write();
        System.out.print("</strong>");
    }
}
