/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mai Vang
 */
public class Bai2 {
     public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = scanner.nextInt();

        a = new int[n];
        nhap(a,n);

        System.out.print("Các số nguyên tố là : ");
        for (int i=0;i<n;i++) {
            if (check(a[i])  )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        //Gọi hàm sắp xếp
        //In hàm sau khi sắp xếp       
        sapxep(a,n);

    }
    public static void nhap(int a[],int n){
         Random rand = new Random();
        // Tạo đối tượng nhập
        for (int i=0;i<n;i++)
            a[i] = rand.nextInt(50);
    }
    
    public static void xuat(int a[],int n){
    for (int i=0;i<n;i++)
        System.out.print("\t" + a[i]);
    }

    public static boolean check(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0) return false;
        //Nếu không chia hết thì trả về true
        return true;
    }
 
    public static void sapxep(int a[],int n){
        for (int i =0;i<n;i++)
            for (int j=0;j<n-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
    }
}
