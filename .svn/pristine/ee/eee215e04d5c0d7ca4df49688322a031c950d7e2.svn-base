package laba4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculations implements ActionListener
{
private JTextField t1;
private JTextField t2;
private JTextField t3;

public Calculations(JTextField tf1, JTextField tf2, JTextField tf3)
{

this.t1 = tf1;
this.t2 = tf2;
this.t3 = tf3;
}

public void actionPerformed(ActionEvent arg0)
{
calc();
}

public void calc()
{
int a,b,c;

a = cheeck(t1.getText());
b = cheeck(t2.getText());
c = cheeck(t3.getText());

if((a==0)||(b==0)||(c==0))
{
Info infoFrame = new Info();
infoFrame.showData("Неверные данные. Повторите ввод");
}

else
{
volume(a, b, c);
}

}

public void volume(int a,int b, int c)
{
int v = a*b*c;
Info infoFrame = new Info();
infoFrame.showData("Объем прямоугольного параллелепипеда равен " + v);
}

public int cheeck (String s)
{
int c;

if (s.equals(""))
{
c = 0;
}
else
{
int l = s.length();

int k = 0;
char[] chars = s.toCharArray();
for ( int i = 0 ; i < l; i++)
{
if ((chars[i] == '0')||(chars[i] == '1')||(chars[i] == '2')||(chars[i] == '3')||(chars[i] == '4')||(chars[i] == '5')||(chars[i] == '6')||(chars[i] == '7')||(chars[i] == '8')||(chars[i] == '9'))
{
k ++;
}
}

if (k==l)
{
c = Integer.parseInt(s);
}
else c =0;


System.out.println(c);

}


return c;
}
}


