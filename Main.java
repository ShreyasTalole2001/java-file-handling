import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        createFile("file1.txt");
        writeFile("file1.txt");
        readFile("file1.txt");
        // deleteFile("file1.txt");
    }

    static void createFile(String name) {
        try {
            File obj1 = new File("./files/" + name);
            if (obj1.createNewFile()) {
                System.out.println("File Created : " + obj1.getName());
            } else {
                System.out.println("File already exist ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void writeFile(String name) {
        try {
            FileWriter writter = new FileWriter("./files/" + name);
            writter.write("Hello Shreyah \n");
            writter.write("How are you?");
            writter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void readFile(String name) {
        try {
            File obj1 = new File("./files/" + name);
            Scanner sc = new Scanner(obj1);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void deleteFile(String name) {
        File obj1 = new File("./files/" + name);
        if (obj1.delete()) {
            System.out.println("Deleted the file: " + obj1.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}
