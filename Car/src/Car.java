
/**
 *
 * @author marvindelgado
 */
public class Car {
    
    //private fields
    private String _make;
    private double _price;
    private int _year; 
    private String _VIN;
    
    //Constructor
    public void Car(String make, double price, int year, String VIN)
    {
        _make = make;
        _price = price;
        _year = year;
        _VIN = VIN;
    }
    
    //getter
    String getMake(){return _make;}
    double getPrice(){return _price;}
    int getYear(){return _year;}
    String getVIN(){return _VIN;}
    
    //setters
    public void setMake(String make){_make = make;}
    public void setPrice(double price){_price = price;}
    public void setYear(int year){_year = year;}
    public void setVIN(String VIN){_VIN = VIN;}
    
    public String toString()
    {
        return _make + " " + _price + " " + _year +
                " " + _VIN;
    }
}
