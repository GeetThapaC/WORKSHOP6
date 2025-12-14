
/**
 * Write a description of class question7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question7
{
    public static void main(String[] args){
        String[][] seats = new String[2][3];
        seats[0][0]= "geet";
        seats[0][1]= "don";
        seats[0][2]="thapa";
        for(int i=0;i<seats.length; i++)
        { 
            for(int j=0; j<seats[i].length; j++)
            {
                
                if(seats[i][j]==null || seats[i][j]. isEmpty())
                {
                    System.out.print("Empty Seat \t");
                    
                }
                else
                {
                    System.out.print(seats[i][j]+"\t");
                    
                }
            }
            System.out.println();
        }

    }
}