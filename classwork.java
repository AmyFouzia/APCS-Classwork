import java.util.*;

public class classwork{

  public static List<String> makeAllWords(int k){
    List<String> words = new ArrayList<String>();
    mAWHelp(k, "a", words);
    return words;
  }

  public static void mAWHelp(int k, String partial, List<String> words){
    if (k == 0){
      words.add(partial);
    }
    else{
      mAWHelp(k-1, (partial + 1), words);
    }
  }

  public static void main(String[] args){
      System.out.println(makeAllWords(3));
  }


}
