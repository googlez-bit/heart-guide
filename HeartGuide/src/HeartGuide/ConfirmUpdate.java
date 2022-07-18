package HeartGuide;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class ConfirmUpdate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmUpdate frame = new ConfirmUpdate();
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
	public ConfirmUpdate() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Heart Guide");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSave = new JLabel("Do you want to save changes in this record?");
		lblSave.setForeground(Color.BLACK);
		lblSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSave.setBounds(65, 21, 253, 22);
		contentPane.add(lblSave);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnYes.setBackground(Color.WHITE);
		btnYes.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnYes.setFocusPainted(false);
		btnYes.setBounds(65, 66, 89, 23);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNo.setBackground(Color.WHITE);
		btnNo.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNo.setBounds(164, 66, 89, 23);
		contentPane.add(btnNo);
		
		JButton btnCancel = new JButton("Cancel");
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
