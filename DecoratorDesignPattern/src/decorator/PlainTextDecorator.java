package decorator;

public class PlainTextDecorator extends AbstractPlainText {
    private AbstractPlainText instance;

    public PlainTextDecorator(AbstractPlainText instance) {
        this.instance = instance;
    }

    @Override
    public void write() {
        instance.write();
    }
}
