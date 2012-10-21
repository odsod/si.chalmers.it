import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton.*;

public class Layout extends JFrame 
            implements ActionListener {

        //private static ImageIcon faceDown = new ImageIcon("./Bilder/faceDown.jpg");
        
        //private ImageIcon b1up = new ImageIcon("./Bilder/bird.jpg");
        //private ImageIcon b2up = new ImageIcon("./Bilder/beer.jpg");
        //private ImageIcon b3up = new ImageIcon("./Bilder/beer.jpg");
        //private ImageIcon b4up = new ImageIcon("./Bilder/bird.jpg");
        
        private int count = 0;
        private JButton[] flipArr = new JButton[2];
        private Timer timer = new Timer(2000, this);
        
        public Layout(){
        
        setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setTitle("TEST!");
        Container content = getContentPane();
        
        JPanel gameBoard = new JPanel();
        gameBoard.setBackground(Color.gray);
        gameBoard.setLayout(new GridLayout(4,4));
        
        JButton b1 = new JButton("First");
        b1.setActionCommand("1");
        b1.addActionListener(this);
        gameBoard.add(b1);
        
        JButton b2 = new JButton("Second");
        b2.setActionCommand("2");
        b2.addActionListener(this);
        gameBoard.add(b2);
        

        JButton b3 = new JButton("Third");
        b3.setForeground(Color.black);
        b3.setActionCommand("3");
        b3.addActionListener(this);
        gameBoard.add(b3);
        
        JButton b4 = new JButton("Fourth");
        b4.setActionCommand("4");
        b4.addActionListener(this);
        gameBoard.add(b4);
        
        JButton b5 = new JButton("Fifth");
        b5.setActionCommand("5");
        b5.addActionListener(this);
        gameBoard.add(b5);
        
        add(gameBoard);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        
        Container contPane = getContentPane();
        Object object = e.getSource();
        if(count < 2 && object instanceof JButton){
            if(object instanceof JButton) {
                JButton butt = (JButton) object;
                String actionCommand = e.getActionCommand();
                int i = Integer.parseInt(actionCommand);
                switch(i) {
                case 1:
                    //butt.setIcon(b1up);
                    //repaint();
                    break;
                case 2:
                    //butt.setIcon(b2up);
                    //repaint();
                    break;
                case 3:
                    //butt.setIcon(b3up);
                    //repaint();
                    break;
                case 4:
                    //butt.setIcon(b4up);
                    //repaint();
                    break;
                default:
                    System.out.println("Bad buttonInterface.");
                    break;
                }
                //flip(object);
            }
        } //else if(object instanceof Timer) {
          //  timer.stop();
          //  flipArr[0].setIcon(faceDown);
          //  flipArr[1].setIcon(faceDown);
          //  count = 0;
        
    }  

}