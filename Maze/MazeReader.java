import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;
public class MazeReader{
  public static void main(String[] args){
    try{
      File stuff = new File(args[0]);
      Scanner input = new Scanner(stuff);
      String endResult = "";
      while(input.hasNextLine()){
        endResult +=  input.nextLine() + "\n";
      }
      System.out.println(endResult);
    } catch (FileNotFoundException e){
    }
  }

  /*public static int[][] fileReader(String filename){
    File stuff = new File(filename);
    Scanner input = new Scanner(filename);
    while(input.hasNextLine()){

    }

    File stuff = new File(filename);
    ArrayList<String> thing = new ArrayList<String>[0];
    Scanner input = new Scanner(filename);
    while(input.hasNextLine()){
      String line = input.nextLine();
      thing.add(line);
    }
    int[][] endArray = new int[thing.length][thing.get(0).length()];
    for

    return
  }*/
}
