/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bai3;
import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ma sinh vien
        Scanner x = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        String masv = x.nextLine();
        
        //Ho ten sinh vien
        System.out.println("Nhap ho va ten sinh vien: ");
        String hoten = x.nextLine();
        
        // Tuoi cua sinh vien
        System.out.println("Nhap tuoi cua sinh vien: ");
        byte tuoi = x.nextByte();
        
        //Nam sinh
        System.out.println("Nhap nam sinh: ");
        int ns = x.nextInt();
        
        //Diem trung binh
        System.out.println("Diem trung binh: ");
        float DTB = x.nextFloat();
    }
    
}
