import java.io.*;

public class FitnessApp {
    public static void main(String[] args) throws IOException {

        String profile = "Name: Arun\nAge: 22\nWeight: 65 kg";

        // Write to file
        FileOutputStream out = new FileOutputStream("profile.txt");
        out.write(profile.getBytes());
        out.close();

        // Read from file
        FileInputStream in = new FileInputStream("profile.txt");
        int ch;
        System.out.println("User Profile:");
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }
        in.close();
    }
}
