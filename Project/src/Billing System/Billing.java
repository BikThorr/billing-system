package Drugstore;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField txtMid;
	private JTextField txtname;
	private JTextField txtlastname;
	private JTextField txt1;
	private JTextField ans1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;
	private JTextField txt9;
	private JTextField txt10;
	private JTextField txt11;
	private JTextField txt12;
	private JTextField txt13;
	private JTextField txt14;
	private JTextField txt15;
	private JTextField txt16;
	private JTextField txt17;
	private JTextField txt18;
	private JTextField txt19;
	private JTextField txt20;
	private JTextField ans2;
	private JTextField ans3;
	private JTextField ans4;
	private JTextField ans5;
	private JTextField ans6;
	private JTextField ans7;
	private JTextField ans8;
	private JTextField ans9;
	private JTextField ans10;
	private JTextField ans11;
	private JTextField ans12;
	private JTextField ans13;
	private JTextField ans14;
	private JTextField ans15;
	private JTextField ans16;
	private JTextField ans17;
	private JTextField ans18;
	private JTextField ans19;
	private JTextField ans20;
	private JTextField txttotalcost;
	private JTextField txttax;
	private JTextField item3;
	private JTextField item2;
	private JTextField item1;
	private JTextField item4;
	private JTextField item5;
	private JTextField item6;
	private JTextField txtrname;
	private JTextField txtrlastname;
	private JTextField item7;
	private JTextField item8;
	private JTextField item9;
	private JTextField item10;
	private JTextField item11;
	private JTextField item12;
	private JTextField item13;
	private JTextField item14;
	private JTextField item15;
	private JTextField item16;
	private JTextField item17;
	private JTextField item18;
	private JTextField item19;
	private JTextField item20;
	private JTextField totalamount;
	private JTextField txtdate;
	private JTextField txttime;
	private JTextField pay;
	private JTextField change;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void Clock() {
	
	Thread clock = new Thread() {
		public void run() {
			try {
				for(;;) {
				Calendar  der = new GregorianCalendar();
				int day = der.get(Calendar.DAY_OF_MONTH);
				int month = der.get(Calendar.MONTH);
				int year = der.get(Calendar.YEAR);

				int sec = der.get(Calendar.SECOND);
				int min = der.get(Calendar.MINUTE);
				int hr = der.get(Calendar.HOUR);
				
				txtdate.setText(""+month+'/'+day+'/'+year);
				txttime.setText(""+hr+':'+min+':'+sec);
				
				sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	clock.start();
}
	/**
	 * Create the frame.
	 */
	public Billing() {
		
		setTitle("Fresh Juice - Billing System");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\logo.png"));
		setForeground(new Color(255, 140, 0));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(245, 222, 179));
		panel_5.setBounds(894, 11, 286, 565);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		item3 = new JTextField();
		item3.setEnabled(false);
		item3.setBounds(47, 203, 196, 15);
		panel_5.add(item3);
		item3.setColumns(10);
		
		item2 = new JTextField();
		item2.setEnabled(false);
		item2.setColumns(10);
		item2.setBounds(47, 185, 196, 15);
		panel_5.add(item2);
		
		item1 = new JTextField();
		item1.setEnabled(false);
		item1.setColumns(10);
		item1.setBounds(47, 166, 196, 15);
		panel_5.add(item1);
		
		item4 = new JTextField();
		item4.setEnabled(false);
		item4.setColumns(10);
		item4.setBounds(47, 221, 196, 15);
		panel_5.add(item4);
		
		item5 = new JTextField();
		item5.setEnabled(false);
		item5.setColumns(10);
		item5.setBounds(47, 239, 196, 15);
		panel_5.add(item5);
		
		item6 = new JTextField();
		item6.setEnabled(false);
		item6.setColumns(10);
		item6.setBounds(47, 257, 196, 15);
		panel_5.add(item6);
		
		txtrname = new JTextField();
		txtrname.setEnabled(false);
		txtrname.setColumns(10);
		txtrname.setBounds(98, 43, 155, 20);
		panel_5.add(txtrname);
		
		txtrlastname = new JTextField();
		txtrlastname.setEnabled(false);
		txtrlastname.setColumns(10);
		txtrlastname.setBounds(98, 74, 155, 20);
		panel_5.add(txtrlastname);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Customer' Name:");
		lblNewLabel_2_2_3_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_1.setFont(new Font("Serif", Font.BOLD, 8));
		lblNewLabel_2_2_3_1.setBounds(8, 46, 80, 14);
		panel_5.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_2_2_3_2 = new JLabel("Customer's Last Name: ");
		lblNewLabel_2_2_3_2.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_2.setFont(new Font("Serif", Font.BOLD, 8));
		lblNewLabel_2_2_3_2.setBounds(10, 77, 94, 14);
		panel_5.add(lblNewLabel_2_2_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Items");
		lblNewLabel_4_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_4_1.setFont(new Font("Onyx", Font.BOLD, 41));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(8, 84, 185, 88);
		panel_5.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_2_3_1_1 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		lblNewLabel_2_2_3_1_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_1_1.setFont(new Font("Serif", Font.BOLD, 8));
		lblNewLabel_2_2_3_1_1.setBounds(80, 122, 206, 14);
		panel_5.add(lblNewLabel_2_2_3_1_1);
		
		JLabel lblNewLabel_2_2_3_1_1_1 = new JLabel("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		lblNewLabel_2_2_3_1_1_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_1_1_1.setFont(new Font("Serif", Font.BOLD, 8));
		lblNewLabel_2_2_3_1_1_1.setBounds(0, 18, 301, 14);
		panel_5.add(lblNewLabel_2_2_3_1_1_1);
		
		item7 = new JTextField();
		item7.setEnabled(false);
		item7.setColumns(10);
		item7.setBounds(47, 275, 196, 15);
		panel_5.add(item7);
		
		item8 = new JTextField();
		item8.setEnabled(false);
		item8.setColumns(10);
		item8.setBounds(47, 293, 196, 15);
		panel_5.add(item8);
		
		item9 = new JTextField();
		item9.setEnabled(false);
		item9.setColumns(10);
		item9.setBounds(47, 311, 196, 15);
		panel_5.add(item9);
		
		item10 = new JTextField();
		item10.setEnabled(false);
		item10.setColumns(10);
		item10.setBounds(47, 329, 196, 15);
		panel_5.add(item10);
		
		item11 = new JTextField();
		item11.setEnabled(false);
		item11.setColumns(10);
		item11.setBounds(47, 347, 196, 15);
		panel_5.add(item11);
		
		item12 = new JTextField();
		item12.setEnabled(false);
		item12.setColumns(10);
		item12.setBounds(47, 365, 196, 15);
		panel_5.add(item12);
		
		item13 = new JTextField();
		item13.setEnabled(false);
		item13.setColumns(10);
		item13.setBounds(47, 383, 196, 15);
		panel_5.add(item13);
		
		item14 = new JTextField();
		item14.setEnabled(false);
		item14.setColumns(10);
		item14.setBounds(47, 401, 196, 15);
		panel_5.add(item14);
		
		item15 = new JTextField();
		item15.setEnabled(false);
		item15.setColumns(10);
		item15.setBounds(47, 419, 196, 15);
		panel_5.add(item15);
		
		item16 = new JTextField();
		item16.setEnabled(false);
		item16.setColumns(10);
		item16.setBounds(47, 437, 196, 15);
		panel_5.add(item16);
		
		item17 = new JTextField();
		item17.setEnabled(false);
		item17.setColumns(10);
		item17.setBounds(47, 455, 196, 15);
		panel_5.add(item17);
		
		item18 = new JTextField();
		item18.setEnabled(false);
		item18.setColumns(10);
		item18.setBounds(47, 473, 196, 15);
		panel_5.add(item18);
		
		item19 = new JTextField();
		item19.setEnabled(false);
		item19.setColumns(10);
		item19.setBounds(47, 491, 196, 15);
		panel_5.add(item19);
		
		item20 = new JTextField();
		item20.setEnabled(false);
		item20.setColumns(10);
		item20.setBounds(47, 510, 196, 15);
		panel_5.add(item20);
		
		JLabel lblNewLabel = new JLabel("Fresh Drinks\r\n");
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Onyx", Font.BOLD, 49));
		lblNewLabel.setBounds(39, 11, 219, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(">>>>>>>>>>>>>>> * <<<<<<<<<<<<<<<");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setBackground(new Color(240, 248, 255));
		lblNewLabel_1.setBounds(14, 81, 229, 14);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 245, 220));
		panel_3.setBounds(10, 106, 238, 470);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Customer ID");
		lblNewLabel_2_2.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(82, 58, 80, 14);
		panel_3.add(lblNewLabel_2_2);
		
		txtMid = new JTextField();
		txtMid.setBounds(63, 38, 109, 20);
		panel_3.add(txtMid);
		txtMid.setColumns(10);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("First Name");
		lblNewLabel_2_2_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_1.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_1.setBounds(90, 110, 67, 14);
		panel_3.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Last Name");
		lblNewLabel_2_2_2.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_2.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_2.setBounds(90, 162, 67, 14);
		panel_3.add(lblNewLabel_2_2_2);
		
		txtname = new JTextField();
		txtname.setEnabled(false);
		txtname.setColumns(10);
		txtname.setBounds(63, 83, 109, 20);
		panel_3.add(txtname);
		
		txtlastname = new JTextField();
		txtlastname.setEnabled(false);
		txtlastname.setColumns(10);
		txtlastname.setBounds(63, 133, 109, 20);
		panel_3.add(txtlastname);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = txtMid.getText();
				
				if (id.contains("123")) {
					txtname.setText("Aaron");
					txtlastname.setText("Balolong");
					
				}	
				else if(id.contains("456")){
					txtname.setText("Jayvie");
					txtlastname.setText("Abueg");
					
				}
				else if(id.contains("levil")){
					txtname.setText("Joshua");
					txtlastname.setText("Gargoles");
					
				}
				else if(id.contains("789")) {
					txtname.setText("Aqua");
					txtlastname.setText("Flask");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Unknown ID please try again");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 140, 0));
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 9));
		btnNewButton.setBounds(89, 200, 59, 14);
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(169, 401, 63, 58);
		panel_3.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\logo.png"));
		
		JLabel lblNewLabel_3 = new JLabel("Programmed by: Victor C. Liba");
		lblNewLabel_3.setBounds(10, 445, 177, 14);
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 140, 0));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 8));
		
		JLabel lblNewLabel_2_2_1_5 = new JLabel("Date: ");
		lblNewLabel_2_2_1_5.setBackground(new Color(245, 222, 179));
		lblNewLabel_2_2_1_5.setBounds(10, 420, 67, 14);
		panel_3.add(lblNewLabel_2_2_1_5);
		lblNewLabel_2_2_1_5.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_1_5.setFont(new Font("Serif", Font.BOLD, 11));
		
		txtdate = new JTextField();
		txtdate.setText("Clock");
		txtdate.setBackground(new Color(245, 245, 220));
		txtdate.setEnabled(false);
		txtdate.setBounds(42, 420, 106, 18);
		panel_3.add(txtdate);
		txtdate.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(262, 49, 622, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(244, 164, 96));
		panel_2.setBounds(10, 11, 602, 27);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("List of Menu");
		lblNewLabel_2_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2_1_1.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_1_1.setBounds(73, 12, 67, 14);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Price");
		lblNewLabel_2_2_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2_1_2.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_1_2.setBounds(287, 12, 43, 14);
		panel_2.add(lblNewLabel_2_2_1_2);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("Quantity");
		lblNewLabel_2_2_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2_1_3.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_1_3.setBounds(426, 12, 67, 14);
		panel_2.add(lblNewLabel_2_2_1_3);
		
		JLabel lblNewLabel_2_2_1_4 = new JLabel("Subtotal");
		lblNewLabel_2_2_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2_1_4.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_1_4.setBounds(525, 12, 67, 14);
		panel_2.add(lblNewLabel_2_2_1_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 235, 205));
		panel_4.setBounds(10, 49, 211, 373);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JCheckBox avocado = new JCheckBox("Avocado juice");
		avocado.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (avocado.isSelected()) {
					txt2.setEnabled(true);
				}
				else {
				txt2.setEnabled(false);
				}			
			}
		});
		avocado.setForeground(new Color(255, 140, 0));
		avocado.setFont(new Font("Stencil", Font.PLAIN, 9));
		avocado.setBounds(28, 25, 149, 15);
		panel_4.add(avocado);
		
		JCheckBox beet = new JCheckBox("Beet juice");
		beet.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (beet.isSelected()) {
					txt3.setEnabled(true);
				}
				else {
				txt3.setEnabled(false);
				}			
			}
		});
		beet.setForeground(new Color(255, 140, 0));
		beet.setFont(new Font("Stencil", Font.PLAIN, 9));
		beet.setBounds(28, 43, 149, 15);
		panel_4.add(beet);
		
		JCheckBox guava = new JCheckBox("Guava juice");
		guava.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (guava.isSelected()) {
					txt4.setEnabled(true);
				}
				else {
				txt4.setEnabled(false);
				}			
			}
		});
		guava.setForeground(new Color(255, 140, 0));
		guava.setFont(new Font("Stencil", Font.PLAIN, 9));
		guava.setBounds(28, 60, 149, 15);
		panel_4.add(guava);
		
		JCheckBox kaffir = new JCheckBox("Kaffir lime juice");
		kaffir.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (kaffir.isSelected()) {
					txt5.setEnabled(true);
				}
				else {
				txt5.setEnabled(false);
				}			
			}
		});
		kaffir.setForeground(new Color(255, 140, 0));
		kaffir.setFont(new Font("Stencil", Font.PLAIN, 9));
		kaffir.setBounds(28, 78, 149, 15);
		panel_4.add(kaffir);
		
		JCheckBox lemon = new JCheckBox("Lemon juice");
		lemon.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (lemon.isSelected()) {
					txt6.setEnabled(true);
				}
				else {
				txt6.setEnabled(false);
				}			
			}
		});
		lemon.setForeground(new Color(255, 140, 0));
		lemon.setFont(new Font("Stencil", Font.PLAIN, 9));
		lemon.setBounds(28, 96, 149, 15);
		panel_4.add(lemon);
		
		JCheckBox lychee = new JCheckBox("Lychee juice");
		lychee.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (lychee.isSelected()) {
					txt7.setEnabled(true);
				}
				else {
				txt7.setEnabled(false);
				}			
			}
		});
		lychee.setForeground(new Color(255, 140, 0));
		lychee.setFont(new Font("Stencil", Font.PLAIN, 9));
		lychee.setBounds(28, 114, 149, 15);
		panel_4.add(lychee);
		
		JCheckBox mango = new JCheckBox("Mango juice");
		mango.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (mango.isSelected()) {
					txt8.setEnabled(true);
				}
				else {
				txt8.setEnabled(false);
				}			
			}
		});
		mango.setForeground(new Color(255, 140, 0));
		mango.setFont(new Font("Stencil", Font.PLAIN, 9));
		mango.setBounds(28, 132, 149, 15);
		panel_4.add(mango);
		
		JCheckBox melon = new JCheckBox("Melon juice");
		melon.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (melon.isSelected()) {
					txt9.setEnabled(true);
				}
				else {
				txt9.setEnabled(false);
				}			
			}
		});
		melon.setForeground(new Color(255, 140, 0));
		melon.setFont(new Font("Stencil", Font.PLAIN, 9));
		melon.setBounds(28, 150, 149, 15);
		panel_4.add(melon);
		
		JCheckBox orange = new JCheckBox("Orange juice");
		orange.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (orange.isSelected()) {
					txt10.setEnabled(true);
				}
				else {
				txt10.setEnabled(false);
				}			
			}
		});
		orange.setForeground(new Color(255, 140, 0));
		orange.setFont(new Font("Stencil", Font.PLAIN, 9));
		orange.setBounds(28, 168, 149, 15);
		panel_4.add(orange);
		
		JCheckBox papaya = new JCheckBox("Papaya juice");
		papaya.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (papaya.isSelected()) {
					txt11.setEnabled(true);
				}
				else {
				txt11.setEnabled(false);
				}			
			}
		});
		papaya.setForeground(new Color(255, 140, 0));
		papaya.setFont(new Font("Stencil", Font.PLAIN, 9));
		papaya.setBounds(28, 186, 149, 15);
		panel_4.add(papaya);
		
		JCheckBox mojito = new JCheckBox("Mojito juice");
		mojito.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (mojito.isSelected()) {
					txt12.setEnabled(true);
				}
				else {
				txt12.setEnabled(false);
				}			
			}
		});
		mojito.setForeground(new Color(255, 140, 0));
		mojito.setFont(new Font("Stencil", Font.PLAIN, 9));
		mojito.setBounds(28, 204, 149, 15);
		panel_4.add(mojito);
		
		JCheckBox parsley = new JCheckBox("Parsley juice");
		parsley.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (parsley.isSelected()) {
					txt13.setEnabled(true);
				}
				else {
				txt13.setEnabled(false);
				}			
			}
		});
		parsley.setForeground(new Color(255, 140, 0));
		parsley.setFont(new Font("Stencil", Font.PLAIN, 9));
		parsley.setBounds(28, 222, 149, 15);
		panel_4.add(parsley);
		
		JCheckBox pineapple = new JCheckBox("Pineapple juice");
		pineapple.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (pineapple.isSelected()) {
					txt14.setEnabled(true);
				}
				else {
				txt14.setEnabled(false);
				}			
			}
		});
		pineapple.setForeground(new Color(255, 140, 0));
		pineapple.setFont(new Font("Stencil", Font.PLAIN, 9));
		pineapple.setBounds(28, 240, 149, 15);
		panel_4.add(pineapple);
		
		JCheckBox lingonberry = new JCheckBox("Lingonberry juice");
		lingonberry.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (lingonberry.isSelected()) {
					txt15.setEnabled(true);
				}
				else {
				txt15.setEnabled(false);
				}			
			}
		});
		lingonberry.setForeground(new Color(255, 140, 0));
		lingonberry.setFont(new Font("Stencil", Font.PLAIN, 9));
		lingonberry.setBounds(28, 258, 149, 15);
		panel_4.add(lingonberry);
		
		JCheckBox grape = new JCheckBox("Grapes juice");
		grape.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (grape.isSelected()) {
					txt16.setEnabled(true);
				}
				else {
				txt16.setEnabled(false);
				}			
			}
		});
		grape.setForeground(new Color(255, 140, 0));
		grape.setFont(new Font("Stencil", Font.PLAIN, 9));
		grape.setBounds(28, 276, 149, 15);
		panel_4.add(grape);
		
		JCheckBox kiwi = new JCheckBox("Kiwifruit juice");
		kiwi.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (kiwi.isSelected()) {
					txt17.setEnabled(true);
				}
				else {
				txt17.setEnabled(false);
				}			
			}
		});
		kiwi.setForeground(new Color(255, 140, 0));
		kiwi.setFont(new Font("Stencil", Font.PLAIN, 9));
		kiwi.setBounds(28, 294, 149, 15);
		panel_4.add(kiwi);
		
		JCheckBox honey = new JCheckBox("Honeydew juice");
		honey.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (honey.isSelected()) {
					txt18.setEnabled(true);
				}
				else {
				txt18.setEnabled(false);
				}			
			}
		});
		honey.setForeground(new Color(255, 140, 0));
		honey.setFont(new Font("Stencil", Font.PLAIN, 9));
		honey.setBounds(28, 312, 149, 15);
		panel_4.add(honey);
		
		JCheckBox cucumber = new JCheckBox("Cucumber juice");
		cucumber.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (cucumber.isSelected()) {
					txt19.setEnabled(true);
				}
				else {
				txt19.setEnabled(false);
				}			
			}
		});
		cucumber.setForeground(new Color(255, 140, 0));
		cucumber.setFont(new Font("Stencil", Font.PLAIN, 9));
		cucumber.setBounds(28, 330, 149, 15);
		panel_4.add(cucumber);
		
		JCheckBox carrot = new JCheckBox("Carrot juice");
		carrot.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (carrot.isSelected()) {
					txt20.setEnabled(true);
				}
				else {
				txt20.setEnabled(false);
				}			
			}
		});
		carrot.setForeground(new Color(255, 140, 0));
		carrot.setFont(new Font("Stencil", Font.PLAIN, 9));
		carrot.setBounds(28, 348, 149, 15);
		panel_4.add(carrot);
		
		JCheckBox apple = new JCheckBox("Apple Juice");
		apple.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (apple.isSelected()) {
					txt1.setEnabled(true);
				}
				else {
				txt1.setEnabled(false);
				}			
		}
		});
		apple.setBounds(28, 7, 149, 15);
		panel_4.add(apple);
		apple.setForeground(new Color(255, 140, 0));
		apple.setFont(new Font("Stencil", Font.PLAIN, 9));
		if(apple.isSelected()) {
            double ans = Integer.parseInt(txt1.getText());
            double answer =ans * 40;
            ans1.setText(Double.toString(answer));
        }
	
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(255, 235, 205));
		panel_4_1.setBounds(231, 49, 160, 373);
		panel.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane.setText("                  ₱40.00");
		textPane.setBounds(10, 6, 140, 14);
		panel_4_1.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEnabled(false);
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_1.setText("                  ₱30.00");
		textPane_1.setBounds(10, 24, 140, 14);
		panel_4_1.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEnabled(false);
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_2.setText("                  ₱25.00");
		textPane_2.setBounds(10, 42, 140, 14);
		panel_4_1.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEnabled(false);
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_3.setText("                  ₱20.00");
		textPane_3.setBounds(10, 60, 140, 14);
		panel_4_1.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEnabled(false);
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_4.setText("                  ₱35.00");
		textPane_4.setBounds(10, 78, 140, 14);
		panel_4_1.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEnabled(false);
		textPane_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_5.setText("                  ₱25.00");
		textPane_5.setBounds(10, 96, 140, 14);
		panel_4_1.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setEnabled(false);
		textPane_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_6.setText("                  ₱35.00");
		textPane_6.setBounds(10, 114, 140, 14);
		panel_4_1.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setEnabled(false);
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_7.setText("                  ₱35.00");
		textPane_7.setBounds(10, 132, 140, 14);
		panel_4_1.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setEnabled(false);
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_8.setText("                  ₱20.00");
		textPane_8.setBounds(10, 150, 140, 14);
		panel_4_1.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setEnabled(false);
		textPane_9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_9.setText("                  ₱25.00");
		textPane_9.setBounds(10, 168, 140, 14);
		panel_4_1.add(textPane_9);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setEnabled(false);
		textPane_10.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_10.setText("                  ₱35.00");
		textPane_10.setBounds(10, 186, 140, 14);
		panel_4_1.add(textPane_10);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setEnabled(false);
		textPane_11.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_11.setText("                  ₱35.00");
		textPane_11.setBounds(10, 204, 140, 14);
		panel_4_1.add(textPane_11);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setEnabled(false);
		textPane_12.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_12.setText("                  ₱25.00");
		textPane_12.setBounds(10, 222, 140, 14);
		panel_4_1.add(textPane_12);
		
		JTextPane textPane_13 = new JTextPane();
		textPane_13.setEnabled(false);
		textPane_13.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_13.setText("                  ₱40.00");
		textPane_13.setBounds(10, 240, 140, 14);
		panel_4_1.add(textPane_13);
		
		JTextPane textPane_14 = new JTextPane();
		textPane_14.setEnabled(false);
		textPane_14.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_14.setText("                  ₱40.00");
		textPane_14.setBounds(10, 258, 140, 14);
		panel_4_1.add(textPane_14);
		
		JTextPane textPane_15 = new JTextPane();
		textPane_15.setEnabled(false);
		textPane_15.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_15.setText("                  ₱25.00");
		textPane_15.setBounds(10, 276, 140, 14);
		panel_4_1.add(textPane_15);
		
		JTextPane textPane_16 = new JTextPane();
		textPane_16.setEnabled(false);
		textPane_16.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_16.setText("                  ₱40.00");
		textPane_16.setBounds(10, 294, 140, 14);
		panel_4_1.add(textPane_16);
		
		JTextPane textPane_17 = new JTextPane();
		textPane_17.setEnabled(false);
		textPane_17.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_17.setText("                  ₱25.00");
		textPane_17.setBounds(10, 312, 140, 14);
		panel_4_1.add(textPane_17);
		
		JTextPane textPane_18 = new JTextPane();
		textPane_18.setEnabled(false);
		textPane_18.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_18.setText("                  ₱25.00");
		textPane_18.setBounds(10, 330, 140, 14);
		panel_4_1.add(textPane_18);
		
		JTextPane textPane_19 = new JTextPane();
		textPane_19.setEnabled(false);
		textPane_19.setText("                  ₱22.00");
		textPane_19.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textPane_19.setBounds(10, 348, 140, 14);
		panel_4_1.add(textPane_19);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(new Color(255, 235, 205));
		panel_4_1_1.setBounds(401, 49, 211, 373);
		panel.add(panel_4_1_1);
		panel_4_1_1.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setText("0");
		txt1.setEnabled(false);
		txt1.setBounds(25, 6, 67, 14);
		panel_4_1_1.add(txt1);
		txt1.setColumns(10);
		
		ans1 = new JTextField();
		txt1.setText("0");
		ans1.setEnabled(false);
		ans1.setColumns(10);
		ans1.setBounds(122, 6, 67, 14);
		panel_4_1_1.add(ans1);
		
		txt2 = new JTextField();
		txt2.setText("0");
		txt2.setEnabled(false);
		txt2.setColumns(10);
		txt2.setBounds(25, 24, 67, 14);
		panel_4_1_1.add(txt2);
		
		txt3 = new JTextField();
		txt3.setText("0");
		txt3.setEnabled(false);
		txt3.setColumns(10);
		txt3.setBounds(25, 42, 67, 14);
		panel_4_1_1.add(txt3);
		
		txt4 = new JTextField();
		txt4.setText("0");
		txt4.setEnabled(false);
		txt4.setColumns(10);
		txt4.setBounds(25, 60, 67, 14);
		panel_4_1_1.add(txt4);
		
		txt5 = new JTextField();
		txt5.setText("0");
		txt5.setEnabled(false);
		txt5.setColumns(10);
		txt5.setBounds(25, 78, 67, 14);
		panel_4_1_1.add(txt5);
		
		txt6 = new JTextField();
		txt6.setText("0");
		txt6.setEnabled(false);
		txt6.setColumns(10);
		txt6.setBounds(25, 96, 67, 14);
		panel_4_1_1.add(txt6);
		
		txt7 = new JTextField();
		txt7.setText("0");
		txt7.setEnabled(false);
		txt7.setColumns(10);
		txt7.setBounds(25, 114, 67, 14);
		panel_4_1_1.add(txt7);
		
		txt8 = new JTextField();
		txt8.setText("0");
		txt8.setEnabled(false);
		txt8.setColumns(10);
		txt8.setBounds(25, 132, 67, 14);
		panel_4_1_1.add(txt8);
		
		txt9 = new JTextField();
		txt9.setText("0");
		txt9.setEnabled(false);
		txt9.setColumns(10);
		txt9.setBounds(25, 150, 67, 14);
		panel_4_1_1.add(txt9);
		
		txt10 = new JTextField();
		txt10.setText("0");
		txt10.setEnabled(false);
		txt10.setColumns(10);
		txt10.setBounds(25, 168, 67, 14);
		panel_4_1_1.add(txt10);
		
		txt11 = new JTextField();
		txt11.setText("0");
		txt11.setEnabled(false);
		txt11.setColumns(10);
		txt11.setBounds(25, 186, 67, 14);
		panel_4_1_1.add(txt11);
		
		txt12 = new JTextField();
		txt12.setText("0");
		txt12.setEnabled(false);
		txt12.setColumns(10);
		txt12.setBounds(25, 204, 67, 14);
		panel_4_1_1.add(txt12);
		
		txt13 = new JTextField();
		txt13.setText("0");
		txt13.setEnabled(false);
		txt13.setColumns(10);
		txt13.setBounds(25, 222, 67, 14);
		panel_4_1_1.add(txt13);
		
		txt14 = new JTextField();
		txt14.setText("0");
		txt14.setEnabled(false);
		txt14.setColumns(10);
		txt14.setBounds(25, 240, 67, 14);
		panel_4_1_1.add(txt14);
		
		txt15 = new JTextField();
		txt15.setText("0");
		txt15.setEnabled(false);
		txt15.setColumns(10);
		txt15.setBounds(25, 258, 67, 14);
		panel_4_1_1.add(txt15);
		
		txt16 = new JTextField();
		txt16.setText("0");
		txt16.setEnabled(false);
		txt16.setColumns(10);
		txt16.setBounds(25, 276, 67, 14);
		panel_4_1_1.add(txt16);
		
		txt17 = new JTextField();
		txt17.setText("0");
		txt17.setEnabled(false);
		txt17.setColumns(10);
		txt17.setBounds(25, 294, 67, 14);
		panel_4_1_1.add(txt17);
		
		txt18 = new JTextField();
		txt18.setText("0");
		txt18.setEnabled(false);
		txt18.setColumns(10);
		txt18.setBounds(25, 312, 67, 14);
		panel_4_1_1.add(txt18);
		
		txt19 = new JTextField();
		txt19.setText("0");
		txt19.setEnabled(false);
		txt19.setColumns(10);
		txt19.setBounds(25, 330, 67, 14);
		panel_4_1_1.add(txt19);
		
		txt20 = new JTextField();
		txt20.setText("0");
		txt20.setEnabled(false);
		txt20.setColumns(10);
		txt20.setBounds(25, 348, 67, 14);
		panel_4_1_1.add(txt20);
		
		ans2 = new JTextField();
		ans2.setEnabled(false);
		ans2.setColumns(10);
		ans2.setBounds(122, 24, 67, 14);
		panel_4_1_1.add(ans2);
		
		ans3 = new JTextField();
		ans3.setEnabled(false);
		ans3.setColumns(10);
		ans3.setBounds(122, 42, 67, 14);
		panel_4_1_1.add(ans3);
		
		ans4 = new JTextField();
		ans4.setEnabled(false);
		ans4.setColumns(10);
		ans4.setBounds(122, 60, 67, 14);
		panel_4_1_1.add(ans4);
		
		ans5 = new JTextField();
		ans5.setEnabled(false);
		ans5.setColumns(10);
		ans5.setBounds(122, 78, 67, 14);
		panel_4_1_1.add(ans5);
		
		ans6 = new JTextField();
		ans6.setEnabled(false);
		ans6.setColumns(10);
		ans6.setBounds(122, 96, 67, 14);
		panel_4_1_1.add(ans6);
		
		ans7 = new JTextField();
		ans7.setEnabled(false);
		ans7.setColumns(10);
		ans7.setBounds(122, 114, 67, 14);
		panel_4_1_1.add(ans7);
		
		ans8 = new JTextField();
		ans8.setEnabled(false);
		ans8.setColumns(10);
		ans8.setBounds(122, 132, 67, 14);
		panel_4_1_1.add(ans8);
		
		ans9 = new JTextField();
		ans9.setEnabled(false);
		ans9.setColumns(10);
		ans9.setBounds(122, 150, 67, 14);
		panel_4_1_1.add(ans9);
		
		ans10 = new JTextField();
		ans10.setEnabled(false);
		ans10.setColumns(10);
		ans10.setBounds(122, 168, 67, 14);
		panel_4_1_1.add(ans10);
		
		ans11 = new JTextField();
		ans11.setEnabled(false);
		ans11.setColumns(10);
		ans11.setBounds(122, 186, 67, 14);
		panel_4_1_1.add(ans11);
		
		ans12 = new JTextField();
		ans12.setEnabled(false);
		ans12.setColumns(10);
		ans12.setBounds(122, 204, 67, 14);
		panel_4_1_1.add(ans12);
		
		ans13 = new JTextField();
		ans13.setEnabled(false);
		ans13.setColumns(10);
		ans13.setBounds(122, 222, 67, 14);
		panel_4_1_1.add(ans13);
		
		ans14 = new JTextField();
		ans14.setEnabled(false);
		ans14.setColumns(10);
		ans14.setBounds(122, 240, 67, 14);
		panel_4_1_1.add(ans14);
		
		ans15 = new JTextField();
		ans15.setEnabled(false);
		ans15.setColumns(10);
		ans15.setBounds(122, 258, 67, 14);
		panel_4_1_1.add(ans15);
		
		ans16 = new JTextField();
		ans16.setEnabled(false);
		ans16.setColumns(10);
		ans16.setBounds(122, 276, 67, 14);
		panel_4_1_1.add(ans16);
		
		ans17 = new JTextField();
		ans17.setEnabled(false);
		ans17.setColumns(10);
		ans17.setBounds(122, 294, 67, 14);
		panel_4_1_1.add(ans17);
		
		ans18 = new JTextField();
		ans18.setEnabled(false);
		ans18.setColumns(10);
		ans18.setBounds(122, 312, 67, 14);
		panel_4_1_1.add(ans18);
		
		ans19 = new JTextField();
		ans19.setEnabled(false);
		ans19.setColumns(10);
		ans19.setBounds(122, 330, 67, 14);
		panel_4_1_1.add(ans19);
		
		ans20 = new JTextField();
		ans20.setEnabled(false);
		ans20.setColumns(10);
		ans20.setBounds(122, 348, 67, 14);
		panel_4_1_1.add(ans20);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double totalcost = 0;
				double totaltax = 0;
				double ans = 0;
				double totalA;
			
				
				 ans = Integer.parseInt(txt1.getText());
	            double answer1 =ans * 40;	            
	            ans1.setText(Double.toString(answer1));
				
	             ans = Integer.parseInt(txt2.getText());
	            double answer2 =ans * 30;	            
	            ans2.setText(Double.toString(answer2));
				
	             ans = Integer.parseInt(txt3.getText());
	            double answer3 =ans * 25;	           
	            ans3.setText(Double.toString(answer3));
				
	             ans = Integer.parseInt(txt4.getText());
	            double answer4 = ans *20; 
	            ans4.setText(Double.toString(answer4));
	            
	             ans = Integer.parseInt(txt5.getText());
	            double answer5 =ans * 35;	            
	            ans5.setText(Double.toString(answer5));
	            
	             ans = Integer.parseInt(txt6.getText());
	            double answer6 =ans * 25;	          
	            ans6.setText(Double.toString(answer6));
				
	             ans = Integer.parseInt(txt7.getText());
	            double answer7 =ans * 35;	          
	            ans7.setText(Double.toString(answer7));
	            
	             ans = Integer.parseInt(txt8.getText());
	            double answer8 =ans * 35;          
	            ans8.setText(Double.toString(answer8));
	            
	             ans =Integer.parseInt(txt9.getText());
	            double answer9 =ans * 20;
	            ans9.setText(Double.toString(answer9));
	            
	             ans = Integer.parseInt(txt10.getText());
	            double answer10 =ans * 25;
	            ans10.setText(Double.toString(answer10));
	            
	             ans = Integer.parseInt(txt11.getText());
	            double answer11 =ans * 35;
	            ans11.setText(Double.toString(answer11));
	            
	             ans = Integer.parseInt(txt12.getText());
	            double answer12 =ans * 35; 
	            ans12.setText(Double.toString(answer12));
	            
	             ans = Integer.parseInt(txt13.getText());
	            double answer13 =ans * 25;
	            ans13.setText(Double.toString(answer13));
	            
	             ans = Integer.parseInt(txt14.getText());
	            double answer14 =ans *40; 
	            ans14.setText(Double.toString(answer14));
	            
	             ans = Integer.parseInt(txt15.getText());
	            double answer15 =ans * 40;
	            ans15.setText(Double.toString(answer15));
	            
	             ans = Integer.parseInt(txt16.getText());
	            double answer16 =ans * 25;	            
	            ans16.setText(Double.toString(answer16));
	            
	             ans = Integer.parseInt(txt17.getText());
	            double answer17 =ans * 40;	            
	            ans17.setText(Double.toString(answer17));
	            
	             ans = Integer.parseInt(txt18.getText());
	            double answer18 =ans * 25;	           
	            ans18.setText(Double.toString(answer18));
	            
	             ans = Integer.parseInt(txt19.getText());
	            double answer19 =ans * 25;	           
	            ans19.setText(Double.toString(answer19));
	            
	             ans = Integer.parseInt(txt20.getText());
	            double answer20 =ans * 22;
	            ans20.setText(Double.toString(answer20));
	            
	          totalcost = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7 + answer8 + answer9 + answer10 
	    				+ answer11 + answer12 + answer13 + answer14 + answer15 + answer16 + answer17 + answer18 + answer19 + answer20;
	            
	            totaltax = totalcost * 0.12;
				 txttotalcost.setText(Double.toString(totalcost));
				 txttax.setText(Double.toString(totaltax));
				 
				 totalA = totalcost +totaltax;
				 totalamount.setText(Double.toString(totalA));
				 
	            
	            
			}
		});
		btnCompute.setForeground(new Color(255, 140, 0));
		btnCompute.setFont(new Font("Sylfaen", Font.BOLD, 9));
		btnCompute.setBackground(new Color(240, 255, 255));
		btnCompute.setBounds(275, 428, 74, 20);
		panel.add(btnCompute);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 222, 179));
		panel_1.setBounds(262, 516, 622, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Total Cost:");
		lblNewLabel_2_2_3.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_3.setBounds(10, 13, 80, 14);
		panel_1.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("Tax:");
		lblNewLabel_2_2_4.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_4.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_4.setBounds(45, 35, 45, 14);
		panel_1.add(lblNewLabel_2_2_4);
		
		txttotalcost = new JTextField();
		txttotalcost.setEnabled(false);
		txttotalcost.setColumns(10);
		txttotalcost.setBounds(75, 11, 108, 20);
		panel_1.add(txttotalcost);
		
		change = new JTextField();
		change.setEnabled(false);
		change.setColumns(10);
		change.setBounds(10, 536, 108, 20);
		panel_5.add(change);
		
		txttax = new JTextField();
		txttax.setEnabled(false);
		txttax.setColumns(10);
		txttax.setBounds(75, 33, 108, 20);
		panel_1.add(txttax);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double totalcost = 0;
				double totaltax = 0;
				double ans = 0;
				double totalA;
				
				String id = txtMid.getText();
				if (id.contains("123")) {
					txtrname.setText("Aaron");
					txtrlastname.setText("Balolong");			
				}	
				else if(id.contains("456")){
					txtrname.setText("Jayvie");
					txtrlastname.setText("Abueg");		
				}
				else if(id.contains("levil")){
					txtrname.setText("Joshua");
					txtrlastname.setText("Gargoles");
				}
				else if(id.contains("789")) {
					txtname.setText("Aqua");
					txtlastname.setText("Flask");
				}
			
				
				 ans = Integer.parseInt(txt1.getText());
	            double answer1 =ans * 40;	            
	            ans1.setText(Double.toString(answer1));
				
	             ans = Integer.parseInt(txt2.getText());
	            double answer2 =ans * 30;	            
	            ans2.setText(Double.toString(answer2));
				
	             ans = Integer.parseInt(txt3.getText());
	            double answer3 =ans * 25;	           
	            ans3.setText(Double.toString(answer3));
				
	             ans = Integer.parseInt(txt4.getText());
	            double answer4 = ans *20; 
	            ans4.setText(Double.toString(answer4));
	            
	             ans = Integer.parseInt(txt5.getText());
	            double answer5 =ans * 35;	            
	            ans5.setText(Double.toString(answer5));
	            
	             ans = Integer.parseInt(txt6.getText());
	            double answer6 =ans * 25;	          
	            ans6.setText(Double.toString(answer6));
				
	             ans = Integer.parseInt(txt7.getText());
	            double answer7 =ans * 35;	          
	            ans7.setText(Double.toString(answer7));
	            
	             ans = Integer.parseInt(txt8.getText());
	            double answer8 =ans * 35;          
	            ans8.setText(Double.toString(answer8));
	            
	             ans =Integer.parseInt(txt9.getText());
	            double answer9 =ans * 20;
	            ans9.setText(Double.toString(answer9));
	            
	             ans = Integer.parseInt(txt10.getText());
	            double answer10 =ans * 25;
	            ans10.setText(Double.toString(answer10));
	            
	             ans = Integer.parseInt(txt11.getText());
	            double answer11 =ans * 35;
	            ans11.setText(Double.toString(answer11));
	            
	             ans = Integer.parseInt(txt12.getText());
	            double answer12 =ans * 35; 
	            ans12.setText(Double.toString(answer12));
	            
	             ans = Integer.parseInt(txt13.getText());
	            double answer13 =ans * 25;
	            ans13.setText(Double.toString(answer13));
	            
	             ans = Integer.parseInt(txt14.getText());
	            double answer14 =ans *40; 
	            ans14.setText(Double.toString(answer14));
	            
	             ans = Integer.parseInt(txt15.getText());
	            double answer15 =ans * 40;
	            ans15.setText(Double.toString(answer15));
	            
	             ans = Integer.parseInt(txt16.getText());
	            double answer16 =ans * 25;	            
	            ans16.setText(Double.toString(answer16));
	            
	             ans = Integer.parseInt(txt17.getText());
	            double answer17 =ans * 40;	            
	            ans17.setText(Double.toString(answer17));
	            
	             ans = Integer.parseInt(txt18.getText());
	            double answer18 =ans * 25;	           
	            ans18.setText(Double.toString(answer18));
	            
	             ans = Integer.parseInt(txt19.getText());
	            double answer19 =ans * 25;	           
	            ans19.setText(Double.toString(answer19));
	            
	             ans = Integer.parseInt(txt20.getText());
	            double answer20 =ans * 22;
	            ans20.setText(Double.toString(answer20));
				
	            totalcost = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7 + answer8 + answer9 + answer10 
	    				+ answer11 + answer12 + answer13 + answer14 + answer15 + answer16 + answer17 + answer18 + answer19 + answer20;
	            
	            totaltax = totalcost * 0.12;
				 txttotalcost.setText(Double.toString(totalcost));
				 txttax.setText(Double.toString(totaltax));
				 
				 totalA = totalcost +totaltax;
				 totalamount.setText(Double.toString(totalA));
				
				if (apple.isSelected()){
					item1.setText(txt1.getText()+"    "+apple.getText() +" Price: ₱"+ans1.getText());	
				}
				if (avocado.isSelected()){
					item2.setText(txt2.getText()+"    "+avocado.getText() +" Price: ₱"+ans2.getText());
				}
				if (beet.isSelected()){
					item3.setText(txt3.getText()+"    "+beet.getText() +" Price: ₱"+ans3.getText());
				}
				if (guava.isSelected()){
					item4.setText(txt4.getText()+"    "+guava.getText() +" Price: ₱"+ans4.getText());
				}
				if (kaffir.isSelected()){
					item5.setText(txt5.getText()+"    "+kaffir.getText() +" Price: ₱"+ans5.getText());
				}
				if (lemon.isSelected()){
					item6.setText(txt6.getText()+"    "+lemon.getText() +" Price: ₱"+ans6.getText());
				}
				if (lychee.isSelected()){
					item7.setText(txt7.getText()+"    "+lychee.getText() +" Price: ₱"+ans7.getText());
				}
				if (mango.isSelected()){
					item8.setText(txt8.getText()+"    "+mango.getText() +" Price: ₱"+ans8.getText());
				}
				if (melon.isSelected()){
					item9.setText(txt9.getText()+"    "+melon.getText() +" Price: ₱"+ans9.getText());
				}
				if (orange.isSelected()){
					item10.setText(txt10.getText()+"    "+orange.getText() +" Price: ₱"+ans10.getText());
				}
				if (papaya.isSelected()){
					item11.setText(txt11.getText()+"    "+papaya.getText() +" Price: ₱"+ans11.getText());
				}
				if (mojito.isSelected()){
					item12.setText(txt12.getText()+"    "+mojito.getText() +" Price: ₱"+ans12.getText());
				}
				if (parsley.isSelected()){
					item13.setText(txt13.getText()+"    "+parsley.getText() +" Price: ₱"+ans13.getText());
				}
				if (pineapple.isSelected()){
					item14.setText(txt14.getText()+"    "+pineapple.getText() +" Price: ₱"+ans14.getText());
				}
				if (lingonberry.isSelected()){
					item15.setText(txt15.getText()+"    "+lingonberry.getText() +" Price: ₱"+ans15.getText());
				}
				if (grape.isSelected()){
					item16.setText(txt16.getText()+"    "+grape.getText() +" Price: ₱"+ans16.getText());
				}
				if (kiwi.isSelected()){
					item17.setText(txt17.getText()+"    "+kiwi.getText() +" Price: ₱"+ans17.getText());
				}
				if (honey.isSelected()){
					item18.setText(txt18.getText()+"    "+honey.getText() +" Price: ₱"+ans18.getText());
				}
				if (cucumber.isSelected()){
					item19.setText(txt19.getText()+"    "+cucumber.getText() +" Price: ₱"+ans19.getText());
				}
				if (carrot.isSelected()){
					item20.setText(txt20.getText()+"    "+carrot.getText() +" Price: ₱"+ans20.getText());
				}

				double rece = Double.parseDouble(pay.getText());
				double sukli = rece - totalA;
				
				change.setText(Double.toString(sukli));
				
			}
		});
		btnSubmit.setForeground(new Color(255, 140, 0));
		btnSubmit.setFont(new Font("Sylfaen", Font.BOLD, 9));
		btnSubmit.setBackground(new Color(240, 255, 255));
		btnSubmit.setBounds(275, 36, 74, 20);
		panel_1.add(btnSubmit);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				double totalcost = 0;
				double totaltax = 0;
				double ans = 0;
				double totalA;
			
				
				 ans = Integer.parseInt(txt1.getText());
	            double answer1 =ans * 40;	            
	            ans1.setText(Double.toString(answer1));
				
	             ans = Integer.parseInt(txt2.getText());
	            double answer2 =ans * 30;	            
	            ans2.setText(Double.toString(answer2));
				
	             ans = Integer.parseInt(txt3.getText());
	            double answer3 =ans * 25;	           
	            ans3.setText(Double.toString(answer3));
				
	             ans = Integer.parseInt(txt4.getText());
	            double answer4 = ans *20; 
	            ans4.setText(Double.toString(answer4));
	            
	             ans = Integer.parseInt(txt5.getText());
	            double answer5 =ans * 35;	            
	            ans5.setText(Double.toString(answer5));
	            
	             ans = Integer.parseInt(txt6.getText());
	            double answer6 =ans * 25;	          
	            ans6.setText(Double.toString(answer6));
				
	             ans = Integer.parseInt(txt7.getText());
	            double answer7 =ans * 35;	          
	            ans7.setText(Double.toString(answer7));
	            
	             ans = Integer.parseInt(txt8.getText());
	            double answer8 =ans * 35;          
	            ans8.setText(Double.toString(answer8));
	            
	             ans =Integer.parseInt(txt9.getText());
	            double answer9 =ans * 20;
	            ans9.setText(Double.toString(answer9));
	            
	             ans = Integer.parseInt(txt10.getText());
	            double answer10 =ans * 25;
	            ans10.setText(Double.toString(answer10));
	            
	             ans = Integer.parseInt(txt11.getText());
	            double answer11 =ans * 35;
	            ans11.setText(Double.toString(answer11));
	            
	             ans = Integer.parseInt(txt12.getText());
	            double answer12 =ans * 35; 
	            ans12.setText(Double.toString(answer12));
	            
	             ans = Integer.parseInt(txt13.getText());
	            double answer13 =ans * 25;
	            ans13.setText(Double.toString(answer13));
	            
	             ans = Integer.parseInt(txt14.getText());
	            double answer14 =ans *40; 
	            ans14.setText(Double.toString(answer14));
	            
	             ans = Integer.parseInt(txt15.getText());
	            double answer15 =ans * 40;
	            ans15.setText(Double.toString(answer15));
	            
	             ans = Integer.parseInt(txt16.getText());
	            double answer16 =ans * 25;	            
	            ans16.setText(Double.toString(answer16));
	            
	             ans = Integer.parseInt(txt17.getText());
	            double answer17 =ans * 40;	            
	            ans17.setText(Double.toString(answer17));
	            
	             ans = Integer.parseInt(txt18.getText());
	            double answer18 =ans * 25;	           
	            ans18.setText(Double.toString(answer18));
	            
	             ans = Integer.parseInt(txt19.getText());
	            double answer19 =ans * 25;	           
	            ans19.setText(Double.toString(answer19));
	            
	             ans = Integer.parseInt(txt20.getText());
	            double answer20 =ans * 22;
	            ans20.setText(Double.toString(answer20));
	            
	          totalcost = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7 + answer8 + answer9 + answer10 
	    				+ answer11 + answer12 + answer13 + answer14 + answer15 + answer16 + answer17 + answer18 + answer19 + answer20;
	            
	            totaltax = totalcost * 0.12;
				 txttotalcost.setText(Double.toString(totalcost));
				 txttax.setText(Double.toString(totaltax));
				 
				 totalA = totalcost +totaltax;
				 totalamount.setText(Double.toString(totalA));
				 
				String id = txtMid.getText();
				
				if (id.contains("123")) {
					ImageIcon logo = new ImageIcon("logo.png.png");
					JOptionPane.showMessageDialog(null, "The total amount you bought  ₱"+totalA+"\nThank you for buying to our store\n             please come again"
							, "Fresh Drinks", JOptionPane.INFORMATION_MESSAGE,logo);
		
					
				}	
				else if(id.contains("456")){
					ImageIcon logo = new ImageIcon("logo.png.png");
					JOptionPane.showMessageDialog(null, "The total amount you bought  ₱"+totalA+"\nThank you for buying to our store\n             please come again"
							, "Fresh Drinks", JOptionPane.INFORMATION_MESSAGE,logo);
					
				}
				else if(id.contains("levil")){
					ImageIcon logo = new ImageIcon("logo.png.png");
					JOptionPane.showMessageDialog(null, "The total amount you bought  ₱"+totalA+"\nThank you for buying to our store\n             please come again"
							, "Fresh Drinks", JOptionPane.INFORMATION_MESSAGE,logo);
					
				}
				else if(id.contains("levil")) {
					ImageIcon logo = new ImageIcon("logo.png.png");
					JOptionPane.showMessageDialog(null, "The total amount you bought  ₱"+totalA+"\nThank you for buying to our store\n             please come again"
							, "Fresh Drinks", JOptionPane.INFORMATION_MESSAGE,logo);
				}
				else {
					JOptionPane.showMessageDialog(null, "Unknown ID please try again");
				}
			}
		});
		btnNewButton_1.setBackground(new Color(245, 245, 220));
		btnNewButton_1.setForeground(new Color(255, 140, 0));
		btnNewButton_1.setFont(new Font("Stencil", Font.PLAIN, 10));
		btnNewButton_1.setBounds(187, 536, 89, 23);
		panel_5.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_2_3_3_1_1 = new JLabel(": Change");
		lblNewLabel_2_2_3_3_1_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_3_1_1.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_3_3_1_1.setBounds(123, 538, 49, 14);
		panel_5.add(lblNewLabel_2_2_3_3_1_1);
		
		JLabel lblNewLabel_2_2_3_3 = new JLabel("Total Amount ");
		lblNewLabel_2_2_3_3.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_3.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_3_3.setBounds(394, 35, 80, 14);
		panel_1.add(lblNewLabel_2_2_3_3);
		
		totalamount = new JTextField();
		totalamount.setEnabled(false);
		totalamount.setColumns(10);
		totalamount.setBounds(377, 11, 108, 20);
		panel_1.add(totalamount);
		
		pay = new JTextField();
		pay.setColumns(10);
		pay.setBounds(495, 11, 109, 20);
		panel_1.add(pay);
		
		JLabel lblNewLabel_2_2_3_3_1 = new JLabel("Received");
		lblNewLabel_2_2_3_3_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_2_2_3_3_1.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel_2_2_3_3_1.setBounds(527, 36, 59, 14);
		panel_1.add(lblNewLabel_2_2_3_3_1);
		
		txttime = new JTextField();
		txttime.setText("Clock");
		txttime.setEnabled(false);
		txttime.setColumns(10);
		txttime.setBackground(new Color(245, 245, 220));
		txttime.setBounds(778, 23, 80, 18);
		contentPane.add(txttime);
		
		
		JLabel lblNewLabel_4 = new JLabel("Billing System");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setForeground(new Color(255, 140, 0));
		lblNewLabel_4.setFont(new Font("Onyx", Font.BOLD, 41));
		lblNewLabel_4.setBounds(262, -29, 622, 102);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\chrom\\OneDrive\\Pictures\\Saved Pictures\\freshjuice.png"));
		lblNewLabel_2.setBounds(503, -46, 825, 721);
		contentPane.add(lblNewLabel_2);
		
		Clock();
	}
}
