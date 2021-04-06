 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        System.out.println("Nhap vao so thu nhat: ");
        int so1 = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int so2 = scanner.nextInt();
        
        // Tong 2 so
        int tong = so1+ so2;
        System.out.println("Tong hai so la: "+ tong);
        
        //Hieu 2 so
        int hieu = so1 - so2;
        System.out.println("Hieu hai so la: "+ hieu);
        
        //Tich 2 so
        int tich = so1 * so2;
        System.out.println("Tich 2 so la: "+ tich);
        
        //Thuong cua 2 so 
        float thuong = so1/so2;
        System.out.println("Thuong cua 2 so la: " +thuong);
    }
    
}
