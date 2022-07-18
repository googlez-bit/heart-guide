package HeartGuide;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.UIManager;

public class NotificationPM extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotificationPM frame = new NotificationPM();
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
	public NotificationPM() {
		setUndecorated(true);
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEvening = new JLabel("EVENING SCHEDULE");
		lblEvening.setBounds(120, 43, 129, 17);
		lblEvening.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPMTime = new JLabel("7:00 PM");
		lblPMTime.setBounds(120, 60, 61, 17);
		lblPMTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnAdd = new JButton("Add Record");
		btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdd.setBounds(120, 127, 114, 26);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setFocusPainted(false);
		btnAdd.setBorder(null);
		btnAdd.setBackground(new Color(210, 104, 110));
		
		JButton btnClose = new JButton("Close");
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setBounds(244, 127, 86, 26);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClose.setFocusPainted(false);
		btnClose.setBorder(null);
		btnClose.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblReminder = new JLabel("Kindly take your blood pressure now and record it in the system.");
		lblReminder.setBounds(120, 88, 395, 17);
		lblReminder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setLayout(null);
		
		JPanel pnlAlarmTitle = new JPanel();
		pnlAlarmTitle.setBackground(new Color(210, 104, 110));
		pnlAlarmTitle.setBounds(0, 0, 534, 26);
		contentPane.add(pnlAlarmTitle);
		pnlAlarmTitle.setLayout(null);
		
		JLabel lblAlarmTitle = new JLabel("ALARM \u2022 now");
		lblAlarmTitle.setForeground(Color.WHITE);
		lblAlarmTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAlarmTitle.setBounds(10, 0, 89, 26);
		pnlAlarmTitle.add(lblAlarmTitle);
		contentPane.add(lblEvening);
		contentPane.add(lblPMTime);
		contentPane.add(lblReminder);
		contentPane.add(btnClose);
		contentPane.add(btnAdd);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(22, 43, 77, 73);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/bell.png"));
            Image alarm = img.getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH);
            contentPane.setLayout(null);
            lblIcon.setIcon(new ImageIcon(alarm));
            contentPane.add(lblIcon);
            } catch (Exception e) {
            System.out.println(e);
            }
		contentPane.add(lblIcon);
		
		this.setLocationRelativeTo(null);
	}
}
