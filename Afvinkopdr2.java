package afvinkopdr2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Afvinkopdr2 extends JFrame implements ActionListener{
    
    
    private JButton button; 
    private JTextField text,text2;
    private JPanel panel;
    private JLabel label,label2;

    public static void main(String[] args) {
        Afvinkopdr2 frame = new Afvinkopdr2();
        frame.setSize(500,500);
        frame.createGUI();
        frame.setVisible(true);
        frame.setTitle("helemaal mooie ding");
    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        window.setBackground(Color.white);
        
        button = new JButton("druk hier");
        button.addActionListener(this);
        window.add(button);
        
        text = new JTextField(5);
        label = new JLabel("X");
        window.add(label);
        window.add(text);
        
        text2 = new JTextField(5);
        label2 = new JLabel("Y");
        window.add(label2);
        window.add(text2);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.white);
        window.add(panel);
        
    }
    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println(text.getText());
        Graphics paper = panel.getGraphics(); 
        paper.clearRect(0, 0, 300, 300);
        String xstring = text.getText();
        String ystring = text2.getText();
        int xgoeie = Integer.parseInt(xstring);
        int ygoeie = Integer.parseInt(ystring);
        paper.drawLine(xgoeie+20,ygoeie+20,xgoeie+110,ygoeie+110);
        paper.drawLine(xgoeie+120,ygoeie+120,xgoeie+20,ygoeie+210);
        paper.setColor(Color.blue);
        paper.fillOval(xgoeie, ygoeie+175, 60, 60);
        paper.fillOval(xgoeie, ygoeie, 60, 60);
        paper.setColor(Color.red);
        paper.fillOval(xgoeie+95, ygoeie+90, 80, 80);        
       
    }
}