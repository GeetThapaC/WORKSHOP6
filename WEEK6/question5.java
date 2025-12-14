import java.util.Scanner;

/**
 * Write a description of class question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question5
{
    public static void main(String[]args){
        String[] names={"KATHMANDU","DHOLAKHA","KASKI","MORANG","LALITPUR"};

        for ( int i=0;i< names.length;i++) {
            System.out.println((i+1)+ "." + names[i]);
            
        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n Enter new values:");
        int i=1;
        for ( String name:names)
        {
            System.out.println(i+"."+names);
            i++;
        }
    }}
            