
/**
 *
 * @author marvindelgado
 */
public class SalesPerson {
    
    private String _Fname, _Lname, _address;
    private double _bonus;
    private String _DOH;
    
    //Constructor
    public void SalesPerson(String Fname, String Lname, String address, double bonus, String DOH)
    {
        _Fname = Fname;
        _Lname = Lname;
        _address = address;
        _bonus = bonus;
        _DOH = DOH;
    }
    
    //getter
    String getFNmae(){return _Fname;}
    String getLName(){return _Lname;}
    String getAddress(){return _address;}
    double getBonus(){return _bonus;}
    String getDOH(){return _DOH;}
    
    //setters
    public void setFname(String Fname){_Fname = Fname;}
    public void setLname(String Lname){_Lname = Lname;}
    public void setAddress(String address){_address = address;}
    public void setBonus(double bonus){_bonus = bonus;}
    public void setDOH(String DOH){_DOH = DOH;}
    
    @Override
    public String toString()
    {
        return _Fname + " " + _Lname + " " + _address +
                " " + _bonus + " " + _DOH;
    }
}
