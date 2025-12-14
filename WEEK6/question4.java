import java.util.Scanner;

/**
 * Write a description of class question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question4
{
    public static void main(String[] args){
        int[] values = {10,20,30,40,50};
        
        for(int value:values)
        {
            System.out.println(value);
        }
        int sum =0;
        int high=0;
        int low= 9999;
        for(int value:values)
        {
            sum= sum+value;
            if(value>high)
            {
                 high=value;
                }
                if (value<low)
                {
                    low=value;
                }
            }
         double avg = sum/values.length;
         System.out.println("Average n= "+avg);
         System.out.println("Sum = "+sum);
         System.out.println("highest="+high);
         System.out.println("lowest="+low);
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter New values:");
         
         for(int i= 0; i< values.length; i++)
         {
             System.out.print("-");
             values[i]= scanner.nextInt();
             
         }
         for(int value:values)
         {
             System.out.println(value);
         }
        }
    }