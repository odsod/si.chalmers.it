import java.awt.*;
import javax.swing.*;

public class LiteSwing implements ActionListener {

  private JFrame  fonstret;
  private JButton knapp1;
  private JButton knapp2;

  public LiteSwing() {
    fonstret = new JFrame();
    fonstret.setTitle("Uppgift 1");
    knapp1 = new JButton();
    knapp1.setText("Knapp 1");
    knapp1.addActionListener(this);
    knapp2 = new JButton();
    knapp2.setText("Knapp 2");
    knapp2.addActionListener(this);
    fonstret.setLayout(new GridLayout(2,1));
    fonstret.add(knapp1);
    fonstret.add(knapp2);
    fonstret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fonstret.pack();
    fonstret.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("Du tryckte pa en knapp!");
    if (e.getSource() == knapp1) {
      System.out.println("Trololol!");
    }
  }

  public static void main(String[] args) {
    new LiteSwing();
  }

}

