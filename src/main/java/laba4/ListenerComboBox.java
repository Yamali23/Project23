package laba4;
	
 import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
	
 public class ListenerComboBox implements ActionListener {
 private final JLabel label;
 private final JComboBox box;
 private String item;
	
	public ListenerComboBox(JLabel label, JComboBox box)
	{
		this.label = label;
		this.box = box;
			}
			public void changeLocation () {
				String item = (String)box.getSelectedItem();
	
				if ( item.equals("����������� ������� ����� � ������ ������� ����"))
			{
					label.setLocation(330,3);
			}
				if ( item.equals("����������� ������� ����� � ��������"))
			{
					label.setLocation(150,130);
			}
				if ( item.equals("����������� ������� ����� � ����� ������� ����"))
				{
					label.setLocation(5,3);
		}
	
			}
	
			public void actionPerformed(ActionEvent arg0)
			{
				item = (String)box.getSelectedItem();
	
				if (item.equals("������������� ������ � �������23"))
				{
					Sort sort = new Sort();
		}
				else {
		changeLocation();
				}
	
	}
}