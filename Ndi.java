/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndi;
import java.util.Scanner;

/**
 *
 * @author Randi
 */
public class Ndi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14;
        
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
    
}
