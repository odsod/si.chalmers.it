package Pass6;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Uppgift2 extends JFrame implements MouseListener{
	
	
	public static final int SLEEP_TIME = 50;
	
	public static void main(String[] args) {
		new Uppgift2(20,20);
	}
	
	private Square[][] sq;
	
	public Uppgift2(int n, int m) {
		super();
		setLayout(new GridLayout(n,m));
		setTitle("Uppgift 2");
		sq = new Square[n][m];
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				Square square = new Square(i,j);
				
				square.setBackground(Color.WHITE);
				add(square);
				sq[i][j] = square;
				square.addMouseListener(this);
			}
		}
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		
	}
	
	public void fill(int i, int j)  {
		
		if(sq[i][j].getBackground() == Color.WHITE) {
			
			try {
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			sq[i][j].flip();
			update(getGraphics());
			if(i < sq.length-1) {
				fill(i+1,j);
			}
			if(i > 0) {
				fill(i-1,j);
			}
			if(j < sq[i].length-1) {
				fill(i,j+1);
			}
			if(j > 0) {
				fill(i,j-1);
			}

		}
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {

		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		Square square = (Square)arg0.getSource();
		
		if(arg0.getButton() == MouseEvent.BUTTON3) {	
			square.flip();
		}
		else if(arg0.getButton() == MouseEvent.BUTTON1) {
			fill(square.i,square.j);
		}
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}
class Square extends JPanel {
	
	public final int i,j;

	public Square(int i, int j) {
		super();
		this.i = i;
		this.j = j;
		setBackground(Color.WHITE);
	}
	
	public void flip() {
		if(getBackground() == Color.WHITE) {
			setBackground(Color.BLACK);
		}else {
			setBackground(Color.WHITE);
		}
	}
 
}

