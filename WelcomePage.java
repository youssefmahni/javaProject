package ClientSide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame implements ActionListener {

    Timer timer;
    int xValue=50;
    int yValue=270;
    int wh=100 ;


    WelcomePage(){
        timer= new Timer(50,this);
        timer.start();

        this.setFont(new Font("",Font.BOLD,70));
        this.setTitle("PizzaHub");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,900);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.fillRect(0,0,500,900);
        g2.setColor(Color.orange);
        g2.fillOval(xValue,yValue,wh,wh);
        g2.fillRect(100,370,260,260);
        g2.setColor(Color.black);
        g2.drawString("PIZZA",110 , 450);
        g2.drawString("HUB",110 , 530);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (xValue<=350){
            xValue+=10;
        }
        else {
            xValue+=1;
            yValue+=5;
            wh-=1;
            if (yValue>=600){
                timer.stop();
                this.dispose();
                MenuPage menuPage = new MenuPage();
            }
        }
        repaint();
    }
}
