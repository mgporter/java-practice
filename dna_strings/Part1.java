import java.util.ArrayList;

public class Part1 {
  public static String findSimpleGene(String dna) {
    int startIndex = dna.indexOf("ATG");
    if (startIndex == -1)
      return "";
    int endIndex = dna.indexOf("TAA", startIndex + 3);
    if (endIndex == -1)
      return "";
    String inbetween = dna.substring(startIndex, endIndex + 3);
    if (inbetween.length() % 3 == 0) {
      return inbetween;
    } else {
      return "";
    }
  }

  public static boolean twoOccurrences(String stringa, String stringb) {
    int firstOccurrence = stringb.indexOf(stringa);
    if (firstOccurrence == -1)
      return false;
    int secondOccurrence = stringb.indexOf(stringa, firstOccurrence + stringa.length());

    return secondOccurrence == -1 ? false : true;
  }

  public static ArrayList<String> findYoutubeLinks(String data) {
    String dataCopy = data.toLowerCase();
    ArrayList<String> urls = new ArrayList<String>();

    int occurrence = dataCopy.indexOf("youtube.com");

    while (occurrence != -1) {
      int linkStart = dataCopy.lastIndexOf("\"", occurrence) + 1;
      int linkEnd = dataCopy.indexOf("\"", occurrence);
      String url = data.substring(linkStart, linkEnd);
      urls.add(url);
      occurrence = dataCopy.indexOf("youtube.com", linkEnd);
    }

    return urls;

  }
  
}