package ClientSide;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

public class MenuPage extends JFrame implements ActionListener {
    int total = 30;
    JButton reset;
    JButton submit;
    JLabel totalPrice;
    JRadioButton peperoni, meatBall, fish ;
    JRadioButton olive, mushroom, pepper;
    JRadioButton normalPate, brownPate, spicedPate;
    ImageIcon img1= new ImageIcon("/home/youssef/IdeaProjects/PizzaHut/src/logo.png");
    ImageIcon img2= new ImageIcon("/home/youssef/IdeaProjects/PizzaHub/src/eye.jpeg");

    MenuPage(){
        //declaring panels
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(500,150));
        titlePanel.setLayout(new BorderLayout(30,0));

        JPanel mainPanel = new JPanel(new GridLayout(3,3,0,0));
        mainPanel.setPreferredSize(new Dimension(500,600));
        mainPanel.setBackground(Color.YELLOW);
        mainPanel.setOpaque(true);

        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(Color.BLACK);
        footerPanel.setPreferredSize(new Dimension(500,150));
        footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER,40,30));

        //group 1 buttons
        peperoni = new JRadioButton();
        peperoni.setText("PEPERONI");
        peperoni.setFocusable(false);
        peperoni.setSelected(true);
        meatBall = new JRadioButton();
        meatBall.setText("meatBall");
        meatBall.setFocusable(false);
        fish = new JRadioButton();
        fish.setText("fish");
        fish.setFocusable(false);
        ButtonGroup groupe1 = new ButtonGroup();
        groupe1.add(peperoni);
        groupe1.add(meatBall);
        groupe1.add(fish);

        //group 2 buttons
        olive = new JRadioButton();
        olive.setText("OLIVE");
        olive.setFocusable(false);
        olive.setSelected(true);
        mushroom = new JRadioButton();
        mushroom.setText("MUSHROOM");
        mushroom.setFocusable(false);
        pepper = new JRadioButton();
        pepper.setText("PEPPER");
        pepper.setFocusable(false);
        ButtonGroup groupe2 = new ButtonGroup();
        groupe2.add(olive);
        groupe2.add(mushroom);
        groupe2.add(pepper);

        //group 3 buttons
        normalPate = new JRadioButton();
        normalPate.setText("normalPate");
        normalPate.setFocusable(false);
        normalPate.setSelected(true);
        normalPate.addActionListener(this);
        normalPate.setIcon(img2);


        brownPate = new JRadioButton();
        brownPate.setText("brownPate");
        brownPate.setFocusable(false);
        brownPate.addActionListener(this);
        spicedPate = new JRadioButton();
        spicedPate.setText("spicedPate");
        spicedPate.setFocusable(false);
        spicedPate.addActionListener(this);
        ButtonGroup groupe3 = new ButtonGroup();
        groupe3.add(normalPate);
        groupe3.add(brownPate);
        groupe3.add(spicedPate);

        //declaring footers
        reset = new JButton("RESET");
        reset.setFont(new Font("",Font.BOLD,30));
        reset.setFocusable(false);
        reset.setBackground(Color.ORANGE);
        reset.setForeground(Color.BLACK);
        reset.setBorder(null);
        reset.addActionListener(this);

        totalPrice = new JLabel();
        totalPrice.setText("$30");
        totalPrice.setFont(new Font("",Font.BOLD,30));
        totalPrice.setForeground(Color.ORANGE);

        submit = new JButton("SUBMIT");
        submit.setFont(new Font("",Font.BOLD,30));
        submit.setFocusable(false);
        submit.setBackground(Color.ORANGE);
        submit.setForeground(Color.BLACK);
        submit.setBorder(null);


        //declaring and appending main title
        JLabel titleLabel= new JLabel("    CUSTOMIZE YOUR PIZZA");
        titleLabel.setFont(new Font("", Font.BOLD,30));
        titleLabel.setForeground(Color.ORANGE);
        titleLabel.setBackground(Color.BLACK);
        titleLabel.setOpaque(true);

        //appending label to title panel
        titlePanel.add(titleLabel,BorderLayout.CENTER);

        //appending radioButtons
        mainPanel.add(peperoni);
        mainPanel.add(meatBall);
        mainPanel.add(fish);
        mainPanel.add(olive);
        mainPanel.add(mushroom);
        mainPanel.add(pepper);
        mainPanel.add(normalPate);
        mainPanel.add(brownPate);
        mainPanel.add(spicedPate);

        //appending footers
        footerPanel.add(reset);
        footerPanel.add(totalPrice);
        footerPanel.add(submit);

        //appending the 3 panels
        this.add(titlePanel);
        this.add(mainPanel);
        this.add(footerPanel);

        //customizing the Frame
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,900);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setTitle("PizzaHub");
        this.setCursor(new Cursor(12)); // finger cursor
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==normalPate) total=30;
        else if (e.getSource()==brownPate) total=40;
        else total=50;
        totalPrice.setText("$"+total);
        if (e.getSource()==reset ){
            totalPrice.setText("$"+30);
            normalPate.setSelected(true);
            peperoni.setSelected(true);
            olive.setSelected(true);
        }
    }
}
