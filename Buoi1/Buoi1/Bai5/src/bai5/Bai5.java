/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai5 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.println("Nhap vao so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so nguyen duong b: ");
        int b = scanner.nextInt();
        
        System.out.println("UCLN la: "+UCLN(a,b));
        System.out.println("BCNN la: "+BCNN(a,b));
        
    }
    // Uoc chung lon nhat
    public static int UCLN(int a, int b){
        if(b==0) 
            return a;
        return UCLN(b,a%b);
    }
    
    //Boi chung nho nhat
    public static int BCNN(int a, int b){
        return(a*b)/UCLN(a,b);
    }
}
