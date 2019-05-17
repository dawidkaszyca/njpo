import factory.*;
import tags.*;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static AbstractPlainText instance;

    public static void main(String[] args) {
        String text = getText();
        int option = chooseTag();
        setTag(option,text);
        instance.write();
    }

    public static String getText(){
        String text;
        System.out.println("Podaj napis");
        text = sc.next();
        return text;
    }

    public static int chooseTag(){
        boolean whileLop = true;
        int option=0;
        while(whileLop) {
            System.out.println("Wybierz opcje : \n 1.Dodaj znacznik <p> \n 2.Dodaj znacznik <strong> \n 3.Dodaj znacznik <mark> \n 4.Dodaj znacznik <em> \n ");
            try {
                option = Integer.parseInt(sc.next());
                whileLop = false;
            }
            catch (Exception e){
                continue;
            }
        }
        return option;
    }
    public static void setTag(int option,String text){
        switch (option) {
            case 1: {
                instance = new PlainTextTagP(new PlainText(text));
                break;
            }
            case 2: {
                instance = new PlainTextTagStrong(new PlainText(text));
                break;
            }
            case 3: {
                instance = new PlainTextTagMark(new PlainText(text));;
                break;
            }
            case 4: {
                instance = new PlainTextTagEm(new PlainText(text));
                break;
            }
        }
    }


    }
