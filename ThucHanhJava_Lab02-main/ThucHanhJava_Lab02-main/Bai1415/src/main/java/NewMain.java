/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ReadFile("dsnhanvien.dat");
    }
//  ghi vao file dat
    public static void GenNV(String Path) throws IOException {
        Random rd = new Random();
        NhanVien DSNV[] = new NhanVien[10];
        for (int i = 0; i < 10; i++) {
            DSNV[i] = new NhanVien(i, "Tung" + i, 1990 + i, rd.nextInt(50));

        }
        OutputStream out = null;
        try {
            File file = new File(Path);
            if (!file.exists()) {

                boolean created = file.createNewFile();
            }
            out = new FileOutputStream("dsnhanvien.dat");
            for (int i = 0; i < 10; i++) {
                byte data[] = (DSNV[i].getMANV() + " " + DSNV[i].getHoTen() + " " + DSNV[i].getNamSinh() + " " + DSNV[i].getSP() + "#").getBytes();
                out.write(data);
            }

        } catch (Exception e) {
        } finally {
           
        }
    }
// doc du lieu tu file dat
    public static void ReadFile(String Path) throws FileNotFoundException, IOException {
        InputStream input = null;
        try {
            File file = new File(Path);
            byte data[];
            if (file.exists()) {
                input = new FileInputStream(Path);
                DataInputStream dataInput = new DataInputStream(input);
                data = new byte[(int)file.length()];
                dataInput.read(data);
                String result = new String(data);
                String NV[] = result.split("#");
                for (int i = 0; i < NV.length; i++) {
                    NhanVien nv = new NhanVien(NV[i]);
                    System.out.println(nv.toString());
                }
            } else {
                System.out.println("file khong ton tai");
            }
        } catch (Exception e) {
        }
        finally{
            input.close();
        }
    }

}
