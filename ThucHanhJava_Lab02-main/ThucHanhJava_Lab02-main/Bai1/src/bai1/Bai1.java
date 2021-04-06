/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Mai Vang
 */
public class Bai1 {


    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhập vào hệ số a:  ");
        float HeSoA = Bai1.input.nextFloat();
        System.out.print("Nhập vào hệ số b: ");
        float HeSoB = Bai1.input.nextFloat();
        System.out.print("Nhập vào hệ số c: ");
        float HeSoC = input.nextFloat();
        Bai1.giaiPTBac2(HeSoA, HeSoB, HeSoC);
    }
     

    public static void giaiPTBac2(float HeSoA, float HeSoB, float HeSoC) {
        // Kiểm tra các hệ số
        if (HeSoA == 0) {
            if (HeSoB == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm : "
                        + "x = " + (-HeSoC / HeSoB));
            }
            return;
        }
        // Tính delta
        float delta = HeSoB*HeSoB - 4*HeSoA*HeSoC;
        float x1;
        float x2;
        // tính nghi?m
        if (delta > 0) {
            x1 = (float) ((-HeSoB + Math.sqrt(delta)) / (2*HeSoA));
            x2 = (float) ((-HeSoB - Math.sqrt(delta)) / (2*HeSoA));
            System.out.println("Phương trình có hai nghiệm: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-HeSoB / (2 * HeSoA));
            System.out.println("Phương trình có một nghiệm kép : "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm !");
        }
    }
}