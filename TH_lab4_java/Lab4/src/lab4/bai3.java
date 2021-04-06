/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class bai3 extends JFrame {
    public bai3 (String title)
    {
        setTitle(title);
        JPanel pnFlow=new JPanel ();
        pnFlow.setLayout (new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1= new JButton("FlowLayout");
        JButton btn2= new JButton("Add cac control");
        JButton btn3= new JButton("Tren mot dong");
        JButton btn4= new JButton("Het cho chua");
        JButton btn5= new JButton("Thi xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);
    }
      public static void main(String[] args) {
        // TODO code application logic here
       bai3 myUI=new bai3("Demo FlowLayout");
       myUI.setSize(600, 100);
       myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myUI.setLocationRelativeTo(null);
       myUI.setVisible(true);
    } 
}
