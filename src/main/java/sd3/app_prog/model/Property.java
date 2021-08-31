package sd3.app_prog.model;

import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author Alan.Ryan
 */
public class Property {
    private int id;
    private String street;
    private String city;
    private int bedrooms;
    private double bathrooms;
    private int squarefeet;
    private String description;
    private double price;
    private Date dateAdded;
    
    //used to store a location count
    private int locationCount;

    
    public Property() {
    }

    public Property(int id, String street, String city, int bedrooms, double bathrooms, int squarefeet, String description, double price, Date dateAdded, int locationCount) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.squarefeet = squarefeet;
        this.description = description;
        this.price = price;
        this.dateAdded = dateAdded;
        this.locationCount = locationCount;
    }

    
   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * @param bedrooms the bedrooms to set
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * @return the bathrooms
     */
    public double getBathrooms() {
        return bathrooms;
    }

    /**
     * @param bathrooms the bathrooms to set
     */
    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * @return the squarefeet
     */
    public int getSquarefeet() {
        return squarefeet;
    }

    /**
     * @param squarefeet the squarefeet to set
     */
    public void setSquarefeet(int squarefeet) {
        this.squarefeet = squarefeet;
    }

     /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the dateAdded
     */
    public Date getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    public String getFormattedPrice() {
           NumberFormat nf = NumberFormat.getCurrencyInstance();
           return nf.format(getPrice());
    }
    
     public String toString() {
     
     return "Property ID #         " + getId()+ 
            "\nStreet              " + getStreet()+
            "\nCity                " + getCity()+ 
            "\nBedrooms            " + getBedrooms()+ 
            "\nBathrooms           " + getBathrooms()+ 
            "\nSquarefeet          " + getSquarefeet()+ 
            "\nDescription         " + getDescription()+ 
            "\nPrice               " +getFormattedPrice()+
            "\nDate Added          " + getDateAdded() + 
            "\n-----------------------------------------------------";
    }

    /**
     * @return the locationCount
     */
    public int getLocationCount() {
        return locationCount;
    }

    /**
     * @param locationCount the locationCount to set
     */
    public void setLocationCount(int locationCount) {
        this.locationCount = locationCount;
    }

   

    
}
