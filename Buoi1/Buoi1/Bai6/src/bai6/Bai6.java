/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao so n: ");
        int n = scanner.nextInt();
        
        System.out.println("Tat ca cac so nguyen to nho hon bao gom:");
        if( n>= 2)
        {
            System.out.println("So nguyen to la: " + 2);
        }
        for(int i = 3; i < n; i += 2){
            if(check(i))
            {
                System.out.println("So nguyen to la: "+i);
            }
        }
     
    }

    public static boolean check(int n) {
        if(n<2)
        {
         return false;
        }  
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i ==0)
            {
                return false;
            }
        }
        return true;
    }
}
