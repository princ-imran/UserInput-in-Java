/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;

/**
 *
 * @author Spy Hacker
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);//Java Input Method
        int number1;//User value store in this variable
        Scanner input2 = new Scanner(System.in);
        int number2;//User value store in this variable
        
        System.out.print("Enter First Number: ");
        number1 = input1.nextInt();//Store by me on this variable
        System.out.print("Enter Secound Number: ");
        number2 = input2.nextInt();
        int result = number1 + number2; //Use Mathmatic Logic
        
        System.out.print("Result is: "+result);//Your result 
    }
    
}
