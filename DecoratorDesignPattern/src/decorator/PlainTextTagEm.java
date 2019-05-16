package decorator;

public class PlainTextTagEm extends PlainTextDecorator {
    public PlainTextTagEm(AbstractPlainText instance) {
        super(instance);
    }

    @Override
    public void write() {
        System.out.print("<em>");
        super.write();
        System.out.print("</em>");
    }
}
