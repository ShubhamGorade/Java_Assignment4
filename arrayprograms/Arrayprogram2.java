
package arrayprograms;
import java.util.Scanner;

/**
 *Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
The marks are entered by the user and the roll numbers are automatically assigned.
 * @author SHUBHAM
 */                    
class AverageCalculation
{
   double avg=0;
 
   AverageCalculation(int a[])
   {
      for(int  i=0;i<a.length;i++)
      {
        avg=avg+a[i];
      }
   }
}
 
class AverageMarks
{
  public static void main(String args[])
  {
    int i,j;
  for (j=1;j<=8;j++){
    System.out.println("Roll No : "+j);
  
    Scanner sc=new Scanner(System.in);
 
    int[] a=new int[5];
 
    System.out.println("Enter 3 subjects marks");
 
    for( i=0;i<3;i++)
    {
      a[i]=sc.nextInt();
    }
 
    AverageCalculation c = new AverageCalculation(a);
 
    System.out.print("Average of (");
 
    for(i=0;i<2;i++)
    {
     System.out.print(a[i]+",");
    }
    System.out.println(a[i]+") ="+c.avg/3);
  }
  }
}