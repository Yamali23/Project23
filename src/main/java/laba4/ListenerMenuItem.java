package laba4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerMenuItem implements ActionListener {

private final JLabel label;

public ListenerMenuItem(JLabel label) {
this.label = label;
}

public void image(){
	label.setIcon(new ImageIcon(getClass().getResource("/logo.jpg")));
}

public void actionPerformed(ActionEvent e) {
image();
 }
}