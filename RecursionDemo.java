public class RecursionDemo{
  public static void main(String[] args){
    makeWords(3, "");
}

  public static void makeWords(int remainingLetters, String result){
    if(remainingLetters > 0){
      for (char letter = 'a'; letter <= 'c'; letter++){
        makeWords(remainingLetters - 1, result + letter);
      }
    } else {
      System.out.println(result);
    }
  }
}
