package HeartGuide;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

import com.formdev.flatlaf.FlatIntelliJLaf;

import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.SpinnerListModel;
import java.awt.Cursor;

public class SetSchedule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new FlatIntelliJLaf());
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetSchedule frame = new SetSchedule();
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
	public SetSchedule() {
		setResizable(false);
		setTitle("My Schedule");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 369, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMorning = new JLabel("MORNING");
		lblMorning.setForeground(Color.BLACK);
		lblMorning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMorning.setBounds(24, 23, 60, 17);
		contentPane.add(lblMorning);
		
		JSpinner spnrHrAM = new JSpinner();
		spnrHrAM.setBorder(new LineBorder(new Color(0, 0, 0)));
		spnrHrAM.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spnrHrAM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnrHrAM.setBounds(24, 51, 57, 24);
		contentPane.add(spnrHrAM);
		
		JLabel lblSeparateAM = new JLabel(":");
		lblSeparateAM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeparateAM.setBounds(91, 54, 5, 17);
		contentPane.add(lblSeparateAM);
		
		JSpinner spnrMinAM = new JSpinner();
		spnrMinAM.setBorder(new LineBorder(new Color(0, 0, 0)));
		spnrMinAM.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		spnrMinAM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnrMinAM.setBounds(106, 51, 57, 24);
		contentPane.add(spnrMinAM);
		
		JLabel lblAM = new JLabel("AM");
		lblAM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAM.setBounds(173, 51, 24, 23);
		contentPane.add(lblAM);
		
		JLabel lblEvening = new JLabel("EVENING");
		lblEvening.setForeground(Color.BLACK);
		lblEvening.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEvening.setBounds(24, 86, 57, 17);
		contentPane.add(lblEvening);
		
		JSpinner spnrHrPM = new JSpinner();
		spnrHrPM.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spnrHrPM.setBorder(new LineBorder(new Color(0, 0, 0)));
		spnrHrPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnrHrPM.setBounds(24, 114, 57, 24);
		contentPane.add(spnrHrPM);
		
		JLabel lblSeparatePM = new JLabel(":");
		lblSeparatePM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeparatePM.setBounds(91, 117, 5, 17);
		contentPane.add(lblSeparatePM);
		
		JSpinner spnrMinPM = new JSpinner();
		spnrMinPM.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		spnrMinPM.setBorder(new LineBorder(new Color(0, 0, 0)));
		spnrMinPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnrMinPM.setBounds(106, 114, 57, 24);
		contentPane.add(spnrMinPM);
		
		JLabel lblPM = new JLabel("PM");
		lblPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPM.setBounds(173, 114, 24, 23);
		contentPane.add(lblPM);
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSaveChanges.setForeground(Color.WHITE);
		btnSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaveChanges.setFocusPainted(false);
		btnSaveChanges.setBorder(null);
		btnSaveChanges.setBackground(new Color(210, 104, 110));
		btnSaveChanges.setBounds(170, 196, 127, 26);
		contentPane.add(btnSaveChanges);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setFocusPainted(false);
		btnCancel.setBorder(null);
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(53, 196, 106, 26);
		contentPane.add(btnCancel);
		
		JCheckBox chkNotify = new JCheckBox("Notify me during my schedule");
		chkNotify.setRequestFocusEnabled(false);
		chkNotify.setOpaque(false);
		chkNotify.setForeground(Color.BLACK);
		chkNotify.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chkNotify.setFocusPainted(false);
		chkNotify.setBorderPaintedFlat(true);
		chkNotify.setBorder(new LineBorder(new Color(0, 0, 0)));
		chkNotify.setBounds(24, 152, 210, 23);
		contentPane.add(chkNotify);
		
		this.setLocationRelativeTo(null);
	}
}
