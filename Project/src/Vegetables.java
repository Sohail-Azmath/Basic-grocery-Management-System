//package grocecry;
import java.util.*;
class Encaps
{
    private int rate;
    public void setRate(int r)
    {
        rate=r;
    }
    public int getRate()
    {
        return rate;
    }
}
public class Vegetables implements Household {
    @Override
    public void selling(){
        System.out.println("1.Carrot\n2.BeetRoot\n3.Tomato\n4.Chilly");        
    }
    public void pricing(float q)
    {
        Encaps obj = new Encaps();
        obj.setRate(10);
        int rup= obj.getRate();
        float p= q * rup;
        System.out.println(p);
        System.out.println("\n");
    }
    
    public void measuredValue(){
        System.out.println("Enter the value in KG's: ");
        Scanner obj = new Scanner(System.in);
        float q = obj.nextFloat();
        pricing(q);
        //1obj.close();
    }
    
    
}