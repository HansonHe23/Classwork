import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;
import java.util.*;
public class MazeReader{
  public static void main(String[] args){
    try{
      Character[][] lol = fileReader("Maze1.txt");
      System.out.println(toString(lol));
    } catch (FileNotFoundException e){
    }
  }

  public static String toString(Character[][] array2){
    String combine = "";
    for (int x = 0; x < array2.length; x++){
      for (int y = 0; y < array2[0].length; y++){
        combine += array2[x][y];
      }
      if (x != array2.length - 1){
        combine += "\n";
      }
    }
    return combine;
  }

  public static Character[][] fileReader(String filename)
  throws FileNotFoundException{
    File stuff = new File(filename);
    Scanner input = new Scanner(stuff);
    ArrayList<String> array = new ArrayList<String>();
    while(input.hasNextLine()){
      array.add(input.nextLine());
    }
    Character[][] arrayChar = new Character[array.size()][(array.get(0)).length()];
    for (int x = 0; x < array.size(); x++){
      for (int y = 0; y < array.get(0).length(); y++){
        arrayChar[x][y] = (array.get(x)).charAt(y);
      }
    }
    return arrayChar;
  }
}
