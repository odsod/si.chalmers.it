
package Pass6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Semaphore;

import javax.swing.JFrame;
import javax.swing.JPanel; 

public class Uppgift2Threaded extends JFrame implements MouseListener{
	
	
	public static final int SLEEP_TIME = 50;
	
	public static void main(String[] args) {
		new Uppgift2Threaded(20,20);
	}
	
	private SquareThreaded[][] sq;
	
	public SquareThreaded[][] getSq() {
		return sq;
	}

	public Uppgift2Threaded(int n, int m) {
		super();
		setLayout(new GridLayout(n,m));
		setTitle("Uppgift 2 - Threaded");
		sq = new SquareThreaded[n][m];
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				SquareThreaded square = new SquareThreaded(i,j);
				
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
		SquareThreaded square = (SquareThreaded)arg0.getSource();
		
		if(arg0.getButton() == MouseEvent.BUTTON3) {	
			if(square.getBackground() == Color.WHITE) {
				square.setBackground(Color.BLACK);
			}else {
				square.setBackground(Color.WHITE);
			}
			
		}
		else if(arg0.getButton() == MouseEvent.BUTTON1) {
			new Worker(square.i,square.j,this).start();
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
			
	}
			
}
class Worker extends Thread {
	private int i,j;
	private Uppgift2Threaded u;
	public Worker(int i, int j, Uppgift2Threaded u) {
		super();
		this.i = i;
		this.j = j;
		this.u = u;
	}
	
	@Override
	public void run() {
		if(u.getSq()[i][j].getBackground() == Color.WHITE) {
			
			try {
				Thread.sleep(Uppgift2Threaded.SLEEP_TIME);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			u.getSq()[i][j].flip();
			u.update(u.getGraphics());
			if(i < u.getSq().length-1) {
				new Worker(i+1,j,u).start();
			}
			if(i > 0) {
				new Worker(i-1,j,u).start();
			}
			if(j < u.getSq()[i].length-1) {
				new Worker(i,j+1,u).start();
			}
			if(j > 0) {
				new Worker(i,j-1,u).start();
			}
//			u.getSq()[i][j].flip();
//			u.update(u.getGraphics());
		}
	}
	
}

class SquareThreaded extends JPanel {
	
	public final int i,j;
	Semaphore sem; 
	public SquareThreaded(int i, int j) {
		super();
		this.i = i;
		this.j = j;
		setBackground(Color.WHITE);
		sem = new Semaphore(1,true);
	}
	
	public void flip() {
			
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		if(getBackground() == Color.WHITE) {
			setBackground(Color.BLACK);
		}
		sem.release();
	}

}

