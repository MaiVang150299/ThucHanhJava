/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Admin
 */
public class Json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ReadFile("employees.json");
    }
    // ghi du lieu vào file json
    public static void GenJSON(String Path) {
        Random rd = new Random();
        NhanVien DSNV[] = new NhanVien[10];
        for (int i = 0; i < 10; i++) {
            DSNV[i] = new NhanVien(i, "Tung" + i, 1990 + i, rd.nextInt(50));

        }
        JSONArray employeeList = new JSONArray();

        for (int i = 0; i < DSNV.length; i++) {
            JSONObject employeeObjects = new JSONObject();
            employeeObjects.put("Employee", convertNVToJSON(DSNV[i]));
            employeeList.add(employeeObjects);
        }

        try {
            FileWriter file = new FileWriter(Path);
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (Exception e) {
        }

    }
    // convert a node to nhan vien
    public static JSONObject convertNVToJSON(NhanVien nv) {
        JSONObject ResultObjects = new JSONObject();
        ResultObjects.put("MSNV", nv.getMANV());
        ResultObjects.put("HOTEN", nv.getHoTen());
        ResultObjects.put("NAMSINH", nv.getNamSinh());
        ResultObjects.put("SP", nv.getSP());
        return ResultObjects;
    }
    // doc du lieu tu file
    public static void ReadFile(String Path) throws FileNotFoundException {
        JSONParser jsonParser = new JSONParser();
        FileReader file = new FileReader(Path);
        try {
            Object obj = jsonParser.parse(file);
            //JSONObject jsonObject = (JSONObject) obj;
            JSONArray Employees = (JSONArray) obj;
            Iterator<JSONObject> objList = Employees.iterator();
            while (objList.hasNext()) {
                System.out.println(objList.next().toJSONString());
            }
        } catch (Exception e) {
        }
    }

}

