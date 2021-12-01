package laba7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Order extends JFrame {
    String text1;
    int k, f;
    Object boxA, boxB;
    File file = new File("D://GUI.txt");
    static JLabel l1, l2, l3, l4, l5;
    static JCheckBox c;
    JComboBox box_1, box_2;
    JRadioButton flag1, flag2;
    ButtonGroup bg;
    static JButton b, del;
    static JTextField text;
    static JTextArea area;
    static String[] box1 = {"Купалы", "Клецкова", "БЛК", "Победы", "Космонавтов", "Щерса", "Пушкина", "Горького"};
    static String[] box2 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};

    public Order (String str){
        super (str);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("Оформить заказ");
        del = new JButton("Очистить");
        text = new JTextField(9);
        area = new JTextArea(9, 9);
        l1 = new JLabel("Название товара");
        l2 = new JLabel("Личные данные(ФИО, моб.тел)");
        l3 = new JLabel("Адрес доставки");
        l4 = new JLabel("Оплата");
        l5 = new JLabel ("Уведомить о прибытии товара");
        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        flag1 = new JRadioButton("картой");
        flag2 = new JRadioButton("наличными");
        bg = new ButtonGroup();
        bg.add(flag1);
        bg.add(flag2);
        c = new JCheckBox();

        setLayout(null);

        b.setSize(200,30);
        b.setLocation(250, 400);
        del.setSize(100, 30);
        del.setLocation(30, 400);
        text.setSize(220,25);
        text.setLocation(250, 20);
        area.setSize(220,150);
        area.setLocation(250,60);
        l1.setSize(200,25);
        l1.setLocation(30, 20);
        l2.setSize(220, 25);
        l2.setLocation(30, 60);
        l3.setSize(200, 25);
        l3.setLocation(30, 310);
        l4.setSize(200, 25);
        l4.setLocation(30, 250);
        l5.setSize(200, 25);
        l5.setLocation(30, 350);
        c.setSize(200, 25);
        c.setLocation(250, 350);
        box_1.setSize(100,25);
        box_1.setLocation(250,310);
        box_2.setSize(40, 25);
        box_2.setLocation(360, 310);
        flag1.setSize(80,25);
        flag1.setLocation(250, 250);
        flag2.setSize(100, 25);
        flag2.setLocation(330, 250);


        add(b);
        add(del);
        add(text);
        add(area);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(box_1);
        add(box_2);
        add(flag1);
        add(flag2);
        add (c);

        b.addActionListener(new ButtonActionListener());
        flag1.addActionListener(new FlagActionListener());
        flag2.addActionListener(new FlagActionListener());
        del.addActionListener(new DelActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        c.addActionListener(new CheckActionListener());
    }

    public class ButtonActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {

                if (!file.exists())
                    file.createNewFile();

                FileWriter out = new FileWriter(file, true);

                try {

                    String text1 = text.getText();
                    String area2 = area.getText();
                    out.write(text1+ "\n");
                    out.write(area2 + "\n");
                    if (k == 1)
                        out.write("Оплата будет произведена наличными.  " + "\n");

                    else if (k == -1)
                        out.write("Оплата будет произведена картой. " + "\n");

                    out.write("Адрес доставки: " + boxA + " " + boxB + "\n");

                    if (f==1)
                        out.write ("Требуется уведомить о поступлении заказа.\n");
                    else
                        out.write ("Не требуется уведомлять о поступлении заказа.");

                } finally {
                    out.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            k = 0;
            if(e.getSource() == flag1){
                k++;
            }

            else if(e.getSource() == flag2){
                k--;
            }
        }
    }

    public class DelActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == del){
                text.setText(null);
                area.setText(null);
            }
        }
    }

    public class BoxActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == box_1)
                boxA = box_1.getSelectedItem();

            if(e.getSource() == box_2)
                boxB = box_2.getSelectedItem();
            }
    }


    public class CheckActionListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            f=0;
        if (true==c.isSelected())
            f++;
        else
            f--;
    }
    }
}


