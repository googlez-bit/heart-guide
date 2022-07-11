package HeartGuide;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ConfirmSchedule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmSchedule frame = new ConfirmSchedule();
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
	public ConfirmSchedule() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Heart Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdd = new JLabel("Do you want to save changes on your schedule?");
		lblAdd.setForeground(Color.BLACK);
		lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdd.setBounds(65, 21, 276, 22);
		contentPane.add(lblAdd);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setFocusable(false);
		btnYes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYes.setBackground(Color.WHITE);
		btnYes.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnYes.setFocusPainted(false);
		btnYes.setBounds(65, 66, 89, 23);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setFocusable(false);
		btnNo.setFocusPainted(false);
		btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNo.setBackground(Color.WHITE);
		btnNo.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNo.setBounds(164, 66, 89, 23);
		contentPane.add(btnNo);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFocusable(false);
		btnCancel.setFocusPainted(false);
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCancel.setBounds(263, 66, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(ConfirmUpdate.class.getResource("/img/question.png")));
		lblIcon.setBounds(22, 11, 33, 39);
		contentPane.add(lblIcon);
		
		
		this.setLocationRelativeTo(null);
	}

}
