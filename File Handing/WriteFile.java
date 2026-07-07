import java.io.*;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("student.txt");

        fw.write("Hello World");

        fw.close();
    }
}