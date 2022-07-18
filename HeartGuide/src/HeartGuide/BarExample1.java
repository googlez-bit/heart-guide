package HeartGuide;
import java.awt.Color;
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class BarExample1 extends ApplicationFrame {
	public BarExample1(String title) {
		super(title);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(20, "Normal", "Column 1");
		dataset.addValue(5, "Low", "Column 2");
		dataset.addValue(4, "Elevated", "Column 3");
		dataset.addValue(4, "Hypertensive", "Column 4");
		JFreeChart chart = ChartFactory.createBarChart(
				"Bar Chart Demo",         // chart title
				"Category",               // domain axis label
				"Value",                  // range axis label
				dataset,                  // data
				PlotOrientation.VERTICAL, // orientation
				true,                     // include legend
				false,                     // tooltips?
				false                     // URLs?
				);
		
		CategoryPlot catplot = chart.getCategoryPlot();
		catplot.setRangeGridlinePaint(Color.BLACK);
		catplot.setBackgroundPaint(Color.WHITE);
		
		BarRenderer renderer = (BarRenderer) catplot.getRenderer();
		renderer.setSeriesPaint(0, Color.gray);
		renderer.setSeriesPaint(1, Color.orange);
		renderer.setDrawBarOutline(false);

		
		ChartPanel chartPanel = new ChartPanel(chart, true);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		chartPanel.setBackground(Color.BLUE);
		setContentPane(chartPanel);
		
		}
	public static void main(String[] args) {
		BarExample1 demo = new BarExample1("Bar Demo 1");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
		}
	}