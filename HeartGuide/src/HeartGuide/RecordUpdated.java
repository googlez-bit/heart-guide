package HeartGuide;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class RecordUpdated extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordUpdated frame = new RecordUpdated();
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
	public RecordUpdated() {
		setUndecorated(true);
		setType(Type.UTILITY);
		setTitle("Heart Guide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdate = new JLabel("Your record is successfully updated!");
		lblUpdate.setForeground(Color.BLACK);
		lblUpdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUpdate.setBounds(65, 21, 253, 22);
		contentPane.add(lblUpdate);
		
		JButton btnOK = new JButton("OK");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.BLACK);
		btnOK.setFocusPainted(false);
		btnOK.setBackground(Color.WHITE);
		btnOK.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnOK.setBounds(277, 54, 89, 23);
		contentPane.add(btnOK);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(ConfirmUpdate.class.getResource("/img/question.png")));
		lblIcon.setBounds(22, 11, 33, 39);
		contentPane.add(lblIcon);
		
		
		this.setLocationRelativeTo(null);
	}
}

