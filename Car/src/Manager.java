
/**
 *
 * @author marvindelgado
 */
public class Manager {
    
    private String _Fname, _Lname, _address;
    private String _DOH;
    
    //Constructor
    public void Manager(String Fname, String Lname, String address, String DOH)
    {
        _Fname = Fname;
        _Lname = Lname;
        _address = address;
        _DOH = DOH;
    }
    
    //getter
    String getFNmae(){return _Fname;}
    String getLName(){return _Lname;}
    String getAddress(){return _address;}
    String getDOH(){return _DOH;}
    
    //setters
    public void setFname(String Fname){_Fname = Fname;}
    public void setLname(String Lname){_Lname = Lname;}
    public void setAddress(String address){_address = address;}
    public void setDOH(String DOH){_DOH = DOH;}
    
    @Override
    public String toString()
    {
        return _Fname + " " + _Lname + " " + _address +
                " " + _DOH;
    }
}
