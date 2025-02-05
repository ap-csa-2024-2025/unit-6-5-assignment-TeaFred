import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] theStringArr = {"hill", "mold", "tree", "lake"};
    reverse(theStringArr);
    
  }

  public static void reverse(String[] arr)
  {
    String reverseWord = new String();
    for (int i = 0; i < arr.length; i++)
    {
      reverseWord = "";
      for (int j = arr[i].length(); j > 0; j--)
      {
        reverseWord += arr[i].substring(j-1,j);
      }
      arr[i] = reverseWord;
      System.out.println(arr[i]);
    }
  }

  public int product(int[] arr)
  {
    int theTotal = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (i = 0)
      {
        theTotal += arr[i];
      }
      else
      {
        theTotal = theTotal * arr[i];
      }
    }
    return theTotal;
  }

  public double average(double[] arr)
  {
    double theTotal = 0;
    double theAvg = 0;
    for (elem:arr)
    {
      theTotal += elem;
    }
    theAvg = theTotal/arr.length;
    return theAvg;
  }
}
