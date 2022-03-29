package laba4;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseFrame implements ActionListener{
	
	private  JFrame frame;

    public CloseFrame(JFrame f)
    {

        this.frame = f;
    }

    public void actionPerformed(ActionEvent arg0)
    {
        frame.dispose();
    }
}
