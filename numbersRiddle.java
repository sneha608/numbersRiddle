public class numbersRiddle {
  public static void main(String[] args) {

    int positiveInteger = 5; // result is 3.0
    int negativeInteger = -1; // result is 3.0
    int zeroInteger = 0; // result is 3.0
    int oneInteger = 1; // result is 3.0
    double positiveDouble = 7.9; // result is 3.0
    double negativeDouble = -3.7; // result is 3.0

    double chosenNumber = positiveInteger; 
    System.out.println("The chosen number is " + chosenNumber);
    double originalchosenNumber = chosenNumber;
    
    chosenNumber *= 2;
    System.out.println("The number doubled is " + chosenNumber);

    chosenNumber +=6;
    System.out.println("Adding 6 to the result yields: " + chosenNumber);

    chosenNumber /= 2;
    System.out.println("The result divided by 2 is " + chosenNumber);

    chosenNumber -= originalchosenNumber;
    System.out.println("The result subtracted by the original chosen number and hence, the final number is" + chosenNumber);
  }
}
