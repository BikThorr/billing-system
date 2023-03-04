package Drugstore;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField passwordpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Fresh Juice LogIn - Window");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("UserName");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(235, 257, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		txtuser = new JTextField();
		txtuser.setBounds(202, 239, 123, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(235, 309, 65, 14);
		contentPane.add(lblNewLabel_2_1);
		
		passwordpass = new JPasswordField();
		passwordpass.setBounds(202, 290, 123, 20);
		contentPane.add(passwordpass);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = txtuser.getText();
				String pass = passwordpass.getText();
				
				if(user.contains("2004") && pass.contains("mahalkita143")) {
					menu2 menu = new menu2();
					menu.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"    Wrong User/Password\n         please try again");
				}
             
			}
		});
		btnNewButton.setForeground(new Color(255, 140, 0));
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 11));
		btnNewButton.setBounds(440, 331, 70, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\fresh.png"));
		lblNewLabel_3.setBounds(46, -4, 453, 338);
		contentPane.add(lblNewLabel_3);
		
		ImageIcon juice = new ImageIcon("juice.png");
		
}
}
