package sample.Algorithm.BubbleSort;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import sample.Algorithm.Elements.Graph;
import sample.Algorithm.Elements.Pillar;
import sample.Algorithm.SortingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort extends SortingStrategy {
	private List<Pillar> data = new ArrayList<>();

	@Override
	public void initData(List ele) {
		for (int i = 0; i < ele.size(); i++) {
			Rectangle r = (Rectangle) ele.get(i);
			double val = new Random().nextInt(getSEED_MAX() - getSEED_MIN()) + getSEED_MIN();
			double height = val;
			r.setHeight(height);
			r.setLayoutY(getSEED_SUM() - height);
			Pillar p = new Pillar();
			p.setRec(r);
			p.setValue(val);
			data.add(p);
		}
	}

	@Override
	public void execAlgorithm(AnchorPane mainPane) {
		int n = data.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (data.get(j).getValue() > data.get(j + 1).getValue()) {
						// swap 2 pillars

				}
			}
		}
	}
}