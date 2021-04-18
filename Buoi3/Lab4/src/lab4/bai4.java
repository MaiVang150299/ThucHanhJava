/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class bai4 extends JFrame{
    public bai4(String title)
    {
         JPanel pnBox=new JPanel();
      pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
      JButton btn1=new JButton("BoxLayout");
      btn1.setForeground( Color.RED);
      Font font=new Font("Arial", Font.BOLD | Font.ITALIC,25);
      btn1.setFont(font); pnBox.add(btn1);
      JButton btn2=new JButton("X_AXIS");
      btn2.setForeground(Color.BLUE);
      btn2.setFont(font);pnBox.add(btn2);
      JButton btn3=new JButton("Y_AXIS");
      btn3.setForeground(Color.ORANGE);
      btn3.setFont(font);pnBox.add(btn3);
      
      Container con=getContentPane();
      con.add(pnBox);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      bai4 myUI=new bai4("BoxLayout");
       myUI.setSize(600, 100);
       myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myUI.setLocationRelativeTo(null);
       myUI.setVisible(true);
    } 
}
