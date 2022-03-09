import java.util.Scanner;

public class Week3CodingAssign {
  
  static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {

    // Create an array of int called ages. After first run add another
    // int to array to make sure it works with any length of array. Added int 803.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 803};

    // Subtract the value of first element in array from value in last element in array
    int subtractValues = ages[ages.length - 1] - ages[0];
    System.out.println("Subtracting first value from last value of array int: " + subtractValues);

    // Use a loop to calculate average of int array & print
    int sum = 0;
    for (int num : ages) {
      sum += num;
    }
    System.out.println("Average of int array: " + sum / ages.length);

    // Create an array of Strings called names.
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    // Use a loop to calculate average number of letters per name. Print result
    int lengthSum = 0;
    for (String name : names) {
      lengthSum += name.length();
    }
    System.out.println("Average number of letters per name: " + lengthSum / names.length);

    // Use a loop to concatenate all the names together separated by spaces. Print
    String allNames = "";
    for (String name : names) {
      allNames = allNames + name + " ";
    }
    System.out.println("All names concateneated: " + allNames);

    // How to access last element of any array. Using array ages from beginning
    System.out.println("Last element of array ages: " + ages[ages.length - 1]);

    // How to access first element of any array. Using array ages from beginning
    System.out.println("First element of array ages: " + ages[0]);

    // Create an array called names lengths. Use a loop to add length of each name from
    // names array to nameLengths array.
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      String name = names[i];
      nameLengths[i] = name.length();
    }

    // Write a loop to iterate over nameLengths array to calculate sum. Print result
    int sumOfNameLength = 0;
    for (int number : nameLengths) {
      sumOfNameLength += number;
    }
    System.out.println("Sum of name lengths: " + sumOfNameLength);

    // Write a method that prints out the word concatenated to itself X number of times
    System.out.println("Word add to self method: " + wordAddToSelf("Hello", 3));

    // Write a method that concatenates full name & last name to a full name
    System.out.println("Full name method: " + fullName("Bob", "Smith"));

    // Write a method that returns True if array is larger than 100. 
    System.out.println("Int array larger than 100: " + largeArray(ages));

    //Write a method that returns the average of doubles in the array
    double[] doubles = {1.3, 4.557, 68.098, 3.907, 6.2, 98.67};
    System.out.println("Average of doubles array: " + averageDoubles(doubles));

    // Write a method that returns true if one array is larger than the other
    double[] doublesNumberTwo = {4.5, 98.234, 12.5, 3.1};
    System.out.println("Is double array number one larger than number two: "
        + doubleArrayLarger(doubles, doublesNumberTwo));

    // Write a method that returns True if it is hot out, and you have more than 10.50 in your pocket. 
    boolean isHotOutside = true;
    double moneyInPocket = 12.50;
    System.out.println("Will you buy a drink today: " + willBuyDrink(isHotOutside, moneyInPocket));

    // Create your own method that solves a problem. Created a Create List method that takes input
    // from the user for 5 strings, returns an array with all the strings.
    for(String item : createList()) {
      System.out.println("Name: " + item);
    }
   
  }

  // Create a method that adds a word to itself x number of times.
  public static String wordAddToSelf(String word, int n) {
    String wordStart = "";
    for (int i = 0; i < n; i++) {
      wordStart += word;
    }
    return wordStart;
  }

  // Create a method that adds first name and last name into one string
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // create a method that returns true if int array sum is greater than 100
  public static boolean largeArray(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
    if (sum > 100) {
      return true;
    }
    return false;
  }

  // create a method that takes an array of double and returns avg of array
  public static double averageDoubles(double[] doubles) {
    double sum = 0;
    for (double num : doubles) {
      sum += num;
    }
    return sum / doubles.length;
  }

  // Create a method that takes 2 double arrays, returns true if avg of first array
  // is greater than second array
  public static boolean doubleArrayLarger(double[] firstDoubleArray, double[] secondDoubleArray) {
    if (averageDoubles(firstDoubleArray) > averageDoubles(secondDoubleArray)) {
      return true;
    }
    return false;
  }

  // Create a method that returns true if it is hot outside and have money is greater than 10.50.
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside && moneyInPocket >= 10.50) {
      return true;
    }
    return false;
  }

  // This method will take input from the user for 5 times to create an array of names.
  // I decided to create this to help with needing to make arrays of names or creating
  // a list of something else, like groceries. 
   /***
    * Creates an array of 5 strings inputed from user
    * @return an array of strings
    */
  public static String[] createList() {
    String[] listOfNames = new String[5];
    System.out.println("Please enter 5 names: ");
    for(int index = 0; index < 5; index++ ) {
      String name = input.next();
      listOfNames[index] = name;
    }
    return listOfNames;
    
  }

}

