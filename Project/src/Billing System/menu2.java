package Drugstore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class menu2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu2 frame = new menu2();
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
	public menu2() {
		setTitle("Fresh Juice - Menu Drinks");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 426);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(253, 245, 230));
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(138, 110, 2, 2);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 29));
		lblNewLabel.setBounds(10, 11, 112, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_1images-removebg-preview.png"));
		lblNewLabel_1.setBounds(59, 47, 63, 88);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_avocado-blsktjb4-removebg-preview.png"));
		lblNewLabel_1_1.setBounds(155, 47, 63, 88);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_1426-4260323_beetroot-png-image-food-removebg-preview.png"));
		lblNewLabel_1_2.setBounds(269, 47, 63, 88);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_60-607823_guava-juice-png-guava-pulp-removebg-preview.png"));
		lblNewLabel_1_3.setBounds(354, 47, 63, 88);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_images_1-removebg-preview.png"));
		lblNewLabel_1_4.setBounds(453, 47, 63, 88);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_2download-removebg-preview.png"));
		lblNewLabel_1_5.setBounds(543, 47, 63, 88);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_1png-clipart-bubble-tea-smoothie-milkshake-juice-tea-tea-frozen-dessert-removebg-preview (1).png"));
		lblNewLabel_1_6.setBounds(636, 47, 63, 88);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2 = new JLabel("Apple juice");
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2.setBounds(59, 133, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Avocado juice");
		lblNewLabel_2_1.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_1.setBounds(155, 134, 71, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Beet juice");
		lblNewLabel_2_1_1.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_1_1.setBounds(269, 133, 71, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Guava juice");
		lblNewLabel_2_1_1_1.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_1_1_1.setBounds(354, 133, 71, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Kaffir lime juice");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_1_1_1_1.setBounds(445, 132, 85, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Lemon juice");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_1_1_1_2.setBounds(543, 133, 71, 14);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("Lychee juice");
		lblNewLabel_2_1_1_1_3.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_1_1_1_3.setBounds(636, 132, 71, 14);
		contentPane.add(lblNewLabel_2_1_1_1_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mango juice");
		lblNewLabel_2_2.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_2.setBounds(51, 230, 71, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Melon juice");
		lblNewLabel_2_3.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_3.setBounds(155, 229, 71, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Orange juice");
		lblNewLabel_2_4.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_4.setBounds(251, 230, 71, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Papaya juice");
		lblNewLabel_2_5.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_5.setBounds(350, 230, 71, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("mojito juice");
		lblNewLabel_2_6.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_6.setBounds(445, 229, 71, 14);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Parsley juice");
		lblNewLabel_2_7.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_7.setBounds(535, 230, 71, 14);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("Pineapple juice");
		lblNewLabel_2_8.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8.setBounds(618, 230, 91, 14);
		contentPane.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_1_7 = new JLabel("");
		lblNewLabel_1_7.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\mngo.png"));
		lblNewLabel_1_7.setBounds(51, 146, 63, 88);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("");
		lblNewLabel_1_8.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\melon-removebg-preview.png"));
		lblNewLabel_1_8.setBounds(155, 146, 63, 88);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("");
		lblNewLabel_1_9.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_orange-removebg-preview.png"));
		lblNewLabel_1_9.setBounds(251, 146, 63, 88);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("");
		lblNewLabel_1_10.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_1download_2-removebg-preview.png"));
		lblNewLabel_1_10.setBounds(350, 146, 63, 88);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("");
		lblNewLabel_1_11.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_mojito-removebg-preview.png"));
		lblNewLabel_1_11.setBounds(441, 146, 63, 88);
		contentPane.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("");
		lblNewLabel_1_12.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\parsley-removebg-preview.png"));
		lblNewLabel_1_12.setBounds(541, 146, 63, 88);
		contentPane.add(lblNewLabel_1_12);
		
		JLabel lblNewLabel_1_13 = new JLabel("");
		lblNewLabel_1_13.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_imgbin-pineapple-juice-zw5axab7qi0v8wuytj74b1clf-removebg-preview.png"));
		lblNewLabel_1_13.setBounds(624, 146, 63, 88);
		contentPane.add(lblNewLabel_1_13);
		
		JLabel lblNewLabel_1_13_1 = new JLabel("");
		lblNewLabel_1_13_1.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\lingh.png"));
		lblNewLabel_1_13_1.setBounds(85, 245, 76, 88);
		contentPane.add(lblNewLabel_1_13_1);
		
		JLabel lblNewLabel_1_13_2 = new JLabel("");
		lblNewLabel_1_13_2.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_grapes-removebg-preview.png"));
		lblNewLabel_1_13_2.setBounds(204, 245, 63, 88);
		contentPane.add(lblNewLabel_1_13_2);
		
		JLabel lblNewLabel_1_13_3 = new JLabel("");
		lblNewLabel_1_13_3.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_download_4-removebg-preview.png"));
		lblNewLabel_1_13_3.setBounds(299, 245, 63, 88);
		contentPane.add(lblNewLabel_1_13_3);
		
		JLabel lblNewLabel_1_13_4 = new JLabel("");
		lblNewLabel_1_13_4.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\rsz_honey-removebg-preview.png"));
		lblNewLabel_1_13_4.setBounds(393, 245, 63, 88);
		contentPane.add(lblNewLabel_1_13_4);
		
		JLabel lblNewLabel_1_13_5 = new JLabel("");
		lblNewLabel_1_13_5.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\C.png"));
		lblNewLabel_1_13_5.setBounds(487, 245, 63, 88);
		contentPane.add(lblNewLabel_1_13_5);
		
		JLabel lblNewLabel_1_13_6 = new JLabel("");
		lblNewLabel_1_13_6.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\KKK.png"));
		lblNewLabel_1_13_6.setBounds(582, 245, 63, 88);
		contentPane.add(lblNewLabel_1_13_6);
		
		JLabel lblNewLabel_2_8_1 = new JLabel("Lingonberry juice");
		lblNewLabel_2_8_1.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8_1.setBounds(86, 332, 108, 14);
		contentPane.add(lblNewLabel_2_8_1);
		
		JLabel lblNewLabel_2_8_2 = new JLabel("Grapes juice");
		lblNewLabel_2_8_2.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8_2.setBounds(201, 332, 71, 14);
		contentPane.add(lblNewLabel_2_8_2);
		
		JLabel lblNewLabel_2_8_3 = new JLabel("Kiwifruit juice");
		lblNewLabel_2_8_3.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8_3.setBounds(291, 332, 92, 14);
		contentPane.add(lblNewLabel_2_8_3);
		
		JLabel lblNewLabel_2_8_4 = new JLabel("Honeydew juice");
		lblNewLabel_2_8_4.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8_4.setBounds(385, 332, 87, 14);
		contentPane.add(lblNewLabel_2_8_4);
		
		JLabel lblNewLabel_2_8_5 = new JLabel("Cucumber juice");
		lblNewLabel_2_8_5.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8_5.setBounds(482, 332, 90, 14);
		contentPane.add(lblNewLabel_2_8_5);
		
		JLabel lblNewLabel_2_8_6 = new JLabel("Carrot juice\r\n");
		lblNewLabel_2_8_6.setFont(new Font("Rockwell", Font.BOLD, 9));
		lblNewLabel_2_8_6.setBounds(584, 332, 71, 14);
		contentPane.add(lblNewLabel_2_8_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\logo.png"));
		lblNewLabel_3.setBounds(10, 318, 63, 58);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Billing bill = new Billing();
				bill.setVisible(true);
			}
		});
		btnNext.setBackground(new Color(245, 222, 179));
		btnNext.setFont(new Font("Sylfaen", Font.BOLD, 11));
		btnNext.setForeground(new Color(255, 140, 0));
		btnNext.setBounds(667, 353, 76, 23);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login login = new Login();
				login.setVisible(true);
			}
		});
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setFont(new Font("Sylfaen", Font.BOLD, 11));
		btnBack.setBackground(new Color(245, 222, 179));
		btnBack.setBounds(667, 327, 76, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\freshjuice.png"));
		lblNewLabel_3_1.setBounds(279, -170, 485, 602);
		contentPane.add(lblNewLabel_3_1);
	}
}
