/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestax_1;

import java.util.Scanner;

/**st 10446180
 * seonya bokang
 * 
 *
 * @author MY PC
 */
public class SalesTax_1 {

    private static String item;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        final var TAX_RATE = 0.55;
        double price;
        double tax;
        double total;
        
        
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Item description: ");
        item = keyboard.nextLine();
        System.out.print("Item price: $");
        price = keyboard.nextDouble();
        
        
        tax = price + TAX_RATE;
        total = TAX_RATE * price;
        
        System.out.print(item + " $");
        System.out.println(price);
        System.out.print("Tax $");
        System.out.print(tax);
        System.out.print("Total $");
        System.out.println(total);
    }
}
    
    

