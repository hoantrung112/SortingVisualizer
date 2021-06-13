package sample.Algorithm.Elements;

import javafx.scene.shape.Rectangle;

public class Pillar extends Graph {
	private Rectangle rec;
	private double width;

	public Rectangle getRec() {
		return rec;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setRec(Rectangle rec) {
		this.rec = rec;
	}
}