import java.io.*;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File file = new File("student.txt");

        if (file.createNewFile()) {
            System.out.println("File Created Successfully");
        } else {
            System.out.println("File Already Exists");
        }
    }
}