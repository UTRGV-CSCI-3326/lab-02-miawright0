//creat main named MixMatch
public class MixMatch
{
public static void main(String[] args)
{
    //declare the variables
    //string
    String message = "Hi!";
    //char
    char letter = 'M';
    //short
    short smallnumber = 2;
    //int
    int number = 2025;
    //long
    long bignumber = 22222222222L;
    //float
    float pi = 3.14F;
    //double
    double doublepi = 3.1415926;
    //boolean
    boolean doYouLikeCoffee = true;

    //output each of them
    System.out.println(message + " <-String, that stores characters");
    System.out.println(letter + " <- char, that holds a single charater");
    System.out.println(smallnumber + " <- short, holds up to 2 bytes");
    System.out.println(number + " <- int, holds up to 4 bytes");
    System.out.println(bignumber + " <- long, holds up to 8 bytes");
    System.out.println(pi + " <- float, holds numbers to the 7th decimal point");
    System.out.println(doublepi + " <- double, holds number to the 15 decimal point");
    System.out.println(doYouLikeCoffee + " <- boolean, a true or false");

    //output multiple variables in one line
    System.out.println("Mix Match: " + message + ", " + letter + ", " + doYouLikeCoffee );
    System.out.println("Another Mix Match: " + smallnumber + ", " + pi + ", " + doublepi );
}
}