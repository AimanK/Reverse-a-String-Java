import java.util.*;

class Main {
  public static void main(String[] args) {

    /**
        Take a given String, and return the string truly reversed, not merely iterated over from back to front.

    **/
    
    String str = "Apple";

    System.out.println(reverseString(str));


    /**
      SOLUTION: 
    - Create a char array, and use str.toCharArray(); to fill it with characters from our String.
    - initialize two integer variables to serve as pointers, one to represent the first index of the char array, and one to represent the last index of the char array.
    - Create a while loop that runs until (start < end).
    - swap the first and last values of the char array at each step until (start >= end).
    - Outside of the while loop, create a new String and give it the result of our operation by using String.valueOf(arr);
    - return the created String.


    PS: Here, a utility method is used to facilitate code separation for the details of the swapping between pointers used. It is a simple swap method that uses a temporary char variable to facilitate swapping between chars.


    **/
    
  }


  public static String reverseString (String str)
  {

    char[] chararr = str.toCharArray();

    int start = 0;
    int end = str.length()-1;

    while (start < end)
      {
        swap(chararr, start, end);

        start++;
        end--;
      }

    String newStr = String.valueOf(chararr);

    return newStr;
  
  }


  private static void swap(char[] arr, int first, int second)
  {
    char temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
