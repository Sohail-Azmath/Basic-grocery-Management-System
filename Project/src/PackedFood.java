//package grocecry;

import java.util.Scanner;

public class PackedFood implements Household{
    int x;int q;


    //@Override
    public void selling(){
        System.out.println("1.Pasta\n2.Magiee\n3.Lays\n4.Biscuits");
        System.out.println("Choose the item: ");
        Scanner i = new Scanner(System.in);
        x=i.nextInt();
        measuredValue();
        //3i.close();       
    }

    public void pricing(){
        
        if(x==1){ 
           
            int rt=20*q;
            System.out.println("Total amount is:"+rt);
        }
        else if(x==2){

             int rt=30*q;
             System.out.println("Total amount is:"+rt);
            }
        else if(x==3){ 
            int rt=10*q;
            System.out.println("Total amount is:"+rt);
        }
        else {
            int rt= 5*q;
            System.out.println("Total amount is:"+rt);
        }
    }
    public void measuredValue(){
        
        //int q;
        System.out.println("Enter the quantity: ");
        Scanner v = new Scanner(System.in);
        q=v.nextInt();
        pricing();
        //v.close();        
    }
    // @Override
    // public void measuredValue(){
    //     //this method is written to overcome the problem of overrind and the abstract 
    //     //method measuredValue will also be helpful in method overloading.
    // }  
}
