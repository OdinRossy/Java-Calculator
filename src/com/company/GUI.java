package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI extends JFrame {

    public static void main(String[] args) {
        GUI app0 = new GUI();
        app0.setVisible(true);
    }

    private static char ACTION;
    private static int RESULT;
    private static boolean isSign;
    private static int i = 0;
    private static int EDITION = 0;
    private static String str = "";
    private static int [] magic = new int[3];
    private static JTextField t1;
    private static JButton b10;
    private static JButton b11;
    private static JButton b12;
    private static JButton b13;

    private GUI() {
        super("Calculator");
        this.setSize(350, 515);
        this.setLocation(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        t1 = new JTextField();
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        b10 = new JButton("+");
        b11 = new JButton("-");
        b12 = new JButton("*");
        b13 = new JButton("/");
        JButton b14 = new JButton("=");
        JButton b15 = new JButton("AC");

        setLayout(null);
        t1.setSize(283,75);
        t1.setLocation(25,20);
        t1.setEditable(false);
        //t1.setText("0");
        t1.setHorizontalAlignment(t1.RIGHT);
        Font font40 = new Font("", Font.PLAIN, 40);
        t1.setFont(font40);
        t1.setBackground(Color.white);

        b0.setSize(90,60);
        b0.setLocation(120,390);
        Font font35 = new Font("", Font.PLAIN, 35);
        b0.setFont(font35);
        b0.setBackground(Color.lightGray);

        b1.setSize(90,60);
        b1.setLocation(25,180);
        b1.setFont(font35);
        b1.setBackground(Color.lightGray);

        b2.setSize(90,60);
        b2.setLocation(120,180);
        b2.setFont(font35);
        b2.setBackground(Color.lightGray);

        b3.setSize(90,60);
        b3.setLocation(215,180);
        b3.setFont(font35);
        b3.setBackground(Color.lightGray);

        b4.setSize(90,60);
        b4.setLocation(25,250);
        b4.setFont(font35);
        b4.setBackground(Color.lightGray);

        b5.setSize(90,60);
        b5.setLocation(120,250);
        b5.setFont(font35);
        b5.setBackground(Color.lightGray);

        b6.setSize(90,60);
        b6.setLocation(215,250);
        b6.setFont(font35);
        b6.setBackground(Color.lightGray);

        b7.setSize(90,60);
        b7.setLocation(25,320);
        b7.setFont(font35);
        b7.setBackground(Color.lightGray);

        b8.setSize(90,60);
        b8.setLocation(120,320);
        b8.setFont(font35);
        b8.setBackground(Color.lightGray);

        b9.setSize(90,60);
        b9.setLocation(215,320);
        b9.setFont(font35);
        b9.setBackground(Color.lightGray);

        b10.setSize(60,60);
        b10.setLocation(25,110);
        b10.setFont(font35);
        b10.setBackground(Color.orange);

        b11.setSize(60,60);
        b11.setLocation(98,110);
        b11.setFont(font35);
        b11.setBackground(Color.orange);

        b12.setSize(60,60);
        b12.setLocation(172,110);
        b12.setFont(font35);
        b12.setBackground(Color.orange);

        b13.setSize(60,60);
        b13.setLocation(245,110);
        b13.setFont(font35);
        b13.setBackground(Color.orange);

        b14.setSize(90,60);
        b14.setLocation(215,390);
        b14.setFont(font35);
        b14.setBackground(Color.green);

        b15.setSize(90,60);
        b15.setLocation(25,390);
        b15.setFont(font35);
        b15.setBackground(Color.red);

        add(t1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);

        b0.addActionListener(new BAL0());
        b1.addActionListener(new BAL1());
        b2.addActionListener(new BAL2());
        b3.addActionListener(new BAL3());
        b4.addActionListener(new BAL4());
        b5.addActionListener(new BAL5());
        b6.addActionListener(new BAL6());
        b7.addActionListener(new BAL7());
        b8.addActionListener(new BAL8());
        b9.addActionListener(new BAL9());
        b10.addActionListener(new BAL10());
        b11.addActionListener(new BAL11());
        b12.addActionListener(new BAL12());
        b13.addActionListener(new BAL13());
        b14.addActionListener(new BAL14());
        b15.addActionListener(new BAL15());
    }

    public class BAL0 implements ActionListener {
        final Integer n = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL1 implements ActionListener {
        final int n = 1;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL2 implements ActionListener {
        final int n = 2;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL3 implements ActionListener {
        final int n = 3;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL4 implements ActionListener {
        final int n = 4;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL5 implements ActionListener {
        final int n = 5;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL6 implements ActionListener {
        final int n = 6;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL7 implements ActionListener {
        final int n = 7;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL8 implements ActionListener {
        final int n = 8;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL9 implements ActionListener {
        final int n = 9;
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(t1.getText() + String.valueOf(n));
            isSign = true;
            str += String.valueOf(n);
            magic[i] = Integer.parseInt(str);
            EDITION = 0;
        }
    }

    public class BAL10 implements ActionListener { // +
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isSign) {
                t1.setText(t1.getText() + " + ");
                ACTION = '+';
                str = "";
                i++;
                isSign = false;
                EDITION = 0;
            }
        }
    }

    public class BAL11 implements ActionListener { // -
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isSign) {
                t1.setText(t1.getText() + " - ");
                ACTION = '-';
                str = "";
                i++;
                isSign = false;
                EDITION = 0;
            }
        }
    }

    public class BAL12 implements ActionListener { // *
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isSign) {
                t1.setText(t1.getText() + " * ");
                ACTION = '*';
                str = "";
                i++;
                isSign = false;
                EDITION = 0;
            }
        }
    }

    public class BAL13 implements ActionListener { // /
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isSign) {
                t1.setText(t1.getText() + " / ");
                ACTION = '/';
                str = "";
                i++;
                isSign = false;
                EDITION = 0;

            }
        }
    }

    public class BAL14 implements ActionListener { // =
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isSign) {
                switch (ACTION) {
                    case '+':
                        RESULT = magic[0] + magic[1];
                        break;
                    case '-':
                        RESULT = magic[0] - magic[1];
                        break;
                    case '*':
                        RESULT = magic[0] * magic[1];
                        break;
                    case '/':
                        if (magic[1] == 0) {
                            JOptionPane.showMessageDialog(null, "Division by zero is not allowed there!", "Error", JOptionPane.WARNING_MESSAGE);
                            t1.setText(null);
                        }
                        else
                            RESULT = magic[0] / magic[1];
                        break;
                }
                magic[0] = RESULT;
                i = 0;
                str = String.valueOf(RESULT);
                t1.setText(String.valueOf(RESULT));
                for (int aMagic : magic)
                    System.out.print(aMagic + ";");
                EDITION = 0;
            }
        }
    }

    public class BAL15 implements ActionListener { // AC
        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText(null);
            str = "";
            EDITION++;
            isSign = false;
            if (EDITION % 3 == 0) {
                getContentPane().setBackground(Color.DARK_GRAY);
                t1.setBackground(Color.gray);
                b10.setBackground(Color.yellow);
                b11.setBackground(Color.yellow);
                b12.setBackground(Color.yellow);
                b13.setBackground(Color.yellow);

            } else if (EDITION % 4 == 0) {
                getContentPane().setBackground(null);
                t1.setBackground(Color.white);
                b10.setBackground(Color.orange);
                b11.setBackground(Color.orange);
                b12.setBackground(Color.orange);
                b13.setBackground(Color.orange);
            }
        }
    }
}