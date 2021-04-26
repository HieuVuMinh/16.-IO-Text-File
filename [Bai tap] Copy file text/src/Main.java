import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            File sourceFilePath = new File("C:\\Users\\hieu\\Java project\\16. IO Text File\\[Bai tap] Copy file text\\Text.txt");
            File copyFilePath = new File("C:\\Users\\hieu\\Java project\\16. IO Text File\\[Bai tap] Copy file text\\CopyText.txt");
            FileWriter fileWriter = new FileWriter(copyFilePath);
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write(line);
                System.out.print(line);
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("\nCopy đã hoàn tất");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
