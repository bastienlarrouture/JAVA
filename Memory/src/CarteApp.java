import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CarteApp extends FrameForDemoMaker {

	private ImageIcon dosCarte = ResourceUtility.loadImage("images/dos.png");

	private Jeu jeu;

	public CarteApp() throws IOException{
		super("Mémoire");
		setDefaultBounds(100,100,900,600);
		jeu = new Jeu();
	}

	@Override
	public void init(JFrame frame) {
		Container cp = frame.getContentPane();
		int rows = 4;
		int cols = 6;
		cp.setLayout(new GridLayout(rows, cols));


		LinkedList<ImageIcon> pioche = jeu.creerPioche();

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				cp.add(createButton());
			}
		}
	}

	public JComponent createButton() {
		JButton button = new JButton(dosCarte);
		return button;
	}

	public static void main(String[] args) throws IOException {
		CarteApp example = new CarteApp();
		SwingUtilities.invokeLater(example);
	}
}