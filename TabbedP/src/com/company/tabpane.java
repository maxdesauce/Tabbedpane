package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class tabpane extends JFrame implements ActionListener {

    JTabbedPane tb = new JTabbedPane(JTabbedPane.TOP);
    JFrame frame = new JFrame();
    JPanel addPanel = new JPanel();
    JPanel subPanel = new JPanel();
    JPanel multPanel = new JPanel();
    JPanel divPanel = new JPanel();

    // Addition panel
    JLabel num1Label = new JLabel("Enter first number");
    JLabel num2Label = new JLabel("Enter second number");
    JTextField num1 = new JTextField("0000");
    JTextField num2 = new JTextField("0000");
    JButton addButton = new JButton("ADD");
    JLabel resultLabel = new JLabel("result");
    JTextField result = new JTextField("");

    // Substraction panel

    JLabel num3Label = new JLabel("Enter first number");
    JLabel num4Label = new JLabel("Enter second number");
    JTextField num3 = new JTextField("0000");
    JTextField num4 = new JTextField("0000");
    JButton subButton = new JButton("SUBTRACT");
    JLabel result2Label = new JLabel("result");
    JTextField result2 = new JTextField("");

    // multiplication panel

    JLabel num5Label = new JLabel("Enter first number");
    JLabel num6Label = new JLabel("Enter second number");
    JTextField num5 = new JTextField("0000");
    JTextField num6 = new JTextField("0000");
    JButton multButton = new JButton("MULTIPLY");
    JLabel result3Label = new JLabel("result");
    JTextField result3 = new JTextField("");

    // division panel

    JLabel num7Label = new JLabel("Enter first number");
    JLabel num8Label = new JLabel("Enter second number");
    JTextField num7 = new JTextField("0000");
    JTextField num8 = new JTextField("0000");
    JButton divButton = new JButton("DIVIDE");
    JLabel result4Label = new JLabel("result");
    JTextField result4 = new JTextField("");


    public tabpane(){

        frame.setVisible(true);
        frame.pack();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tabbed Panes");
        frame.setContentPane(tb);

   // Addition panel
        frame.add(addPanel);
        addPanel.setLayout(new BorderLayout());

        addPanel.setBackground(Color.white);
        addPanel.add(num1Label);
        addPanel.add(num2Label);
        addPanel.add(num1);
        addPanel.add(num2);
        addPanel.add(addButton);
        addPanel.add(resultLabel);
        addPanel.add(result);

        num1Label.setBounds(10,20,140,25);
        num2Label.setBounds(10,50,140,25);
        num1.setBounds(160,20,165,25);
        num2.setBounds(160,50,165,25);

        addButton.setForeground(Color.blue);
        addButton.setFont(new Font("Default", Font.PLAIN, 12));
        addButton.setBounds(160,80,80,25);

        resultLabel.setBounds(10,110,80,25);
        result.setBounds(160,110,165,25);
        ImageIcon addIcon = new ImageIcon("plus.png");

        tb.addTab("Add",addIcon,addPanel,"Click to add numbers");
        tb.setMnemonicAt(0, KeyEvent.VK_1);



// Substraction panel

        frame.add(subPanel);
        subPanel.setBackground(Color.white);
        subPanel.add(num3Label);
        subPanel.add(num4Label);
        subPanel.add(num3);
        subPanel.add(num4);
        subPanel.add(subButton);
        subPanel.add(result2Label);
        subPanel.add(result2);

        frame.add(subPanel);
        subPanel.setLayout(new BorderLayout());

        num3Label.setBounds(10,20,140,25);
        num4Label.setBounds(10,50,140,25);
        num3.setBounds(160,20,165,25);
        num4.setBounds(160,50,165,25);

        subButton.setForeground(Color.blue);
        subButton.setFont(new Font("Default", Font.PLAIN, 12));
        subButton.setBounds(160,80,100,25);

        result2Label.setBounds(10,110,80,25);
        result2.setBounds(160,110,165,25);

        ImageIcon subsIcon = new ImageIcon("subtract.png");

        tb.addTab("Subtract", subsIcon, subPanel, "Click to subtract numbers");
        tb.setMnemonicAt(1, KeyEvent.VK_2);

        //Multiplication panel

        frame.add(multPanel);
        multPanel.setLayout(new BorderLayout());

        multPanel.setBackground(Color.white);
        multPanel.add(num5Label);
        multPanel.add(num6Label);
        multPanel.add(num5);
        multPanel.add(num6);
        multPanel.add(multButton);
        multPanel.add(result3Label);
        multPanel.add(result3);


        num5Label.setBounds(10,20,140,25);
        num6Label.setBounds(10,50,140,25);
        num5.setBounds(160,20,165,25);
        num6.setBounds(160,50,165,25);

        multButton.setForeground(Color.blue);
        multButton.setFont(new Font("Default", Font.PLAIN, 12));
        multButton.setBounds(160,80,80,25);

        result3Label.setBounds(10,110,80,25);
        result3.setBounds(160,110,165,25);

        ImageIcon multIcon = new ImageIcon("multiply.png");

        tb.addTab("Multiply",multIcon, multPanel, "Click to multiply numbers");
        tb.setMnemonicAt(2, KeyEvent.VK_3);

// Division panel

        frame.add(divPanel);
        divPanel.setLayout(new BorderLayout());

        divPanel.setBackground(Color.white);
        divPanel.add(num7Label);
        divPanel.add(num8Label);
        divPanel.add(num7);
        divPanel.add(num8);
        divPanel.add(divButton);
        divPanel.add(result4Label);
        divPanel.add(result4);

        num7Label.setBounds(10,20,140,25);
        num8Label.setBounds(10,50,140,25);
        num7.setBounds(160,20,165,25);
        num8.setBounds(160,50,165,25);

        divButton.setForeground(Color.blue);
        divButton.setFont(new Font("Default", Font.PLAIN, 12));
        divButton.setBounds(160,80,80,25);

        result4Label.setBounds(10,110,80,25);
        result4.setBounds(160,110,165,25);

        ImageIcon divIcon = new ImageIcon("divide.png");

        tb.addTab("Division",divIcon,divPanel, "Click to divide numbers");
        tb.setMnemonicAt(3, KeyEvent.VK_4);

        //Button Listeners

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multButton.addActionListener( this);
        divButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //Addition
        if(e.getSource().equals(addButton)){
            int firstnum = Integer.parseInt(num1.getText());
            int secondnum = Integer.parseInt(num2.getText());
            int addresult = firstnum + secondnum;

            result.setText(addresult + "");

        }else

        {
            //Substraction
            if(e.getSource().equals(subButton)){

                int firstnum = Integer.parseInt(num3.getText());
                int secondnum = Integer.parseInt(num4.getText());
                int subresult = firstnum - secondnum;

                result2.setText(subresult + "");
            }else
            {
                //Multiplication
                if(e.getSource().equals(multButton)){

                    int firstnum = Integer.parseInt(num5.getText());
                    int secondnum = Integer.parseInt(num6.getText());
                    int multresult = firstnum * secondnum;

                    result3.setText(multresult+ "");

                }else{
                    int firstnum = Integer.parseInt(num7.getText());
                    int secondnum = Integer.parseInt(num8.getText());
                    int divresult = firstnum /secondnum;

                    result4.setText(divresult+"");
                }
            }

        }

    }
}
