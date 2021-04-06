/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1415;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here String inputPath = "data.txt";
        String inputPath = "data.txt";
        String thisLine;
        try {
            BufferedReader myInput = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath))));
            while ((thisLine = myInput.readLine()) != null) {
                if (thisLine.isEmpty()) {
                    continue;
                }
                String Split[] = thisLine.split(" ");
                for (int i = 0; i < Split.length; i++) {
                    System.out.println(Split[i]);
                }
            }
        } catch (IOException e) {
        }
    }

}
