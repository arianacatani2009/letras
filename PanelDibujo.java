import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel {
        public void paintComponent(Graphics g){
            Scanner input =new Scanner(System.in);
            super.paintComponent(g);
            int width=getWidth();
            int height=getHeight();

            g.drawLine(0,200,120,0);
            g.drawLine(100,0,300,300);
            g.drawLine(0,100,1000,100);

            double peso,altura,imc;
            String cadena;
            System.out.println("Ingrese el peso?");
            peso=input.nextDouble();
            System.out.println("Ingrese la altura?");
            altura=input.nextDouble();
            imc= peso/altura;
            cadena=String.valueOf(imc);
            g.drawString(cadena,20,20);

        }
    }