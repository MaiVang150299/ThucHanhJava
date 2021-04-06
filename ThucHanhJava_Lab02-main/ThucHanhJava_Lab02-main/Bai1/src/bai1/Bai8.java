/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 *
 * @author Mai Vang
 */
public class Bai8 {
    public static void main(String args[]) throws IOException
    {
        StringWriter ost = new StringWriter();
        String s = "Xin chao, day la chuogn trinh doc xuat chuoi:";
        for(int i = 0; i <s.length(); i++)
            ost.write(s.charAt(i));
        System.out.println("Xuat chuoi: " +ost);
        StringReader inst;
        inst = new StringReader(ost.toString());
        int a=0;
        @SuppressWarnings("StringBufferMaybeStringBuilder")
        StringBuffer sb1=new StringBuffer("");
        while((a=inst.read())!=-1)
            sb1.append((char)a);
        s = sb1.toString();
        System.out.println("Chieu dai chuoi doc duoc:" +s.length());
        System.out.println("Day la chuoi doc duoc:" +s);
    }
}
