//***************************************************************
//Assignment2.java                   Author: Fartun Jama
//GithubID: fartunjama1
//
//Driver class, array: list of Random numbers,
//getting the min number in the list
//***************************************************************


import java.util.ArrayList;
import java.util.Scanner;

public class DriverClassAsgn2
   {

  public static class RationalNumber extends Number 
   {
	 //Denominatoe, numerator and Rational# num set to 0 and den set to 1
    public int num;  
    public int den; 
    RationalNumber()
    
    {
      num = 0;
      den = 1;
    }
   
    //the double value
    public double doubleValue() {

      double d = num;
      d /= den;
      return d;

    }
  
    //float values
    public float floatValue() {

      float d = num;
      d /= den;
      return d;

    }

    //long value
    public long longValue() {
   
      long d = num;
      d /= den;
      return d;

    }

    //int Values
    public int intValue() {
   
      int d = num;
      d /= den;
      return d;

    }

  };

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    //asks user to put the numbers with spaces
      System.out.println("Enter a list of numbers separated by a space: ");
          String input = scn.nextLine();
   

    ArrayList<Number> savemyVal = new ArrayList<Number >();

    String[] arr = input.split(" ",-1);


   
//prints the list with min# as well
    System.out.println("The list is: ");

    for(String s: arr) {

      System.out.println(s);

      if(s.indexOf('.') != -1)
      {

        savemyVal.add(Double.parseDouble(s));

      }

      else if (s.indexOf('/') == -1) {

        savemyVal.add(Integer.parseInt(s));

      }

      else {

        RationalNumber r = new RationalNumber();

        String[] rational = s.split("/",-1);

        r.num = Integer.parseInt(rational[0]);

        r.den = Integer.parseInt(rational[1]);

        savemyVal.add(r);

      }

    }

    Number min = Integer.MAX_VALUE;

    for(Number i: savemyVal) {

    	//indexes
      //System.out.println(i);

      if(i.doubleValue() < min.doubleValue()) {

        min = i;

      }

    }

    System.out.print("The min is: ");

    if(min instanceof RationalNumber) {

      for(String s: arr) {

        if(s.indexOf('/') != -1) {

          System.out.println(s);

        }

      }

    }

    else  

      System.out.println(min);

  }

}