package sd3.app_prog.ui;

import java.text.NumberFormat;
import java.util.List;
import sd3.app_prog_art.ASCIIArtGenerator;

public class Main {

    static NumberFormat nf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {

        PropertiesDB.doConnection();
        
        
        Console.displayLine("\t\t\t\tWelcome to the Assignment Three Main Menu");
        Console.displayLine();

        int choice = 0;

        while (choice != -1) {

            //display menu choices
            Console.displayLine("1:  Display properties by location and price");
            Console.displayLine("2:  Insert Record");
            Console.displayLine("3:  Display Average Price of a Property");
            Console.displayLine("4:  Prepare batch statement");
            Console.displayLine("-1: Quit");
            Console.displayLine();

            //prompt user for their menu choice
            choice = Console.getInt("Enter Choice: ");

            //evaluate user choice
            switch (choice) {

                case 1:
                    String city = Console.getString("Enter City: ");
                    double lowerLimit = Console.getDouble("Enter Lower Limit: ");
                    double upperLimit = Console.getDouble("Enter Upper Limit: ");
                    displayByPrice(city, lowerLimit, upperLimit);
                    break;
                case 2:
                    String street = Console.getString("Enter Street: ");
                    city = Console.getString("Enter City: ");
                    int beds = Console.getInt("Enter Bedrooms: ");
                    double baths = Console.getDouble("Enter Bathrooms: ");
                    int sqFoot = Console.getInt("Enter Square Footage: ");
                    String desc = Console.getString("Enter Description: ");
                    double price = Console.getDouble("Enter Price: ");
                    insertRecord(street, city, beds, baths, sqFoot, desc, price);
                    break;
                case 3:
                    city = Console.getString("Enter City: ");
                    String year = Console.getString("Enter Year: ");
                    displayAveragePrice(year, city);
                    break;
                case 4:
                    prepareBatch();
                    break;

            }//end switch

            Console.displayLine();

        }//end while  

        //display ASCII art before exiting
        ASCIIArtGenerator art = new ASCIIArtGenerator();
        try {
            art.printTextArt("Bye!", 14, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_DIALOG, "+");
            System.exit(0);
        } catch (Exception ex) {
            Console.displayLine("Error with ASCII art " + ex);
        }//end try
  finally {
           PropertiesDB.closeConnection();
       }
    }//end main()

    private static void displayByPrice(String city, double lowerLimit, double upperLimit) {
        
        Console.displayLine("SELECT * FROM properties WHERE price BETWEEN 150000 AND 250000 ORDER BY price ASC");
        Console.displayLine();
    }

    private static void prepareBatch() {
      

     
        Console.displayLine("update properties set price + (price * 1.1 WHERE CITY = limerick )");
        Console.displayLine("update properties set price + (price * 0.85 WHERE CITY = limerick )");
        Console.displayLine("DELETE FROM properties WHERE dateAdded RLIKE '2018' AND '2017' )");
        Console.displayLine();
    }

    private static void displayAveragePrice(String year, String city) {
        Console.displayLine("<<Display Average Price>>");
        Console.displayLine();
    }

    private static void insertRecord(String street, String city, int beds, double baths, int sqFoot, String desc, double price) {
        Object[][] params = new Object[][] { { "", "", "","","","","" } };
           // int[] values = PropertiesDB.batchAnCustomerInsert(params);
       //  System.out.println("Update " + values.length + " record(s)");
        Console.displayLine("<<Insert Rec>>");
        Console.displayLine();
    }

}//end class
