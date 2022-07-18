package HeartGuide;

import java.awt.EventQueue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Splash extends JFrame {

	private JPanel contentPane;
	private JLabel lblTips;
	private Login showLogin = new Login();
	private int x = 0;
	private String[] tips = {"Tip: Make exercise a regular part of your life", "Tip: Keep your diet in balance", "Tip: Keep your blood pressure in check", "Tip: Work on losing weight if you need to", "Tip: Get enough regular sleep each night"};
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
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
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210,104,110));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHGLogo = new JLabel("");
		lblHGLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHGLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblHGLogo.setBounds(5, 5, 440, 290);
		lblHGLogo.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblHGLogo.setIcon(new ImageIcon(Splash.class.getResource("/img/hg_logo_white.png")));
		contentPane.add(lblHGLogo);
		
		lblTips = new JLabel("lblTips");
		lblTips.setVerticalAlignment(SwingConstants.TOP);
		lblTips.setHorizontalAlignment(SwingConstants.LEFT);
		lblTips.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTips.setForeground(Color.WHITE);
		lblTips.setBounds(35, 224, 405, 71);
		contentPane.add(lblTips);
		
		lblNewLabel = new JLabel("Please wait...");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(5, 30, 440, 19);
		contentPane.add(lblNewLabel);
		 
		startCount();
		this.setLocationRelativeTo(null);
	}
	
	public void startCount()
	{
		Random random = new Random();
		Timer timer = new Timer("Countdown");
		lblTips.setText(tips[random.nextInt(5)]);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
            	lblTips.setText(tips[random.nextInt(5)]);
            	if(x==3)
                {
            		dispose();
                	showLogin.setVisible(true);
                }
            	x++;
            }
        };
        timer.scheduleAtFixedRate(task, 0, 2000);
        
	}
}
