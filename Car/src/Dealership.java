
import java.util.ArrayList;
/**
 *
 * @author marvindelgado
 */
public class Dealership {
    
   private final ArrayList <SalesPerson> sp = new ArrayList <> ();
   private final ArrayList <Car>         cars= new ArrayList <> (); 
   private final Manager mg;
   
   public Dealership(Manager m)
   {
       mg =m;
   }
   
   public void addCar(Car another)
   {
       cars.add(another);
       
   }
   public void addSalesPerson(SalesPerson s)
   {
       sp.add(s);
   }
   
   public void carSold(SalesPerson s, Car aCar)
   {
       
       if(cars.contains(aCar))
       {
         double p   = aCar.getPrice();
         s.setBonus(p * .30);
         cars.remove(aCar);
       }
       else
        System.out.println(aCar.toString() + " is already Sold");
       
   }
   
   public SalesPerson getPersonOfTheMonth()
   {   double max = 0.0;
       SalesPerson x= null;
       for( SalesPerson s : sp)
       {
          if(s.getBonus() > max)
          {
              max = s.getBonus();
              x = s;
           }
       }
      return x; 
   }
   
   public void printEverything()
   {
       String out = "Dealership Resources....\n\n";
       System.out.println(mg.toString());
      out+=mg.toString()+"\n\n";
       
      /*out = sp.stream().map((s) -> {
          System.out.println(s.toString());
           return s;
       }).map((s) -> s.toString()+"\n").reduce(out, String::concat);
      out = cars.stream().map((a) -> {
          System.out.println(a.toString());
           return a;
       }).map((a) -> a.toString()+"\n").reduce(out, String::concat);*/
       
       SalesPerson sp = getPersonOfTheMonth();
   
   }
}
