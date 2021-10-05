
import java.util.Scanner;
/**
 *
 * @author marvindelgado
 */
public class testDealership {
                                            //I couldn't get the spaces in the 
                                            //address to work, it works with no spaces though.
    
    public static void main(String[] args) {
        
                                            //Car info
    String make;
    double price;
    int year;
    String VIN;

                                            //Sales Person info
    String Fname, Lname, address;
    double bonus;
    String DOH;
    
                                            //Manger info
    String Fname2, Lname2, address2, DOH2;
    
    Scanner scn = new Scanner(System.in);
    
                                            //create new object
    Car car = new Car();
    SalesPerson salesperson = new SalesPerson();
    Manager manager = new Manager();
    
    for(int j = 0; j < 10; j++)             //Create up to 10 cars
    {
    //Gather car information.
    System.out.print("Please enter vehicle info: "
            + "make, price, year, and VIN: ");
    
                                            //Gather user input
    make = scn.next();
    price = scn.nextDouble();
    year = scn.nextInt();
    VIN = scn.next();
    
                                            //Assign data to object
    car.setMake(make);
    car.setPrice(price);
    car.setYear(year);
    car.setVIN(VIN);
    
                                            //End of car information
    System.out.println("Here is the info you provided: " + car);
    }
                                            
    for(int i = 0; i < 5; i++)              //Create up to 5 sales persons
    {
                                            //Gather Sales person information.
    System.out.print("Enter Sales person first and last name,"
            + " address, bonus, and date of hiring: ");
    
                                            //Gather user input
    Fname = scn.next();
    Lname = scn.next();
    address = scn.next();
    bonus = scn.nextDouble();
    DOH = scn.next();
    
                                            //Assign data to object
    salesperson.setFname(Fname);
    salesperson.setLname(Lname);
    salesperson.setAddress(address);
    salesperson.setBonus(bonus);
    salesperson.setDOH(DOH);
    
                                            //End of Sales person information.
    System.out.println("Here is the info you provided: " + salesperson);
    }
    
                                            //Gather Manager information
    System.out.print("Enter manager first and last name,"
            + " address, and date of hiring: ");
    
                                            //Gather user input
    Fname2 = scn.next();
    Lname2 = scn.next();
    address2 = scn.next();
    DOH2 = scn.next();
    
                                            //Assign data to object
    manager.setFname(Fname2);
    manager.setLname(Lname2);
    manager.setAddress(address2);
    manager.setDOH(DOH2);
    
                                            //End of Manager information.
    System.out.println("Here is the info you provided: " + manager);
    
    
    
    
    }
    
}
