
package oop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0, r, temp, num;
        
        System.out.print("Enter any digit: ");
        num = input.nextInt();
        
       temp = num;
        
        while(temp != 0) {
            
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
            
    
        }//System.out.println("sddffdhgfdtyb : "+xum);
        System.out.println("Sum of digits: "+sum);
    }
    
}

