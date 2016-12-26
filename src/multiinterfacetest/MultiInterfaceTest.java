
package multiinterfacetest;

import java.util.Scanner;


//--------INTERFACE----------------
    interface employee1{
        public float setOT(float s);        
    }
    
    interface employee2{
        public float calOT(float s, int h);
    }
    
//--------IMPREMENTS INTERFACE----------------
    
    public class MultiInterfaceTest implements employee1,employee2{

    @Override
    public float setOT(float s) {
        return s/30;
    }

    @Override
    public float calOT(float s, int h) {
       return setOT(s)*h;
    }
 
//------------------------      
        
    public static void main(String[] args) {
        MultiInterfaceTest emp = new MultiInterfaceTest();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter OT Rate>>> ");
        float salary = sc.nextFloat();
        System.out.print("Enter OT HOUR>>> ");
        int hr = sc.nextInt();
        System.out.println("OT HOUR = " + hr + "HR.");
        
        System.out.println("OT RATE = " + 
                emp.setOT(salary)+ "BAHT/HR.");
        
        System.out.println("TOTAL OT = " + 
                emp.calOT(salary, hr) + "BAHT");
    }
    
}
