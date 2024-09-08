//package grocecry;

import java.util.Scanner;

public interface Household {
    //abstract 
    public void selling();
    public void pricing();
    public void measuredValue();
    


    public static void main(String[] args)
    {
        int ch=0;
        Household obj1=null;
        //here the obj1 is intialized to null to avoid compile time issues during invalid inputs.
        while(ch!=4)
        {
            Scanner hh = new Scanner(System.in);
            System.out.println("1.Vegetables\n2.Fruits\n3.PackedFood\n4.exit");
            System.out.println("Enter your choice : ");
            ch =  hh.nextInt();
            
            switch(ch)
            {
                case 1:
                obj1 =new Vegetables();
                obj1.selling();
                obj1.measuredValue();
                break;

                case 2:
                obj1= new Fruits();
                obj1.selling();
                obj1.measuredValue();
                break;

                case 3:
                obj1 = new PackedFood();
                obj1.selling();
                //obj1.measuredValue();
                break;

                case 4:
                hh.close();
                System.out.println("Thank you! Visit again");
                
                default:
                System.out.println("Plz try again..!");
            }
        }
    }

}