package render;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	private JPanel currentFrame;

	public GameWindow(JPanel frame) {
		super("Shade Of Colorful");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		this.currentFrame = frame;
		getContentPane().add(currentFrame);
		pack();
		this.setVisible(true);
		this.currentFrame.requestFocus();
	}

	public void ChangeFrame(JPanel frame) {
		getContentPane().remove(currentFrame);
		this.currentFrame = frame;
		getContentPane().add(frame);
		getContentPane().validate();
		pack();
		currentFrame.requestFocus();
	}

	protected JPanel getCurrentFrame() {
		return currentFrame;
	}

	protected void setCurrentFrame(JPanel currentFrame) {
		this.currentFrame = currentFrame;
	}

}
