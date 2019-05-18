package composite.terminal;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Scanner;

//dir, cd .., cd <nazwa podkatalogu> help
public class Main {

    static private Composite root = new Composite("User:");

    public static void main(String[] args) {
        createSystem();
        consoleSymulator();
    }

    private static void consoleSymulator() {
        Scanner sc = new Scanner(System.in);
        String command;
        while(true){
            root.printPath();
            command = sc.nextLine();
            command = command.trim();
            command = command.toLowerCase();
            if(command.equals("cd..")){
                undoParents();
            }
            else if(command.equals("help")){
                printHelp();
            }
            else if(command.equals("date")){
                showDate();
            }
            else if(command.equals("time")){
                showTime();
            }
            else if(command.equals("exit")){
                break;
            }
            else if(command.contains("mkdir ")){
                makeDir(command);
            }
            else if(command.contains("create ")){
                makeNotepad(command);
            }
            else if(command.contains("cd ")){
                changePath(command);
            }
            else if(command.contains("rename ")){
                rename(command);
            }
            else if(command.equals("dir")){
                root.printList();
            }
            else if(command.contains("echo ")){
                command = command.substring(5);
                System.out.println(command);
            }
            else {
                System.out.println("'" + command + "' is not recognized as an internal or external command,\n" +
                        "operable program or batch file.");
            }


        }

    }

    private static void makeNotepad(String command) {
        command = command.substring(7);
        command = command.trim();
        Component con = root.getComponentByName(command);
        if(con == root){
            Component newFile = new Leaf(command);
            root.add(newFile);
        }
        else if (con instanceof Composite){
            Component newFile = new Leaf(command);
            root.add(newFile);
        }
        else System.out.println("Name is used already");
    }

    private static void rename(String command) {
        command = command.substring(7);
        command = command.trim();
        String oldName = command.substring(0,command.indexOf(" "));
        String newName = command.substring(oldName.length()+1,command.length());
        Component con = root.getComponentByName(newName);
        Component folder = root.getComponentByName(oldName);
        if(root != folder){
            if(con == root){
                folder.setName(newName);
            }
            else System.out.println("Name is used already");
        }
        else System.out.println("Folder does not exist");
    }

    private static void makeDir(String command) {
        command = command.substring(6);
        command = command.trim();
        Component con = root.getComponentByName(command);
        if(con == root){
            Composite newFolder = new Composite(command);
            root.add(newFolder);
        }
        else System.out.println("Folder already exist");
    }

    private static void changePath(String path) {
        path = path.substring(2);
        path = path.trim();
        Component con = root.getComponentByName(path);
        if(root !=con ){
            if (con instanceof  Composite){
                root = (Composite) con;
            }
            else System.out.println("Folder does not exist");
        }
        else System.out.println("Folder does not exist");
    }

    private static void showTime() {
        LocalTime myObj = LocalTime.now();
        System.out.println("The current time is: "+myObj);
    }

    private static void showDate() {
        LocalDate myObj = LocalDate.now();
        System.out.println("The current date is: " + myObj);

    }

    private static void undoParents(){
        if(root.parent !=null) {
            root = root.parent;
        }
    }
    private static void printHelp(){
        System.out.println("CD <name folder>      change directory\n" +
                           "CD..                  return to the previous directory\n" +
                           "CREATE                Create a new txt file\n" +
                           "DATE                  show date\n" +
                           "DIR                   list directory content\n" +
                           "ECHO                  text output\n" +
                           "EXIT                  exits the command prompt or a batch file\n" +
                           "MKDIR                 create a new directory\n" +
                           "RENAME                rename files\n" +
                           "TIME                  display the system time\n"
        );
    }

    private static void createSystem(){
        Composite folder1 = new Composite("folder1");
        Composite folder2 = new Composite("folder12");
        Composite folder3 = new Composite("folder13");
        Composite folder11 = new Composite("folder11");
        Composite folder12 = new Composite("folder12");
        Composite folder13 = new Composite("folder13");
        Composite folder111 = new Composite("folder111");
        Composite folder112 = new Composite("folder112");
        Leaf l1 = new Leaf("text");
        root.add(folder1);
        root.add(folder2);
        root.add(folder3);
        folder1.add(folder11);
        folder1.add(folder12);
        folder1.add(folder13);
        folder11.add(folder111);
        folder11.add(folder112);
        folder11.add(l1);
    }
}
