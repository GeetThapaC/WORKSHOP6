
/**
 * Write a description of class question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question6
{
    public static void main(String[] args){
        int[][] marks={{80,75} , {90,85}};
        System.out.println("\nStudent1   Student2");
        for(int i=0; i<marks.length; i++)
        {
            for(int j=0; j<marks[i].length; j++)
            {
                System.out.print(marks[i][j]+"\t ");
        
            }
            System.out.println();
        }
    }
}