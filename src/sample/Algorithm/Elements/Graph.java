package sample.Algorithm.Elements;


import java.util.List;

public abstract class Graph {
	double value;
	private double layoutX, layoutY;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getLayoutX() {
		return layoutX;
	}

	public double getLayoutY() {
		return layoutY;
	}

	public void setLayoutX(double layoutX) {
		this.layoutX = layoutX;
	}

	public void setLayoutY(double layoutY) {
		this.layoutY = layoutY;
	}
}