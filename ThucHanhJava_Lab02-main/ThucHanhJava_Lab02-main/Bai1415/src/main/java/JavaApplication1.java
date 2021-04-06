/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String inputPath = "data2.txt";
        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
        String thisLine;
        try {
            BufferedReader myInput = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath)), "utf-8"));
            while ((thisLine = myInput.readLine()) != null) {
                if (thisLine.isEmpty()) {
                    continue;
                }
                String Split[] = thisLine.split(" ");
                for (int i = 0; i < Split.length; i++) {
                    if (hashtable.get(Split[i])==null) {
                        hashtable.put(Split[i], 1);
                    } else {
                         hashtable.put(Split[i], hashtable.get(Split[i])+1);
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
                System.out.println(entry.getKey()+"/"+entry.getValue());
            }
        } catch (IOException e) {
        }
    }
    
}
