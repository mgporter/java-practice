import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // String output = Part1.findSimpleGene(readFile(".\\data\\Axl2p.fa"));
    // System.out.println(output);

    // boolean occur = Part1.twoOccurrences("atg", "ctgtatgtaatg");
    // System.out.println(occur);

    String data = "";
    try {
      Scanner reader = new Scanner(new FileReader("links.txt"));

      while (reader.hasNextLine()) {
        data += reader.nextLine();
      }
      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    ArrayList<String> urls = Part1.findYoutubeLinks(data);

    for (String i : urls) {
      System.out.println(i);
    }
  }
  
  public static String readFile(String fname) {
    String data = "";

    try {
      FileReader fileObj = new FileReader(fname);
      Scanner reader = new Scanner(new FileReader(fname));

      while (reader.hasNextLine()) {
        data += reader.nextLine();
      }
      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    return data.toUpperCase();
  }
}
