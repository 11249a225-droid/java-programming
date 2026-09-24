import java.io.*;

public class TextEditor {
    public static void main(String[] args) throws IOException {

        String text = "Welcome to Java File Handling!";

        // Write to file
        FileWriter fw = new FileWriter("text.txt");
        fw.write(text);
        fw.close();

        // Read from file
        FileReader fr = new FileReader("text.txt");
        int ch;

        System.out.println("File Content:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
