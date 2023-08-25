import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

  public static void main(String[] args) {
    // try {
    //   File myObj = new File("newfile.txt");
    //   if (myObj.createNewFile()) {
    //     System.out.println("We created the file " + myObj.getName());
    //   } else {
    //     System.out.println("the file " + myObj.getName() + " already exists");
    //   }
    // } catch (IOException e) {
    //   System.out.println("An error occured");
    //   e.printStackTrace();
    // }

    // WriteToFile("Test line 1");
    ReadFile("newfile.txt");
  }

  public static void WriteToFile(String line) {
    try {
      FileWriter myWriter = new FileWriter("newfile2.txt");
      myWriter.write(line);
      myWriter.close();
      System.out.println("wrote to file successfully");

    } catch (IOException e) {
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
  
  public static void ReadFile(String fname) {
    try {
      File myObj = new File(fname);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred");
      e.printStackTrace();
    }
  }
}
