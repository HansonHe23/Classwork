public class StringToInt{
  public static void main(String[] args){
    System.out.println('0' + 1);
    for (int x = 0; x < 10; x++){
      System.out.println(charToInt((char)(x)));
    }
  }

  public static int stringToInt(String s){
    return 0;
  }

  public static int charToInt(char input){
    for (int x = 0; x < 10; x++){
      if (input + 0 == 48 + x){
        return x;
      }
    }
    return input + 0;
  }
}
