package HeartGuide;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class RecordSaved extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordSaved frame = new RecordSaved();
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
	public RecordSaved() {
		setUndecorated(true);
		setType(Type.UTILITY);
		setTitle("Heart Guide");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSave = new JLabel("Your record is successfully added!");
		lblSave.setForeground(Color.BLACK);
		lblSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSave.setBounds(65, 21, 253, 22);
		contentPane.add(lblSave);
		
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
