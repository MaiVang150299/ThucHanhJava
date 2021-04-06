/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        
        int a[], n= 0;
        
        System.out.println("Vui long nhap so luong phan tu: ");
        
        n=x.nextInt();
        
        a = new int[n];
        System.out.println("Nhap cac phan tu: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(String.format("a[%d]=",i));
                    a[i] = x.nextInt();
        }
        
        //So nguyen to
        System.out.print("Cac so nguyen to la: ");
        for(int i =0 ; i<n; i++)
        {
            if(check(a[i]))
                System.out.print(a[i]+" ");
        }
        
       //xuat phan tu lon nhat
        int sln = a[0];
        for (int i = 1; i < n; i++) {
            sln = SoSanh(sln, a[i]);
        }
        System.out.println("So lon nhat: " + sln);
        //so chinh phuong
        System.out.print("So chinh phuong trong mang: ");
        int sl = 0;
        for (int i = 0; i < n; i++) {
            if (checkPerfectSquare(a[i])) {
                sl++;
                System.out.println(a[i] + " ");
            }
        }
        System.out.println("Co " + sl + " so chinh phuong.");
        //sap xep mang tang dan
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j <= n-1; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Mang sau sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static boolean check(int n) {
        if(n<=1)
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
    
    //Sap xep mang tang dan

      public static int SoSanh(int a, int b) {
        int kq;
        if (a >= b) {
            kq = a;
        } else {
            kq = b;
        }
        return kq;
    }

    static boolean checkPerfectSquare(int x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
}
