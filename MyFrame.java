import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{

	Draw drawing;

	public MyFrame(){
		this.drawing = new Draw();
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
			drawing.moveUp();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){
			drawing.moveRight();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
			drawing.moveDown();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){
			drawing.moveLeft();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_SHIFT){
			drawing.attack();
			System.out.println("attack");
		}
	}

	public void keyReleased(KeyEvent e){

	}

	public void keyTyped(KeyEvent e){
		
	}

	public static void main(String args[]){
		MyFrame gameFrame = new MyFrame();
		gameFrame.setSize(1150,740);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		gameFrame.setResizable(false);
		gameFrame.getContentPane().add(gameFrame.drawing);
		gameFrame.addKeyListener(gameFrame);
		System.out.println("practical programming");
	}
}