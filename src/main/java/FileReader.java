import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public void fileReader() {
        File file = new File("C://Users//Cockatoo//Desktop//textReaderFile");
        try{
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()){
            System.out.println(scan.hasNextLine());
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
