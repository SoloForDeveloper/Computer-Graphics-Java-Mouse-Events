import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCommands extends JFrame implements MouseListener{
    int x1,y1,x2,y2;
    Graphics g;

    MouseCommands(){
        //jframe
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mouse Events");
        setLocationRelativeTo(null);
        //add mouse listener method into jframe
        addMouseListener(this);
        //initialize graphics object
        g = getGraphics();
    }

    public void mouseEntered(MouseEvent m){}
    public void mousePressed(MouseEvent m){
        x1 = m.getX();
        y1 = m.getY();
    }
    public void mouseClicked(MouseEvent m){
        System.out.println("Mouse clicked");
    }
    public void mouseReleased(MouseEvent m){
        x2 = m.getX();
        y2 = m.getY();

        g.drawLine(x1,y1, x2, y2);
        g.setColor(Color.RED);
        g.fillOval(x1,y1, 50,50);

        //System.out.println("x start = "+x1+" x end = "+x2);
    }
    public void mouseExited(MouseEvent m){}

    public static void main(String[] args){
        new MouseCommands();
    }
}