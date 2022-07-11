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

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField txtMiddle;
	private JTextField textField;
	private JTextField txtAddress;
	private JTextField txtHeight;
	private JTextField txtWeight;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

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
					Register frame = new Register();
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
	public Register() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(174, 22, 163, 76);
		try {
            BufferedImage img = ImageIO.read(this.getClass().getResource("/img/hg_logo_red.png"));
            Image red_logo = img.getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH);
            contentPane.setLayout(null);
            lblIcon.setIcon(new ImageIcon(red_logo));
            contentPane.add(lblIcon);
            } catch (Exception e) {
            System.out.println(e);
            }
		
		JLabel lblRegister = new JLabel("CREATE A HEART GUIDE ACCOUNT");
		lblRegister.setBounds(101, 109, 282, 32);
        lblRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblRegister.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        contentPane.add(lblRegister);
        
        JLabel lblPersonal = new JLabel("PERSONAL INFORMATION");
        lblPersonal.setForeground(Color.BLACK);
        lblPersonal.setBounds(31, 152, 163, 14);
        lblPersonal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblPersonal);
        
        JLabel lblFirst = new JLabel("First Name");
        lblFirst.setBounds(31, 179, 70, 14);
        lblFirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblFirst);
        
        txtFirst = new JTextField();
        txtFirst.setBounds(31, 204, 135, 26);
        txtFirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtFirst.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtFirst);
        
        JLabel lblMiddle = new JLabel("Middle Name");
        lblMiddle.setBounds(180, 179, 76, 14);
        lblMiddle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblMiddle);
        
        txtMiddle = new JTextField();
        txtMiddle.setBounds(180, 204, 135, 26);
        txtMiddle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtMiddle.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtMiddle);
        
        JLabel lblLast = new JLabel("Last Name");
        lblLast.setBounds(327, 179, 76, 14);
        lblLast.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblLast);
        
        textField = new JTextField();
        textField.setBounds(327, 204, 135, 26);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(textField);
        
        JLabel lblBirthdate = new JLabel("Birthdate");
        lblBirthdate.setBounds(31, 241, 55, 14);
        lblBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblBirthdate);
        
        JDateChooser txtBirthdate = new JDateChooser();
        txtBirthdate.setBounds(31, 266, 215, 26);
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
        lblAddress.setBounds(31, 303, 55, 14);
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblAddress);
        
        txtAddress = new JTextField();
        txtAddress.setBounds(31, 328, 425, 26);
        txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtAddress.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtAddress);
        
        JLabel lblHeight = new JLabel("Height (cm)");
        lblHeight.setBounds(31, 365, 76, 17);
        lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblHeight);
        
        txtHeight = new JTextField();
        txtHeight.setBounds(31, 393, 135, 26);
        txtHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtHeight.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtHeight);
        
        JLabel lblWeight = new JLabel("Weight (kg)");
        lblWeight.setBounds(180, 365, 76, 17);
        lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblWeight);
        
        txtWeight = new JTextField();
        txtWeight.setBounds(180, 393, 135, 26);
        txtWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtWeight.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtWeight);
        
        JSeparator registerSeparator = new JSeparator();
        registerSeparator.setBounds(31, 430, 425, 2);
        registerSeparator.setForeground(Color.WHITE);
        registerSeparator.setBackground(Color.DARK_GRAY);
        contentPane.add(registerSeparator);
        
        JLabel lblAccount = new JLabel("ACCOUNT INFORMATION");
        lblAccount.setBounds(31, 443, 163, 14);
        lblAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblAccount);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(31, 468, 70, 14);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblUsername);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(31, 493, 209, 26);
        txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsername.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtUsername);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(245, 468, 58, 14);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(247, 493, 209, 26);
        txtPassword.setText("Password");
        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPassword.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        contentPane.add(txtPassword);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCancel.setBounds(128, 542, 106, 26);
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCancel.setFocusPainted(false);
        btnCancel.setBorder(null);
        btnCancel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(btnCancel);
        
        JButton btnRegister = new JButton("Register");
        btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegister.setBounds(245, 542, 110, 26);
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnRegister.setFocusPainted(false);
        btnRegister.setBorder(null);
        btnRegister.setBackground(new Color(210, 104, 110));
        contentPane.add(btnRegister);
        
        JLabel lblHaveHG = new JLabel("An existing user?");
        lblHaveHG.setBounds(128, 571, 97, 25);
        lblHaveHG.setForeground(Color.BLACK);
        lblHaveHG.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblHaveHG);
        
        JLabel lblCreateAccount = new JLabel("Sign in to your account!");
        lblCreateAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblCreateAccount.setBounds(231, 571, 135, 25);
        lblCreateAccount.setForeground(new Color(210, 104, 110));
        lblCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblCreateAccount);
        
		
		this.setLocationRelativeTo(null);
	}
}
