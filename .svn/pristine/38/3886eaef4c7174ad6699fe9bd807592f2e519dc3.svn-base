    package laba4;

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.*;
    import java.util.Scanner;

    import javax.swing.ImageIcon;

    public class LoadingFile implements ActionListener
    {

    public void actionPerformed(ActionEvent arg0)
    {
    try {
    loadfile();
    } catch (FileNotFoundException e) {

    e.printStackTrace();
    }

    }

    public void loadfile() throws FileNotFoundException
    {


    String data = "";

    ClassLoader classLoader = getClass().getClassLoader();
    InputStream myFile = classLoader.getResourceAsStream("ff");

    int i = 0;
    Scanner scanner = new Scanner(myFile);
    while (scanner.hasNext())

    {

    data = data + " " + scanner.nextLine();

    }


    Info infoFrame = new Info();
    infoFrame.showData(data);
    }

    }

