package HeartGuide;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JSeparator;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Window.Type;

public class MyProfile extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField txtMiddle;
	private JTextField textField;
	private JTextField txtAddress;
	private JTextField txtHeight;
	private JTextField txtWeight;
	private JTextField txtUsername;
	private JPasswordField txtNewPass;
	private JPasswordField txtConfirmPass;

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
					MyProfile frame = new MyProfile();
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
	public MyProfile() {
		setType(Type.UTILITY);
		setTitle("My Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/hg_logo_red.png"));
            contentPane.setLayout(null);
            } catch (Exception e) {
            System.out.println(e);
            }
        
        JLabel lblPersonal = new JLabel("PERSONAL INFORMATION");
        lblPersonal.setForeground(Color.BLACK);
        lblPersonal.setBounds(31, 24, 163, 14);
        lblPersonal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblPersonal);
        
        JLabel lblFirst = new JLabel("First Name");
        lblFirst.setBounds(31, 49, 70, 14);
        lblFirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblFirst);
        
        txtFirst = new JTextField();
        txtFirst.setBounds(31, 74, 135, 26);
        txtFirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtFirst.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtFirst);
        
        JLabel lblMiddle = new JLabel("Middle Name");
        lblMiddle.setBounds(176, 49, 76, 14);
        lblMiddle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblMiddle);
        
        txtMiddle = new JTextField();
        txtMiddle.setBounds(176, 74, 135, 26);
        txtMiddle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtMiddle.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtMiddle);
        
        JLabel lblLast = new JLabel("Last Name");
        lblLast.setBounds(321, 49, 76, 14);
        lblLast.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblLast);
        
        textField = new JTextField();
        textField.setBounds(321, 74, 135, 26);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(textField);
        
        JLabel lblBirthdate = new JLabel("Birthdate");
        lblBirthdate.setBounds(31, 111, 55, 14);
        lblBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblBirthdate);
        
        JDateChooser txtBirthdate = new JDateChooser();
        txtBirthdate.setBounds(31, 136, 215, 26);
        txtBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtBirthdate.getCalendarButton().setOpaque(false);
        txtBirthdate.setOpaque(false);
        txtBirthdate.getCalendarButton().setBorder(new LineBorder(new Color(0, 0, 0)));
        txtBirthdate.getCalendarButton().setFocusPainted(false);
        txtBirthdate.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtBirthdate.setFocusable(false);
        txtBirthdate.setBorder(new LineBorder(new Color(0, 0, 0)));
        contentPane.add(txtBirthdate);
        
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(31, 173, 55, 14);
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblAddress);
        
        txtAddress = new JTextField();
        txtAddress.setBounds(31, 198, 425, 26);
        txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtAddress.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtAddress);
        
        JLabel lblHeight = new JLabel("Height (cm)");
        lblHeight.setBounds(31, 235, 76, 17);
        lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblHeight);
        
        txtHeight = new JTextField();
        txtHeight.setBounds(31, 263, 135, 26);
        txtHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtHeight.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtHeight);
        
        JLabel lblWeight = new JLabel("Weight (kg)");
        lblWeight.setBounds(176, 235, 76, 17);
        lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblWeight);
        
        txtWeight = new JTextField();
        txtWeight.setBounds(176, 263, 135, 26);
        txtWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtWeight.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtWeight);
        
        JSeparator registerSeparator = new JSeparator();
        registerSeparator.setBounds(31, 307, 425, 2);
        registerSeparator.setForeground(Color.WHITE);
        registerSeparator.setBackground(Color.DARK_GRAY);
        contentPane.add(registerSeparator);
        
        JLabel lblAccount = new JLabel("ACCOUNT INFORMATION");
        lblAccount.setBounds(31, 320, 163, 14);
        lblAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblAccount);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(31, 345, 70, 14);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblUsername);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(31, 370, 209, 26);
        txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsername.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtUsername);
        
        JLabel lblConfirmPass = new JLabel("Confirm New Password");
        lblConfirmPass.setBounds(247, 407, 151, 14);
        lblConfirmPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblConfirmPass);
        
        txtNewPass = new JPasswordField();
        txtNewPass.setBounds(31, 432, 209, 26);
        txtNewPass.setText("Password");
        txtNewPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtNewPass.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtNewPass);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCancel.setBounds(127, 501, 106, 26);
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCancel.setFocusPainted(false);
        btnCancel.setBorder(null);
        btnCancel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(btnCancel);
        
        JButton btnRegister = new JButton("Save Changes");
        btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegister.setBounds(245, 501, 129, 26);
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnRegister.setFocusPainted(false);
        btnRegister.setBorder(null);
        btnRegister.setBackground(new Color(210, 104, 110));
        contentPane.add(btnRegister);
        
        JLabel lblNewPass = new JLabel("New Password");
        lblNewPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewPass.setBounds(31, 407, 98, 14);
        contentPane.add(lblNewPass);
        
        txtConfirmPass = new JPasswordField();
        txtConfirmPass.setText("Password");
        txtConfirmPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtConfirmPass.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        txtConfirmPass.setBounds(247, 432, 209, 26);
        contentPane.add(txtConfirmPass);
        
		
		this.setLocationRelativeTo(null);
	}
}
