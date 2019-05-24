import java.io.IOException;

import javax.swing.ImageIcon;

public class Jeu {

	private ImageIcon[][] figures = loadImages();

	public Jeu() throws IOException {}

	public ImageIcon[][] loadImages() throws IOException {
		int rows = 4;
		int cols = 3;
		ImageIcon[][] images = ResourceUtility.splitImageIcon(
				ResourceUtility.loadBufferedImage("images/butterfly2.png")
				, rows, cols);
		int index = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				images[i][j].setDescription("c"+index++);
			}
		}
		return images;
	}

	public static void creerPioche() {

	}
}