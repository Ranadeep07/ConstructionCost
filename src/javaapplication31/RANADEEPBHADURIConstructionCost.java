/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author RANADEEP
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConstructionCost obj=new ConstructionCost();
        obj.Con_Cost();
        
    }
    
}
class ConstructionCost
{
    public void Con_Cost()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter total area of house in Square feet: ");
        float area=sc.nextFloat();
        System.out.println("Enter Choice:\n1.For standard materials\n 2.For above standard materials\n3.For high standard material\n4.For high standard material and fully automated home  ");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Construction cost: 1200INR"); 
                    break;
            case 2: System.out.println("Construction cost: 1500INR");
                    break;
            case 3: System.out.println("Construction cost: 1800INR");
                    break;
            case 4: System.out.println("Construction cost: 2500INR ");
                    break;
        }
            
    }
}
