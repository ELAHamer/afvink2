package afvinkopdr2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Afvinkopdr2 extends JFrame implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    
    public static void main (String[] args){
        Afvinkopdr2 frame = new Afvinkopdr2();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.show();
    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,200));
        panel.setBackground(Color.white);
        window.add(panel);
        
        button = new JButton("press");
        window.add(button);
        button.addActionListener(this);            
    }


    @Override
    public void actionPerformed (ActionEvent event){
        Graphics paper = panel.getGraphics();
        paper.drawLine(0, 0, 100, 100);
        paper.setColor(Color.red);
        paper.drawLine(0, 0, 100, 100);
        paper.drawOval(0,0,60,60);
        paper.setColor(Color.yellow);
        System.out.println("action");

    }   
}