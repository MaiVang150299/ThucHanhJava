/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class bai5 extends JFrame{
      public bai5(String title)
    {
         JPanel pnBorder=new JPanel();
            pnBorder.setLayout(new BorderLayout());
            //north
        JPanel pnNorth=new JPanel();
             pnNorth.setBackground(Color.RED);
             pnBorder.add(pnNorth,BorderLayout.NORTH);
             //south
        JPanel pnSouth=new JPanel();
             pnSouth.setBackground(Color.RED);
             pnBorder.add(pnSouth,BorderLayout.SOUTH);
             //west
        JPanel pnWest=new JPanel();
             pnWest.setBackground(Color.BLUE);
             pnBorder.add(pnWest,BorderLayout.WEST);
             //east
        JPanel pnEast=new JPanel();
             pnEast.setBackground(Color.BLUE);
             pnBorder.add(pnEast,BorderLayout.EAST);
             //center
        JPanel pnCenter=new JPanel();
             pnCenter.setBackground(Color.YELLOW);
             pnBorder.add(pnCenter,BorderLayout.CENTER);
                getContentPane().add(pnBorder);
    }
    
      public static void main(String[] args) {
       bai5 myUI=new bai5("BoxLayout");
     myUI.setSize(600, 100);
       myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myUI.setLocationRelativeTo(null);
       myUI.setVisible(true);
    } 
}
