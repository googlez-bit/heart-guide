package HeartGuide;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Splash extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		 
		
		this.setLocationRelativeTo(null);
	}
}
