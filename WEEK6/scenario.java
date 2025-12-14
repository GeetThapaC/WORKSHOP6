
/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario
{
    public static void main(String[] args)
    {
        // Categories
        String[] categories = {"Fiction", "Nepali"};

        // One book per category
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        // Assign titles and prices
        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Karnali Blues";
        prices[1][0] = 650.0;

        // Print category, title, and price
        for (int i = 0; i < categories.length; i++)
        {
            System.out.println("Category: " + categories[i]);

            for (int j = 0; j < titles[i].length; j++)
            {
                if (titles[i][j] != null)
                {
                    System.out.println("  Title: " + titles[i][j]);
                    System.out.println("  Price: Rs. " 
                        + String.format("%.2f", prices[i][j]));
                }
            }
            System.out.println();
        }
    }
}