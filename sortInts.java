import java.io.*; // Needed to use File and FileNotFoundException classes
import java.util.*; // Needed to use Scanner, ArrayList, and Collections classes

public class sortInts {

  public static void sortIntsInFile(String filename) {
    try {
      Scanner reader = new Scanner(new File(filename));
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      while(reader.hasNextLine()){
        numbers.add(Integer.parseInt(reader.nextLine()));
      }
      Collections.sort(numbers);
      //System.out.println(numbers); //shows array before sorting
      for(int num: numbers){
        System.out.println(num);
      }
    } catch (FileNotFoundException e) {
      System.out.println("There is no file named " + filename);
    }
  }

  public static void main (String[] args) {
    if (args.length != 1) { 
      System.out.println("Usage: java sortInts <intFileName>");
    } else {
      sortIntsInFile(args[0]);
    }
  }
}