//2package grocecry;

import java.util.Scanner;

public class Fruits implements Household {
    int y, q;

    public void selling(){
        System.out.println("1.Apple\n2.Banana\n3.Mango\n4.Orange");
        // Scanner f = new Scanner(System.in);
        // y=f.nextInt();
        //measuredValue();
        //f.close();         
    }
    
    
    public void measuredValue(){
        System.out.println("Enter the qunantity");
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        pricing();
        //sc.close();
    }

    public void pricing()
    {
        int rate=20;
        float p= q * rate;
        System.out.println("price:"+p);
    }
}
