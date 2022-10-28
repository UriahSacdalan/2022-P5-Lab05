// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        g.drawRect(10,10,width,height);

        //Draw bottom-left corner

        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 625;
        for(int k = 0; k <= 49; k++){
            g.drawLine(x2,y1,x1,y2);
            x2 -= 20;
            y2 -= 12;
        }

        //Draw bottom-right corner

        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 625;
        for(int k = 0; k <= 49; k++){
            g.drawLine(x1,y1,x2,y2);
            x1 += 20;
            y2 -= 12;
        }

        //Draw top-left corner

        x1 = 970;
        y1 = 9;
        x2 = 10;
        y2 = 22;
        for(int k = 0; k <= 48; k++){
            g.drawLine(x1,y1,x2,y2);
            x1 -= 20;
            y2 += 12;
        }

        //Draw top-right corner

        x1 = 10;
        y1 = 9;
        x2 = 990;
        y2 = 22;
        for(int k = 0; k <= 49; k++){
            g.drawLine(x1,y1,x2,y2);
            x1 += 20;
            y2 += 12;
        }

        //110 pt. version

    }
}
