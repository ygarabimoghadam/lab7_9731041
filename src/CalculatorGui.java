import javax.swing.*;
import java.awt.*;

/**
 * GUI for calculator
 */

public class CalculatorGui {
    JFrame calFrame;
    JPanel keyboardPanel;
    JPanel keyboardPanel2;
    JPanel keyboardPanel3;
    JTextArea display;
    JScrollPane scrollPane;
    JTabbedPane tp ;

    public CalculatorGui(){
        calFrame = new JFrame();
        keyboardPanel = new JPanel();
        keyboardPanel2 = new JPanel();
        keyboardPanel3 = new JPanel();
        display = new JTextArea(3,10);
        tp = new JTabbedPane();
    }

    /**
     * creating frame in this method
     */
    public void  frame() {

        calFrame.setTitle("AUT Calculator");
        calFrame.setSize(300, 300);
        calFrame.setLocation(100, 200);
        calFrame.setLayout(new BorderLayout());
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.setVisible(true);
    }
    /**
     * creating panels in this method
     */
    public void panel(){

        keyboardPanel.setSize(100,100);
        keyboardPanel.setLocation(10, 150);
        keyboardPanel.setLayout(new GridLayout(4,4));
        keyboardPanel2.setSize(20,20);
        keyboardPanel2.setLocation(10, 15);
        keyboardPanel2.setLayout(new BorderLayout());
        keyboardPanel3.setSize(100,100);
        keyboardPanel3.setLocation(10, 150);
        keyboardPanel3.setLayout(new GridLayout(5,5));

    }
    /**
     * creating buttons in this method
     */
    public  void button(){

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton();
            btn.setText("" + i);
            keyboardPanel.add(btn); }

        JButton sumBtn = new JButton();
        sumBtn.setText("+");
        keyboardPanel.add(sumBtn);

        JButton minusBtn = new JButton();
        minusBtn.setText("-");
        keyboardPanel.add(minusBtn);

        JButton doBtn = new JButton();
        doBtn.setText("=");
        keyboardPanel.add(doBtn);

        JButton multiBtn = new JButton();
        multiBtn.setText("*");
        keyboardPanel.add(multiBtn);

        JButton divBtn = new JButton();
        divBtn.setText("/");
        keyboardPanel.add(divBtn);

       /* JButton acBtn = new JButton();
        acBtn.setText("AC");
        keyboardPanel.add(acBtn);*/

        JButton tBtn = new JButton();
        tBtn.setText("%");
        keyboardPanel.add(tBtn);

        JButton scBtn = new JButton();
        scBtn.setText("sin/cos");
        keyboardPanel3.add(scBtn);

        JButton tcBtn = new JButton();
        tcBtn.setText("tan/cot");
        keyboardPanel3.add(tcBtn);

        JButton shiftBtn = new JButton();
        shiftBtn.setText("shift");
        keyboardPanel3.add(shiftBtn);

        JButton LBtn = new JButton();
        LBtn.setText("log/exp");
        keyboardPanel3.add(LBtn);

        JButton eBtn = new JButton();
        eBtn.setText("e");
        keyboardPanel3.add(eBtn);

        JButton pBtn = new JButton();
        pBtn.setText("PI");
        keyboardPanel3.add(pBtn);

        JButton powwBtn = new JButton();
        powwBtn.setText("x**2");
        keyboardPanel3.add(powwBtn);

        JButton makusBtn = new JButton();
        makusBtn.setText("1/x");
        keyboardPanel3.add(makusBtn);

        JButton ghadrBtn = new JButton();
        ghadrBtn.setText("|x|");
        keyboardPanel3.add(ghadrBtn);

        JButton pow3Btn = new JButton();
        pow3Btn.setText("x**3");
        keyboardPanel3.add(pow3Btn);
    }
    /**
     * creating textFiled in this method
     */
    public void text(){
        display.setEditable(true);
        display.setFont(new Font("Arial", 14,14));


    }

    public void scroll() {

        scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        keyboardPanel2.add(scrollPane);
    }
    /**
     * seperate sade from mohanesi in this method
     */
    public void tabBedPane(){

        tp.setBounds(50,50,200,200);
        tp.add("sade",keyboardPanel);
        tp.add("mohandesi",keyboardPanel3);
    }
    /**
     * adding all method together
     */
    public void add(){
        frame();
        panel();
        button();
        text();
        scroll();
        tabBedPane();
        calFrame.add(keyboardPanel2,BorderLayout.NORTH);
        calFrame.add(tp);
    }

}