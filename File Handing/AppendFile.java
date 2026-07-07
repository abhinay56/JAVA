import java.io.*;

public class AppendFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("student.txt", true);

        fw.write("\nThis is appended data.");

        fw.close();

        System.out.println("Data Appended");
    }
}