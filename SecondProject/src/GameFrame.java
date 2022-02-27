import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	ImageIcon j = new ImageIcon("snake.png");
	public GameFrame() {
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setIconImage(j.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
		// TODO Auto-generated constructor stub
	}
}
