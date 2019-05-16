package decorator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int option;
        boolean whileLop = true;
        AbstractPlainText instance;
        String text;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj napis");
        text = sc.next();

        instance = (new PlainText(text));

        while(whileLop) {
            System.out.println("Wybierz opcje : \n 1.Dodaj znacznik <p> \n 2.Dodaj znacznik <strong> \n 3.Dodaj znacznik <mark> \n 4.Dodaj znacznik <em> \n 5.Wydrukuj html \n 6.Wyjście");
            try {
                option = Integer.parseInt(sc.next());
            }
            catch (Exception e){
                continue;
            }
            switch (option) {
                case 1: {
                    instance = new PlainTextTagP(instance);
                    break;
                }
                case 2: {
                    instance = new PlainTextTagStrong(instance);
                    break;
                }
                case 3: {
                    instance = new PlainTextTagMark(instance);
                    break;
                }
                case 4: {
                    instance = new PlainTextTagEm(instance);
                    break;
                }
                case 5: {
                    instance.write();
                    System.out.println();
                    break;
                }
                case 6: {
                    whileLop=false;
                    break;
                }
            }
        }

    }

}
