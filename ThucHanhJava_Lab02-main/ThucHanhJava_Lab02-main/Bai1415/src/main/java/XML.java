/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\

        ReadFile("NhanVien.xml");
    }
    // ghi du lieu vao file
    public static void BuildXML(String Path) {
        Random rd = new Random();
        NhanVien DSNV[] = new NhanVien[10];
        for (int i = 0; i < 10; i++) {
            DSNV[i] = new NhanVien(i, "Tung" + i, 1990 + i, rd.nextInt(50));

        }
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            Element rootElement
                    = doc.createElementNS("save all data", "Employees");
            for (int i = 0; i < DSNV.length; i++) {
                rootElement.appendChild(ConvertNV(doc, DSNV[i]));
            }
            doc.appendChild(rootElement);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            StreamResult console = new StreamResult(System.out);
            File file = new File(Path);
            if (!file.exists()) {
                boolean created = file.createNewFile();
            }

            StreamResult fileStream = new StreamResult(file);
            transformer.transform(source, console);
            transformer.transform(source, fileStream);

        } catch (Exception e) {
        }

    }
    // convert mot mot nhan vien thanh mot element trong xml
    public static Node ConvertNV(Document doc, NhanVien nv) {

        Element employee = doc.createElement("Employee");
        employee.appendChild(getEmployeeElements(doc, employee, "MSNV", nv.getMANV() + ""));
        employee.appendChild(getEmployeeElements(doc, employee, "HOTEN", nv.getHoTen()));
        employee.appendChild(getEmployeeElements(doc, employee, "NAMSINH", nv.getNamSinh() + ""));
        employee.appendChild(getEmployeeElements(doc, employee, "SP", nv.getSP() + ""));
        return employee;
    }
    //  tao mot node cha
    private static Node getEmployeeElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
    // doc file xml tu file
    public static void ReadFile(String Path) {
        File xmlFile = new File(Path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Employee");
            //now XML is loaded as Document in memory, lets convert it to Object List
            List<NhanVien> empList = new ArrayList<NhanVien>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                empList.add(getEmployee(nodeList.item(i)));
            }
            //lets print Employee list information
            for (NhanVien emp : empList) {
                System.out.println(emp.toString());
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
    }
    // convert tu node sang nhan vién
    private static NhanVien getEmployee(Node node) {
        //XMLReaderDOM domReader = new XMLReaderDOM();
        NhanVien emp = new NhanVien();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            emp.setMANV(Integer.parseInt(getTagValue("MSNV", element)));
            emp.setHoTen(getTagValue("HOTEN", element));
            emp.setNamSinh(Integer.parseInt(getTagValue("NAMSINH", element)));
            emp.setSP(Integer.parseInt(getTagValue("SP", element)));
        }

        return emp;
    }
    // get node bang a tag name
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

}
