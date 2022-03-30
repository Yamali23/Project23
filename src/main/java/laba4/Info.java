package laba4;

import javax.swing.*;

public class Info  
{
   
	JButton button2 = new JButton("Назад");
    JFrame main_GUI2 = new JFrame("Информация");
    JPanel main_panel = new JPanel();

    public Info()
    {
    	
    	JLabel l3 = new JLabel("Дата: 30.03.2022");
		l3.setSize(100,40);
		l3.setLocation(00, 120);
		main_GUI2.add(l3);


        main_GUI2.setBounds(300,100,500,500);
        main_GUI2.setResizable(false);

        button2.setBounds(70,200,200,40);
        button2.addActionListener(new CloseFrame(main_GUI2));
        main_GUI2.add(button2);

        
        main_panel.setLayout(null);
        main_GUI2.add(main_panel);

        main_GUI2.setVisible(true);

    }
    
    public void showData(String a)
    {
        JLabel laba_info = new JLabel(a);
        laba_info.setBounds(30,0,450,60);
        main_panel.add(laba_info);
    }
    
}

