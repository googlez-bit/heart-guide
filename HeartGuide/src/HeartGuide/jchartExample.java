package HeartGuide;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class jchartExample extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jchartExample frame = new jchartExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jchartExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(107, 74, 412, 254);
		contentPane.add(panel);
		panel.setLayout(null);
		
		generate();
	}
	
	public void generate()
	{
		try
		{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(120, "", "January");
		dataset.setValue(105, "", "Febuary");
		dataset.setValue(100, "", "March");
		dataset.setValue(65, "", "April");
		dataset.setValue(60, "", "June");
		
		JFreeChart chart = ChartFactory.createLineChart("", "", "", dataset, PlotOrientation.VERTICAL, false, false, false);
		chart.addSubtitle(new TextTitle("YOUR AVERAGE WEEKLY BLOOD PRESSURE THIS MONTH"));
		CategoryPlot catplot = chart.getCategoryPlot();
		catplot.setRangeGridlinePaint(Color.BLACK);
		
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setForeground(Color.GRAY);
		chartPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		chartPanel.setBackground(Color.YELLOW);
		panel.setLayout(new java.awt.BorderLayout());
		panel.add(chartPanel);
		panel.validate();
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
