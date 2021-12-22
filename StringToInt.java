public class StringToInt{
  public static void main(String[] args){
    //System.out.println('0' + 1);
    /*for (int x = 0; x < 10; x++){
      System.out.println(charToInt((char)(x)));
    }*/
    System.out.println(stringToInt("123"));
    System.out.println(stringToInt("121212121211221"));
    System.out.println(stringToInt("11111111111111"));
    System.out.println(stringToInt("wewe"));
    System.out.println(stringToInt("12345wewe6"));
    System.out.println(stringToInt("-123465"));
  }

  public static int stringToInt(String s){
    int sum = 0;
    char index = 0;
    int indexstart = 0;
    int indexstop = s.length();
    int switcher = 1;
    for (int x = 0; x < s.length(); x++){
      if (index == '-'){
        indexstart = 1;
        switcher = -1;
      }
      index = s.charAt(x);
      //System.out.println(index);
      if ((index + 0 < 48 || index + 0 > 57) && indexstop == s.length()
      && index != '-'){
        //System.out.println(indexstop);
        indexstop = x + indexstart;
      }
    }
    for (int x = indexstart; x < indexstop; x++){
      //System.out.println(charToInt(s.charAt(s.length() - x - 1)));
      index = s.charAt(x);
      //System.out.println(sum);
      sum += charToInt(index) * Math.pow(10, indexstop - x - 1);
    }
    return sum * switcher;
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
