package HeartGuide;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;
import java.awt.Dimension;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.demo.PieChartDemo1;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

public class Dashboard extends JFrame {

	private JPanel contentPane, pnlBPTrends, pnlBPComparison;
	private JTextField txtSearcher;
	private JTable tblBPBook;
	private JLabel lblTime, lblDate;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatLightLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setUndecorated(true);
		setTitle("Heart Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 597);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(210,104,110));
		pnlMenu.setBounds(0, 0, 215, 597);
		contentPane.add(pnlMenu);
		pnlMenu.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
        lblLogo.setBounds(10, 24, 195, 100);
        try {
        	BufferedImage img = ImageIO.read(this.getClass().getResource("/img/hg_logo_white.png"));
	         Image profile = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
	         lblLogo.setLayout(null);
	         lblLogo.setIcon(new ImageIcon(profile));
	         pnlMenu.add(lblLogo);
	         } catch (Exception e) {
	         System.out.println(e);
	         }
        
        JPanel pnlDashboard = new JPanel();
        pnlDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        pnlDashboard.setLayout(null);
        pnlDashboard.setBorder(new LineBorder(Color.WHITE));
        pnlDashboard.setBackground(new Color(210, 104, 110));
        pnlDashboard.setBounds(0, 143, 215, 46);
        pnlMenu.add(pnlDashboard);
        
        JLabel lblDashboard = new JLabel("DASHBOARD");
        lblDashboard.setVerticalAlignment(SwingConstants.CENTER);
        lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
        lblDashboard.setForeground(Color.WHITE);
        lblDashboard.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDashboard.setBounds(79, 0, 80, 46);
        pnlDashboard.add(lblDashboard);
        
        JLabel lblDashboardIcon = new JLabel("");
        lblDashboardIcon.setBounds(37, 11, 25, 24);
        try {
        	BufferedImage img = ImageIO.read(this.getClass().getResource("/img/dashboard.png"));
        	Image profile = img.getScaledInstance(lblDashboardIcon.getWidth(), lblDashboardIcon.getHeight(), Image.SCALE_SMOOTH);
        	lblDashboardIcon.setLayout(null);
        	lblDashboardIcon.setIcon(new ImageIcon(profile));
	        pnlDashboard.add(lblDashboardIcon);
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
		
		//My Profile
        JPanel pnlMyProfile = new JPanel();
        pnlMyProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlMyProfile.setBorder(new LineBorder(Color.WHITE));
		pnlMyProfile.setBackground(new Color(210,104,110));
		pnlMyProfile.setBounds(0, 188, 215, 46);
		pnlMenu.add(pnlMyProfile);
		pnlMyProfile.setLayout(null);
		
		JLabel lblMyProfile = new JLabel("MY PROFILE");
		lblMyProfile.setForeground(Color.WHITE);
		lblMyProfile.setVerticalAlignment(SwingConstants.CENTER);
		lblMyProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProfile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMyProfile.setBounds(79, 0, 75, 46);
		pnlMyProfile.add(lblMyProfile);
		
		JLabel lblMyProfileIcon = new JLabel("");
		lblMyProfileIcon.setBounds(37, 11, 25, 24);
		try {
	           BufferedImage img = ImageIO.read(this.getClass().getResource("/img/my_profile.png"));
	           Image profile = img.getScaledInstance(lblMyProfileIcon.getWidth(), lblMyProfileIcon.getHeight(), Image.SCALE_SMOOTH);
	           lblMyProfileIcon.setLayout(null);
	           lblMyProfileIcon.setIcon(new ImageIcon(profile));
	           pnlMyProfile.add(lblMyProfileIcon);
	           } catch (Exception e) {
	           System.out.println(e);
	           }
		
		//My Schedule
		JPanel pnlMySchedule = new JPanel();
		pnlMySchedule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlMySchedule.setAlignmentY(Component.TOP_ALIGNMENT);
		pnlMySchedule.setBorder(new LineBorder(Color.WHITE));
		pnlMySchedule.setLayout(null);
		pnlMySchedule.setBackground(new Color(210, 104, 110));
		pnlMySchedule.setBounds(0, 233, 215, 46);
		pnlMenu.add(pnlMySchedule);
		
		JLabel lblMySchedule = new JLabel("MY SCHEDULE");
		lblMySchedule.setVerticalAlignment(SwingConstants.CENTER);
		lblMySchedule.setHorizontalAlignment(SwingConstants.CENTER);
		lblMySchedule.setForeground(Color.WHITE);
		lblMySchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMySchedule.setBounds(79, 0, 90, 46);
		pnlMySchedule.add(lblMySchedule);
		
		JLabel lblMyScheduleIcon = new JLabel("");
		lblMyScheduleIcon.setBounds(35, 11, 26, 24);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/my_sched.png"));
            Image schedule = img.getScaledInstance(lblMyScheduleIcon.getWidth(), lblMyScheduleIcon.getHeight(), Image.SCALE_SMOOTH);
            lblMyScheduleIcon.setLayout(null);
            lblMyScheduleIcon.setIcon(new ImageIcon(schedule));
            pnlMySchedule.add(lblMyScheduleIcon);
            } catch (Exception e) {
            System.out.println(e);
            }
		
		//New Record
		JPanel pnlNewRecord = new JPanel();
		pnlNewRecord.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlNewRecord.setAlignmentY(Component.TOP_ALIGNMENT);
		pnlNewRecord.setBorder(new LineBorder(Color.WHITE));
		pnlNewRecord.setLayout(null);
		pnlNewRecord.setBackground(new Color(210, 104, 110));
		pnlNewRecord.setBounds(0, 278, 215, 46);
		pnlMenu.add(pnlNewRecord);
		
		JLabel lblNewRecord = new JLabel("NEW RECORD");
		lblNewRecord.setVerticalAlignment(SwingConstants.CENTER);
		lblNewRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewRecord.setForeground(Color.WHITE);
		lblNewRecord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewRecord.setBounds(78, 0, 90, 46);
		pnlNewRecord.add(lblNewRecord);
		
		JLabel lblNewRecordIcon = new JLabel("");
		lblNewRecordIcon.setBounds(35, 11, 27, 24);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/add_bp.png"));
            Image add_bp = img.getScaledInstance(lblNewRecordIcon.getWidth(), lblNewRecordIcon.getHeight(), Image.SCALE_SMOOTH);
            lblNewRecordIcon.setLayout(null);
            lblNewRecordIcon.setIcon(new ImageIcon(add_bp));
            pnlNewRecord.add(lblNewRecordIcon);
            } catch (Exception e) {
            System.out.println(e);
            }
		
		//My Records
		JPanel pnlMyRecords = new JPanel();
		pnlMyRecords.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlMyRecords.setBorder(new LineBorder(Color.WHITE));
		pnlMyRecords.setLayout(null);
		pnlMyRecords.setBackground(new Color(210, 104, 110));
		pnlMyRecords.setBounds(0, 323, 215, 46);
		pnlMenu.add(pnlMyRecords);
		
		JLabel lblMyRecords = new JLabel("MY RECORDS");
		lblMyRecords.setVerticalAlignment(SwingConstants.CENTER);
		lblMyRecords.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyRecords.setForeground(Color.WHITE);
		lblMyRecords.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMyRecords.setBounds(77, 0, 85, 46);
		pnlMyRecords.add(lblMyRecords);
		
		JLabel lblMyRecordsIcon = new JLabel("");
		lblMyRecordsIcon.setBounds(35, 11, 26, 24);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/my_records.png"));
            Image my_records = img.getScaledInstance(lblMyRecordsIcon.getWidth(), lblMyRecordsIcon.getHeight(), Image.SCALE_SMOOTH);
            lblMyRecordsIcon.setLayout(null);
            lblMyRecordsIcon.setIcon(new ImageIcon(my_records));
            pnlMyRecords.add(lblMyRecordsIcon);
            } catch (Exception e) {
            System.out.println(e);
            }
		
		//Sign Out
		JPanel pnlSignOut = new JPanel();
		pnlSignOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlSignOut.setAlignmentY(Component.TOP_ALIGNMENT);
		pnlSignOut.setBorder(new LineBorder(Color.WHITE));
		pnlSignOut.setLayout(null);
		pnlSignOut.setBackground(new Color(210, 104, 110));
		pnlSignOut.setBounds(0, 368, 215, 46);
		pnlMenu.add(pnlSignOut);
		
		JLabel lblSignOut = new JLabel("SIGN OUT");
		lblSignOut.setVerticalAlignment(SwingConstants.CENTER);
		lblSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignOut.setForeground(Color.WHITE);
		lblSignOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSignOut.setBounds(77, 0, 61, 46);
		pnlSignOut.add(lblSignOut);
		
		JLabel lblSignOutIcon = new JLabel("");
		lblSignOutIcon.setBounds(35, 11, 27, 24);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/sign_out.png"));
            Image sign_out = img.getScaledInstance(lblSignOutIcon.getWidth(), lblSignOutIcon.getHeight(), Image.SCALE_SMOOTH);
            lblSignOutIcon.setLayout(null);
            lblSignOutIcon.setIcon(new ImageIcon(sign_out));
            pnlSignOut.add(lblSignOutIcon);
            } catch (Exception e) {
            System.out.println(e);
            }
		
		//Exit
		JPanel pnlExit = new JPanel();
		pnlExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlExit.setAlignmentY(Component.TOP_ALIGNMENT);
		pnlExit.setBorder(new LineBorder(Color.WHITE));
		pnlExit.setLayout(null);
		pnlExit.setBackground(new Color(210, 104, 110));
		pnlExit.setBounds(0, 413, 215, 46);
		pnlMenu.add(pnlExit);
		
		JLabel lblExit = new JLabel("EXIT");
		lblExit.setVerticalAlignment(SwingConstants.CENTER);
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExit.setBounds(78, 0, 28, 46);
		pnlExit.add(lblExit);
		
		JLabel lblExitIcon = new JLabel("");
		lblExitIcon.setBounds(35, 11, 28, 24);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/exit.png"));
            Image exit = img.getScaledInstance(lblExitIcon.getWidth(), lblExitIcon.getHeight(), Image.SCALE_SMOOTH);
            lblExitIcon.setLayout(null);
            lblExitIcon.setIcon(new ImageIcon(exit));
            pnlExit.add(lblExitIcon);
        } catch (Exception e) {
        	System.out.println(e);
        }
        
		CardLayout typeLayout = new CardLayout();
		
        JPanel compilePnl = new JPanel();
        compilePnl.setBounds(237, 77, 663, 493);
        contentPane.add(compilePnl);
        compilePnl.setLayout(typeLayout);
        
		//Dashboard
        JPanel pnlStatistics = new JPanel();
        pnlStatistics.setBackground(Color.WHITE);
        pnlStatistics.setBounds(0, 0, 648, 493);
        compilePnl.add(pnlStatistics, "1");
        pnlStatistics.setLayout(null);
		    
        JLabel lblUsername = new JLabel("Welcome, Isabel (@thisusername)!");
        lblUsername.setBounds(0, 0, 644, 22);
        pnlStatistics.add(lblUsername);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JPanel pnlAllBP = new JPanel();
        pnlAllBP.setBounds(0, 36, 208, 118);
        pnlStatistics.add(pnlAllBP);
        pnlAllBP.setBackground(Color.WHITE);
        pnlAllBP.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlAllBP.setLayout(null);
        
        JLabel lblAvgSys = new JLabel("120/80");
        lblAvgSys.setBounds(72, 24, 119, 25);
        pnlAllBP.add(lblAvgSys);
        lblAvgSys.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        JLabel lblAllBP = new JLabel("<html>OVERALL AVERAGE <br>BLOOD PRESSURE\r\n</html>");
        lblAllBP.setHorizontalAlignment(SwingConstants.CENTER);
        lblAllBP.setVerticalAlignment(SwingConstants.CENTER);
        lblAllBP.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAllBP.setBounds(72, 55, 119, 42);
        pnlAllBP.add(lblAllBP);
        
        JLabel lblOverallBPIcon = new JLabel("");
        lblOverallBPIcon.setBounds(10, 24, 52, 51);
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/overall_bp.png"));
            Image overall = img.getScaledInstance(lblOverallBPIcon.getWidth(), lblOverallBPIcon.getHeight(), Image.SCALE_SMOOTH);
            pnlAllBP.setLayout(null);
            lblOverallBPIcon.setIcon(new ImageIcon(overall));
            pnlAllBP.add(lblOverallBPIcon);
        } catch (Exception e) {
            System.out.println(e);
            }
        
        JPanel pnlMorningBP = new JPanel();
        pnlMorningBP.setBounds(218, 36, 208, 118);
        pnlStatistics.add(pnlMorningBP);
        pnlMorningBP.setLayout(null);
        pnlMorningBP.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlMorningBP.setBackground(Color.WHITE);
        
        JLabel lblAvgMorningBP = new JLabel("120/80");
        lblAvgMorningBP.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAvgMorningBP.setBounds(65, 24, 122, 25);
        pnlMorningBP.add(lblAvgMorningBP);
        
        JLabel lblMorningBP = new JLabel("<html>AVERAGE MORNING \r\n<br>BLOOD PRESSURE\r\n</html>");
        lblMorningBP.setVerticalAlignment(SwingConstants.CENTER);
        lblMorningBP.setHorizontalAlignment(SwingConstants.CENTER);
        lblMorningBP.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMorningBP.setBounds(65, 55, 122, 42);
        pnlMorningBP.add(lblMorningBP);
        
        JLabel lblMorningIcon = new JLabel("");
        lblMorningIcon.setBounds(10, 24, 52, 51);
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/morning.png"));
            Image morning = img.getScaledInstance(lblMorningIcon.getWidth(), lblMorningIcon.getHeight(), Image.SCALE_SMOOTH);
            pnlMorningBP.setLayout(null);
            lblMorningIcon.setIcon(new ImageIcon(morning));
            pnlMorningBP.add(lblMorningIcon);
        } catch (Exception e) {
            System.out.println(e);
            }
        
        JPanel pnlEveningBP = new JPanel();
        pnlEveningBP.setBounds(436, 36, 208, 118);
        pnlStatistics.add(pnlEveningBP);
        pnlEveningBP.setLayout(null);
        pnlEveningBP.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlEveningBP.setBackground(Color.WHITE);
        
        JLabel lblEveningIcon = new JLabel("");
        lblEveningIcon.setBounds(10, 24, 44, 42);
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/evening.png"));
            Image evening = img.getScaledInstance(lblEveningIcon.getWidth(), lblEveningIcon.getHeight(), Image.SCALE_SMOOTH);
            pnlEveningBP.setLayout(null);
            lblEveningIcon.setIcon(new ImageIcon(evening));
            pnlEveningBP.add(lblEveningIcon);
        } catch (Exception e) {
            System.out.println(e);
            }
        
        JLabel lblAvgEveningBP = new JLabel("120/80");
        lblAvgEveningBP.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAvgEveningBP.setBounds(65, 24, 122, 25);
        pnlEveningBP.add(lblAvgEveningBP);
        
        JLabel lblEveningBP = new JLabel("<html>AVERAGE EVENING \r\n<br>BLOOD PRESSURE\r\n</html>");
        lblEveningBP.setVerticalAlignment(SwingConstants.CENTER);
        lblEveningBP.setHorizontalAlignment(SwingConstants.CENTER);
        lblEveningBP.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEveningBP.setBounds(65, 55, 117, 42);
        pnlEveningBP.add(lblEveningBP);
        
        JPanel pnlAllPR = new JPanel();
        pnlAllPR.setBounds(0, 165, 208, 118);
        pnlStatistics.add(pnlAllPR);
        pnlAllPR.setLayout(null);
        pnlAllPR.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlAllPR.setBackground(Color.WHITE);
        
        JLabel lblAllBPM = new JLabel("75 bpm");
        lblAllBPM.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAllBPM.setBounds(72, 24, 119, 25);
        pnlAllPR.add(lblAllBPM);
        
        JLabel lblOverallPR = new JLabel("<html>OVERALL AVERAGE <br>PULSE RATE");
        lblOverallPR.setVerticalAlignment(SwingConstants.CENTER);
        lblOverallPR.setHorizontalAlignment(SwingConstants.CENTER);
        lblOverallPR.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblOverallPR.setBounds(72, 55, 119, 42);
        pnlAllPR.add(lblOverallPR);
        
        JLabel lblOverallPRIcon = new JLabel("");
        lblOverallPRIcon.setBounds(10, 24, 52, 51);
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/overall_hr.png"));
            Image overall_hr = img.getScaledInstance(lblOverallPRIcon.getWidth(), lblOverallPRIcon.getHeight(), Image.SCALE_SMOOTH);
            pnlAllPR.setLayout(null);
            lblOverallPRIcon.setIcon(new ImageIcon(overall_hr));
            pnlAllPR.add(lblOverallPRIcon);
        } catch (Exception e) {
            System.out.println(e);
            }
        
        JPanel pnlMorningPR = new JPanel();
        pnlMorningPR.setBounds(218, 165, 208, 118);
        pnlStatistics.add(pnlMorningPR);
        pnlMorningPR.setLayout(null);
        pnlMorningPR.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlMorningPR.setBackground(Color.WHITE);
        
        JLabel lblMorningBPM = new JLabel("75 bpm");
        lblMorningBPM.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMorningBPM.setBounds(69, 24, 122, 25);
        pnlMorningPR.add(lblMorningBPM);
        
        JLabel lblMorningPR = new JLabel("<html>AVERAGE MORNING <br>PULSE RATE");
        lblMorningPR.setVerticalAlignment(SwingConstants.CENTER);
        lblMorningPR.setHorizontalAlignment(SwingConstants.CENTER);
        lblMorningPR.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMorningPR.setBounds(69, 55, 122, 42);
        pnlMorningPR.add(lblMorningPR);
        
        JLabel lblMorningPRIcon = new JLabel("");
        lblMorningPRIcon.setBounds(10, 24, 52, 51);
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/morning_hr.png"));
            Image morning_hr = img.getScaledInstance(lblMorningPRIcon.getWidth(), lblMorningPRIcon.getHeight(), Image.SCALE_SMOOTH);
            pnlMorningPR.setLayout(null);
            lblMorningPRIcon.setIcon(new ImageIcon(morning_hr));
            pnlMorningPR.add(lblMorningPRIcon);
        } catch (Exception e) {
            System.out.println(e);
            }
        
        JPanel pnlEveningPR = new JPanel();
        pnlEveningPR.setBounds(436, 165, 208, 118);
        pnlStatistics.add(pnlEveningPR);
        pnlEveningPR.setLayout(null);
        pnlEveningPR.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlEveningPR.setBackground(Color.WHITE);
        
        JLabel lbllEveningBPM = new JLabel("75 bpm");
        lbllEveningBPM.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbllEveningBPM.setBounds(69, 24, 122, 25);
        pnlEveningPR.add(lbllEveningBPM);
        
        JLabel lblEveningPR = new JLabel("<html>AVERAGE EVENING <br>PULSE RATE");
        lblEveningPR.setVerticalAlignment(SwingConstants.CENTER);
        lblEveningPR.setHorizontalAlignment(SwingConstants.CENTER);
        lblEveningPR.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEveningPR.setBounds(69, 55, 117, 42);
        pnlEveningPR.add(lblEveningPR);
        
        JLabel lblEveningPRIcon = new JLabel("");
        lblEveningPRIcon.setBounds(10, 24, 49, 47);
        try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/evening_hr.png"));
            Image evening_hr = img.getScaledInstance(lblEveningPRIcon.getWidth(), lblEveningPRIcon.getHeight(), Image.SCALE_SMOOTH);
            pnlEveningPR.setLayout(null);
            lblEveningPRIcon.setIcon(new ImageIcon(evening_hr));
            pnlEveningPR.add(lblEveningPRIcon);
        } catch (Exception e) {
            System.out.println(e);
            }
        
        pnlBPTrends = new JPanel();
        pnlBPTrends.setBounds(0, 294, 320, 199);
        pnlStatistics.add(pnlBPTrends);
        pnlBPTrends.setLayout(null);
        pnlBPTrends.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlBPTrends.setBackground(Color.WHITE);
        
        pnlBPComparison = new JPanel();
        pnlBPComparison.setBounds(328, 294, 320, 199);
        pnlStatistics.add(pnlBPComparison);
        pnlBPComparison.setLayout(null);
        pnlBPComparison.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlBPComparison.setBackground(Color.WHITE);
        
        //BP Book
        JPanel pnlBPBook = new JPanel();
        pnlBPBook.setBounds(0, 0, 663, 493);
        compilePnl.add(pnlBPBook, "2");
        pnlBPBook.setBackground(Color.WHITE);
        pnlBPBook.setLayout(null);
        
        JPanel pnlPersonalDetails = new JPanel();
        pnlPersonalDetails.setBackground(Color.WHITE);
        pnlPersonalDetails.setBounds(0, 0, 632, 126);
        pnlBPBook.add(pnlPersonalDetails);
        pnlPersonalDetails.setLayout(null);
        
        JLabel lblName = new JLabel("FULLNAME");
        lblName.setBounds(0, 0, 65, 26);
        pnlPersonalDetails.add(lblName);
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblAge = new JLabel("AGE");
        lblAge.setBounds(0, 25, 65, 26);
        pnlPersonalDetails.add(lblAge);
        lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblHeight = new JLabel("HEIGHT");
        lblHeight.setBounds(0, 50, 65, 26);
        pnlPersonalDetails.add(lblHeight);
        lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblWeight = new JLabel("WEIGHT");
        lblWeight.setBounds(0, 75, 65, 26);
        pnlPersonalDetails.add(lblWeight);
        lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblAddress = new JLabel("ADDRESS");
        lblAddress.setBounds(0, 100, 65, 26);
        pnlPersonalDetails.add(lblAddress);
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblGetName = new JLabel("Fullname Of User");
        lblGetName.setBounds(87, 0, 311, 26);
        pnlPersonalDetails.add(lblGetName);
        lblGetName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblGetAge = new JLabel("57");
        lblGetAge.setBounds(87, 31, 127, 14);
        pnlPersonalDetails.add(lblGetAge);
        lblGetAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblGetHeight = new JLabel("171 cm");
        lblGetHeight.setBounds(87, 53, 127, 20);
        pnlPersonalDetails.add(lblGetHeight);
        lblGetHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblGetWeight = new JLabel("49 kg");
        lblGetWeight.setBounds(87, 78, 65, 20);
        pnlPersonalDetails.add(lblGetWeight);
        lblGetWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JLabel lblGetAddress = new JLabel("Address of user");
        lblGetAddress.setBounds(87, 101, 545, 25);
        pnlPersonalDetails.add(lblGetAddress);
        lblGetAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JPanel pnlBPBookControls = new JPanel();
        pnlBPBookControls.setBackground(Color.WHITE);
        pnlBPBookControls.setBounds(0, 147, 636, 26);
        pnlBPBook.add(pnlBPBookControls);
        pnlBPBookControls.setLayout(null);
        
        JLabel lblRetrieveFrom = new JLabel("Retrieve from");
        lblRetrieveFrom.setBounds(0, 0, 88, 26);
        pnlBPBookControls.add(lblRetrieveFrom);
        lblRetrieveFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JComboBox cmbxRetriever = new JComboBox();
        cmbxRetriever.setRequestFocusEnabled(false);
        cmbxRetriever.setOpaque(false);
        cmbxRetriever.setBounds(94, 0, 100, 26);
        pnlBPBookControls.add(cmbxRetriever);
        cmbxRetriever.setModel(new DefaultComboBoxModel(new String[] {"December"}));
        cmbxRetriever.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cmbxRetriever.setFocusable(false);
        cmbxRetriever.setBorder(new LineBorder(new Color(0, 0, 0)));
        cmbxRetriever.setBackground(Color.WHITE);
        
        JLabel lblSortBy = new JLabel("Sort by");
        lblSortBy.setBounds(204, 0, 46, 26);
        pnlBPBookControls.add(lblSortBy);
        lblSortBy.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JComboBox cmbxSorter = new JComboBox();
        cmbxSorter.setBounds(260, 0, 127, 26);
        pnlBPBookControls.add(cmbxSorter);
        cmbxSorter.setModel(new DefaultComboBoxModel(new String[] {"Date", "Schedule", "Systolic BP", "Diastolic BP", "Pulse Rate", "BP Classification"}));
        cmbxSorter.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cmbxSorter.setFocusable(false);
        cmbxSorter.setBorder(new LineBorder(new Color(0, 0, 0)));
        cmbxSorter.setBackground(Color.WHITE);
        
        JLabel lblSearch = new JLabel("Search");
        lblSearch.setBounds(397, 0, 42, 26);
        pnlBPBookControls.add(lblSearch);
        lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        txtSearcher = new JTextField();
        txtSearcher.setBounds(449, 0, 131, 26);
        pnlBPBookControls.add(txtSearcher);
        txtSearcher.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtSearcher.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        JButton btnGo = new JButton("Go");
        btnGo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGo.setBounds(590, 0, 46, 26);
        pnlBPBookControls.add(btnGo);
        btnGo.setForeground(Color.BLACK);
        btnGo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnGo.setFocusPainted(false);
        btnGo.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnGo.setBackground(Color.WHITE);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
        scrollPane.setBounds(0, 196, 636, 250);
        pnlBPBook.add(scrollPane);
        
        tblBPBook = new JTable();
        tblBPBook.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tblBPBook.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
        tblBPBook.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblBPBook.setSelectionBackground(Color.LIGHT_GRAY);
        scrollPane.setViewportView(tblBPBook);
        tblBPBook.setGridColor(Color.BLACK);
        tblBPBook.setRowHeight(22);
        tblBPBook.setRequestFocusEnabled(false);
        tblBPBook.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblBPBook.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"hihi", "hihi", null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        	},
        	new String[] {
        		"Date", "Schedule", "Systolic BP", "Diastolic BP", "Pulse Rate", "BP Classification"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		String.class, String.class, Integer.class, Integer.class, Integer.class, String.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        
        JButton btnEditRecord = new JButton("Edit Record");
        btnEditRecord.setForeground(Color.BLACK);
        btnEditRecord.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEditRecord.setFocusPainted(false);
        btnEditRecord.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnEditRecord.setBackground(Color.WHITE);
        btnEditRecord.setBounds(253, 456, 105, 26);
        pnlBPBook.add(btnEditRecord);
        tblBPBook.getColumnModel().getColumn(0).setPreferredWidth(68);
        tblBPBook.getColumnModel().getColumn(5).setPreferredWidth(93);
        
        
        lblTime = new JLabel("Time: 8:00 PM");
        lblTime.setBounds(717, 47, 121, 22);
        contentPane.add(lblTime);
        lblTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        lblDate = new JLabel("Date: December 31, 2022");
        lblDate.setBounds(717, 26, 168, 22);
        contentPane.add(lblDate);
        lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        //Event listeners
        pnlDashboard.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		typeLayout.show(compilePnl, "1");
        	}
        });
        
        pnlMyRecords.addMouseListener(new MouseAdapter() {  
			public void mouseClicked(MouseEvent ae){ 
				typeLayout.show(compilePnl, "2");
				}  
			});
        
        pnlMyProfile.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		MyProfile profile = new MyProfile();
        		profile.setVisible(true);
        	}
        });
        
        
        pnlMySchedule.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		SetSchedule mysched = new SetSchedule();
        		mysched.setVisible(true);
        	}
        });
        
        pnlNewRecord.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		NewRecord addBP = new NewRecord();
        		addBP.setVisible(true);
        	}
        });
        
        pnlSignOut.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ConfirmSignOut signOut = new ConfirmSignOut();
        		signOut.setVisible(true);
        	}
        });
        
        pnlExit.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ConfirmExit exit = new ConfirmExit();
        		exit.setVisible(true);
        	}
        });
        getDateTime();
        XYDataset dataset = createDataset();
        generateLineChart(dataset);
        generateBarChart();
        this.setLocationRelativeTo(null);
        
        }
	
	private static XYDataset createDataset() {
		XYSeries series1 = new XYSeries("Systolic");
		
		series1.add(120, 1);
		series1.add(120, 2);
		series1.add(118, 3);
		series1.add(120, 4);
		series1.add(119, 5);
		series1.add(120, 6);
		series1.add(120, 7);
		
		XYSeries series2 = new XYSeries("Diatolic");
		series2.add(80, 1);
		series2.add(80, 2);
		series2.add(80, 3);
		series2.add(75, 4);
		series2.add(79, 5);
		series2.add(78, 6);
		series2.add(80, 7);
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);
		dataset.addSeries(series2);
		return dataset;
		}
	
	public void generateLineChart(XYDataset dataset)
	{
		try
		{
			JFreeChart chart = ChartFactory.createXYLineChart(
					"Line Chart Demo 2",      // chart title
					"Values",                      // x axis label
					"Weeks",                      // y axis label
					dataset,                  // data
					PlotOrientation.HORIZONTAL,
					true,                     // include legend
					false,                     // tooltips
					false                     // urls
					);
			chart.setBackgroundPaint(Color.white);
			XYPlot plot = (XYPlot) chart.getPlot();
			plot.setBackgroundPaint(Color.WHITE);
			plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
			plot.setDomainGridlinePaint(Color.WHITE);
			plot.setRangeGridlinePaint(Color.BLACK);
			XYLineAndShapeRenderer renderer= (XYLineAndShapeRenderer) plot.getRenderer();
			renderer.setShapesVisible(true);
			renderer.setShapesFilled(true);
			NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
			rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
			
			
			ChartPanel chartPanel = new ChartPanel(chart, true);
			pnlBPTrends.setLayout(new java.awt.BorderLayout());
			pnlBPTrends.add(chartPanel);
			pnlBPTrends.validate();
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void getDateTime()
	{
		Timer timer = new Timer("Display Timer");

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
            	//display time every second
                DateFormat timeFormat = new SimpleDateFormat("hh:mm");
                Calendar cali = Calendar.getInstance();
                cali.getTime();
                String time = timeFormat.format(cali.getTimeInMillis());
                lblTime.setText("Time: " + time);
                
              //display date every second
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM, dd yyyy"); 
                LocalDateTime now = LocalDateTime.now();
                lblDate.setText("Date: " + dateFormat.format(now));
            }
        };

        timer.scheduleAtFixedRate(task, 1000, 1000); 
	}
	
	public void generateBarChart() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(20, "Normal", "N");
		dataset.addValue(5, "Low", "L");
		dataset.addValue(4, "Elevated", "E");
		dataset.addValue(4, "Hypertensive", "H");
		JFreeChart chart = ChartFactory.createBarChart(
				"",         // chart title
				"",               // domain axis label
				"",                  // range axis label
				dataset,                  // data
				PlotOrientation.VERTICAL, // orientation
				true,                     // include legend
				false,                     // tooltips
				false                     // URLs?
				);
		chart.addSubtitle(new TextTitle("COMPARISON OF YOUR BLOOD PRESSURE RECORDS THIS MONTH"));
		
		CategoryPlot catplot = chart.getCategoryPlot();
		catplot.setRangeGridlinePaint(Color.BLACK);
		catplot.setBackgroundPaint(Color.WHITE);
		
		BarRenderer renderer = (BarRenderer) catplot.getRenderer();
		renderer.setSeriesPaint(0, Color.BLUE);
		renderer.setSeriesPaint(1, Color.RED);
		renderer.setSeriesPaint(2, Color.YELLOW);
		renderer.setSeriesPaint(3, Color.CYAN);
		renderer.setOutlinePaint(Color.BLACK);
		renderer.setDrawBarOutline(true);
		
		ChartPanel chartPanel = new ChartPanel(chart, true);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		chartPanel.setBackground(Color.BLUE);
		
		pnlBPComparison.setLayout(new java.awt.BorderLayout());
		pnlBPComparison.add(chartPanel);
		pnlBPComparison.validate();
		
	}
}
