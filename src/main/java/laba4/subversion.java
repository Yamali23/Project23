package laba4; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import java.awt.event.ActionListener;
public class subversion {

	
    private JLabel label;
	
	public subversion() {
		JFrame main_GUI = new JFrame("Лаба 3");
        main_GUI.setBounds(300,100,500,500);
        main_GUI.setResizable(false);
        main_GUI.setLayout(null);

        JButton button = new JButton("Информация");
        button.setBounds(10,300,150,40);
        ActionListener actionListener = new ListenerButton();
        button.addActionListener(actionListener);
        main_GUI.add(button);
        
        JButton buttonExit = new JButton("Выход");
        buttonExit.setBounds(170,300,150,40);
        ActionListener actionListenerEx = new ListenerExit();
        buttonExit.addActionListener(actionListenerEx);
        main_GUI.add(buttonExit);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Меню");
        menuBar.add(menu);
        main_GUI.setJMenuBar(menuBar);

        JMenuItem menuItem1 = new JMenuItem("Логотип");
        JMenuItem menuItem2 = new JMenuItem("Выход");
        JMenuItem menuItem3 = new JMenuItem("Загрузить файл в проект23");
        
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        
        menuItem3.addActionListener(new LoadingFile());
        
        label = new JLabel();
        label.setLocation(330,1);
        label.setSize(150,75);
        main_GUI.add(label);

        JLabel labelTwo = new JLabel();
        labelTwo.setLocation(5,400);
        labelTwo.setSize(450,30);
        labelTwo.setText("Уфимский Государственный Авиационный Технический Университет");
        main_GUI.add(labelTwo);
        
        ActionListener actionListenerExit = new ListenerExit();
        menuItem2.addActionListener(actionListenerExit);
        
        ActionListener actionListenerMenuItem = new ListenerMenuItem(label);
        menuItem1.addActionListener(actionListenerMenuItem);
        String[] items = {
        		"Переместить логотип УГАТУ в левый верхний угол",
        		"Переместить логотип УГАТУ в середину",
        		"Переместить логотип УГАТУ в правый верхний угол",
        		"Отсортировать данные в проекте23"
        		};
        		JComboBox comboBox = new JComboBox(items);
        		main_GUI.add(comboBox);
        		comboBox.setLocation(20,350);
        		comboBox.setSize(330,30);

        		ActionListener actionListenerComboBox = new ListenerComboBox(label,comboBox);
        		comboBox.addActionListener(actionListenerComboBox);
        		
        		JLabel l1 = new JLabel("a =");
        		l1.setSize(40,40);
        		l1.setLocation(190, 0);
        		main_GUI.add(l1);
        		JLabel l2 = new JLabel("b =");
        		l2.setSize(40,40);
        		l2.setLocation(190, 60);
        		main_GUI.add(l2);
        		JLabel l3 = new JLabel("c =");
        		l3.setSize(40,40);
        		l3.setLocation(190, 120);
        		main_GUI.add(l3);

        		JTextField t1 = new JTextField();
        		t1.setSize(40,40);
        		t1.setLocation(220, 0);
        		main_GUI.add(t1);
        		JTextField t2 = new JTextField();
        		t2.setSize(40,40);
        		t2.setLocation(220, 60);
        		main_GUI.add(t2);
        		JTextField t3 = new JTextField();
        		t3.setSize(40,40);
        		t3.setLocation(220, 120);
        		main_GUI.add(t3);
        		
        		JButton buttonCalc = new JButton("Вычислить");
        		buttonCalc.setBounds(330,300,150,40);
        		buttonCalc.addActionListener(new Calculations(t1, t2, t3));
        		main_GUI.add(buttonCalc);
        		
        main_GUI.setVisible(true);
        main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

    	subversion student= new subversion();
    }

}

    