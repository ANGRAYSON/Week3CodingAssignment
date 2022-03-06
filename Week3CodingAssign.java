
public class Week3CodingAssign {

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

    // using wordaddtoself method
    System.out.println("Word add to self method: " + wordAddToSelf("Hello", 3));

    // using fullName method
    System.out.println("Full name method: " + fullName("Bob", "Smith"));

    // using largeArray method
    System.out.println("Int array larger than 100: " + largeArray(ages));

    // using averageDouble method
    double[] doubles = {1.3, 4.557, 68.098, 3.907, 6.2, 98.67};
    System.out.println("Average of doubles array: " + averageDoubles(doubles));

    // using doubleArrayLarger method
    double[] doublesNumberTwo = {4.5, 98.234, 12.5, 3.1};
    System.out.println("Is double array number one larger than number two: "
        + doubleArrayLarger(doubles, doublesNumberTwo));

    // using willBuyDrink method
    boolean isHotOutside = true;
    double moneyInPocket = 12.50;
    System.out.println("Will you buy a drink today: " + willBuyDrink(isHotOutside, moneyInPocket));

    // Will print out exactly what bills/coins need to be given back from sale.
    // (total amount of sale, cash given to cashier)
    changeAtRegister(15.67, 20.00);

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

  // This method will take input for total of sale and what cash the customer hands the cashier. It
  // will print
  // out the changed need in exactly what dollars and coins. Largest bill expected back is 20.
  // this solves the problem of waiting for the cashier to think about what bills/coins to be given
  // back.
  // I created this because at some point I would like to make my own Point of Sale system and I
  // thought
  // this would be a helpful exercise.
  public static void changeAtRegister(double total, double cashGiven) {
    // The cash that the customer hands the cashier, and the total of the bill
    cashGiven = 50.20;
    total = 32.57;

    // Starts the count of what bills/coins will be need.
    int twentyDollars = 0;
    int tenDollars = 0;
    int fiveDollars = 0;
    int oneDollars = 0;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;

    // Prints out the change so the customer knows what they are getting back. Also round the change
    // to the nearest 2 places.
    double change = cashGiven - total;
    change = Math.round(change * 100.0) / 100.0;
    System.out.println("Your change is: $" + change);


    // While change is not 0, it will loop through and check for what bills/coins need to be given.
    // It will add
    // to each category for bill/coins as it goes and subtract that amount from the change at the
    // same time
    // until change is 0 and all bills/coins have been counted to be given back. Rounds to the
    // nearest 2 decimal places
    while (change != 0) {
      change = Math.round(change * 100.0) / 100.0;
      if ((change % 20 != 0 && change >= 20) || (change % 20 == 0 && change >= 20)) {
        twentyDollars++;
        change -= 20;

      } else if ((change % 10 != 0 && change >= 10) || (change % 10 == 0 && change >= 10)) {
        tenDollars++;
        change -= 10;

      } else if ((change % 5 != 0 && change >= 5) || (change % 5 == 0 && change >= 5)) {
        fiveDollars++;
        change -= 5;

      } else if ((change % 1 != 0 && change >= 1) || (change % 1 == 0 && change >= 1)) {
        oneDollars++;
        change -= 1;

      } else if ((change % .25 != 0 && change >= .25) || (change % .25 == 0 && change >= .25)) {
        quarters++;
        change -= .25;

      } else if ((change % .10 != 0 && change >= .10) || (change % .10 == 0 && change >= .10)) {
        dimes++;
        change -= .10;

      } else if ((change % .05 != 0 && change >= .05) || (change % .05 == 0 && change >= .05)) {
        nickels++;
        change -= .05;

      } else if ((change % .01 != 0 && change >= .01) || (change % .01 == 0 && change >= .01)) {
        pennies++;
        change -= .01;

      }
    }

    // This will check to see what need to be printed, so no 0 amounts or unnecessary bill/coins are
    // printed out.
    if (twentyDollars != 0) {
      System.out.println("Twenty(s): " + twentyDollars);
    }
    if (tenDollars != 0) {
      System.out.println("Ten(s): " + tenDollars);
    }
    if (fiveDollars != 0) {
      System.out.println("Five(s): " + fiveDollars);
    }
    if (oneDollars != 0) {
      System.out.println("One(s): " + oneDollars);
    }
    if (quarters != 0) {
      System.out.println("Quarters: " + quarters);
    }
    if (nickels != 0) {
      System.out.println("Nickels: " + nickels);
    }
    if (dimes != 0) {
      System.out.println("Dimes: " + dimes);
    }
    if (pennies != 0) {
      System.out.println("Pennies: " + pennies);
    }
  }

}

