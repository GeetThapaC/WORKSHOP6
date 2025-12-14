
/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question3
{  
    static String[] names= {"geet","Geet","GEET","Gdon","lemon"};
    public static void main(String[]args){
        for(String name:names){
            System.out.println(name);
        }
        names[1]="song";
        names[4]="DON";
        System.out.println(names[4]);
    }
}