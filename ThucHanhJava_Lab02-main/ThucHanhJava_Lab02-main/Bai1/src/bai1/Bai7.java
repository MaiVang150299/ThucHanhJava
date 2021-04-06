/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Mai Vang
 */
public class Bai7 {
    static int getPos(int i, int a[])
    {
        return a[i];
    }
    static void output(int a[], int n){
        try{
            for(int i=0; i<n; i ++)
                System.out.println(getPos(i,a)); //// ket qu? do dòng này
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Vuot qua chi so mang!");
        }
    }
    public static void main(String[] args){
        int a[]={4,7,9,12,7};
        output(a,10);
    }
}
