import java.io.*;
public class DeleteFile {
public static void main(String[] args) throws IOException {
File file = new File("Student.txt");
if(file.delete()) {
System.out.println("File Deleted");
}
else {
System.out.println("File not Found");
}
}
}