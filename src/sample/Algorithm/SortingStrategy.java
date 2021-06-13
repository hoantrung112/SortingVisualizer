package sample.Algorithm;

import javafx.scene.layout.AnchorPane;
import sample.Algorithm.Elements.Graph;

import java.util.List;

public abstract class SortingStrategy {
	private Graph graph;
	private int swapCount, cmpCount, stepCount;
	private float time;
	private final int SEED_SUM = 570;
	private final int SEED_MAX = 560;
	private final int SEED_MIN = 10;

	public abstract void initData(List ele);

	public abstract void execAlgorithm(AnchorPane mainPane);

	public int getSEED_SUM() {
		return SEED_SUM;
	}

	public int getSEED_MAX() {
		return SEED_MAX;
	}

	public int getSEED_MIN() {
		return SEED_MIN;
	}
}