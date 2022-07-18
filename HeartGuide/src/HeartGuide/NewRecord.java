package HeartGuide;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class NewRecord extends JFrame {

	private JPanel contentPane;
	private JTextField txtSystolic;
	private JTextField txtDiastolic;
	private JTextField txtClassification;
	private JTextField txtPulseRate;

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
					NewRecord frame = new NewRecord();
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
	public NewRecord() {
		setType(Type.UTILITY);
		setTitle("New Record");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 460, 349);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSchedule.setBounds(30, 22, 61, 14);
		contentPane.add(lblSchedule);
		
		JComboBox cmbxSchedule = new JComboBox();
		cmbxSchedule.setFocusable(false);
		cmbxSchedule.setBackground(Color.WHITE);
		cmbxSchedule.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbxSchedule.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbxSchedule.setModel(new DefaultComboBoxModel(new String[] {"Morning", "Evening"}));
		cmbxSchedule.setBounds(30, 47, 170, 26);
		contentPane.add(cmbxSchedule);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDate.setBounds(218, 22, 36, 14);
		contentPane.add(lblDate);
		
		JDateChooser txtDate = new JDateChooser();
		txtDate.setDateFormatString("MMMMMMMM d, y");
		txtDate.setRequestFocusEnabled(false);
		txtDate.getCalendarButton().setOpaque(false);
		txtDate.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDate.getCalendarButton().setFocusPainted(false);
		txtDate.getCalendarButton().setBorder(new LineBorder(new Color(0, 0, 0)));
		txtDate.setOpaque(false);
		txtDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDate.setFocusable(false);
		txtDate.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtDate.setBounds(218, 47, 192, 26);
		contentPane.add(txtDate);
		
		JLabel lblSystolic = new JLabel("Systolic Blood Pressure");
		lblSystolic.setToolTipText("The pressure when your heart pushes blood out");
		lblSystolic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSystolic.setBounds(30, 84, 149, 26);
		contentPane.add(lblSystolic);
		
		txtSystolic = new JTextField();
		txtSystolic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSystolic.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtSystolic.setBounds(30, 121, 113, 26);
		contentPane.add(txtSystolic);
		
		JLabel lblDiastolic = new JLabel("Diastolic Blood Pressure");
		lblDiastolic.setToolTipText("The pressure when your heart rests between beats");
		lblDiastolic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDiastolic.setBounds(218, 84, 149, 26);
		contentPane.add(lblDiastolic);
		
		txtDiastolic = new JTextField();
		txtDiastolic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDiastolic.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtDiastolic.setBounds(218, 121, 113, 26);
		contentPane.add(txtDiastolic);
		
		JLabel lblSysMmhg = new JLabel("mmHg");
		lblSysMmhg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSysMmhg.setBounds(153, 121, 47, 26);
		contentPane.add(lblSysMmhg);
		
		JLabel lblDiaMmhg = new JLabel("mmHg");
		lblDiaMmhg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDiaMmhg.setBounds(341, 121, 47, 26);
		contentPane.add(lblDiaMmhg);
		
		JLabel lblPulseRate = new JLabel("Pulse Rate");
		lblPulseRate.setToolTipText("The pressure when your heart rests between beats");
		lblPulseRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPulseRate.setBounds(30, 158, 70, 26);
		contentPane.add(lblPulseRate);
		
		JLabel lblBPM = new JLabel("bpm");
		lblBPM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBPM.setBounds(153, 193, 36, 26);
		contentPane.add(lblBPM);
		
		JLabel lblClassification = new JLabel("Blood Pressure Classification");
		lblClassification.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClassification.setBounds(218, 158, 177, 26);
		contentPane.add(lblClassification);
		
		txtClassification = new JTextField();
		txtClassification.setText("Isolated Hypertension Level 1");
		txtClassification.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtClassification.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtClassification.setBounds(218, 193, 192, 26);
		contentPane.add(txtClassification);
		
		txtPulseRate = new JTextField();
		txtPulseRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPulseRate.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtPulseRate.setBounds(30, 193, 113, 26);
		contentPane.add(txtPulseRate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setFocusPainted(false);
		btnCancel.setBorder(null);
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(98, 260, 106, 26);
		contentPane.add(btnCancel);
		
		JButton btnRegister = new JButton("Save Changes");
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setFocusPainted(false);
		btnRegister.setBorder(null);
		btnRegister.setBackground(new Color(210, 104, 110));
		btnRegister.setBounds(216, 260, 129, 26);
		contentPane.add(btnRegister);
		
		
		
		this.setLocationRelativeTo(null);
	}
}
