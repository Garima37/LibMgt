package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.server.UID;
import java.awt.event.ActionEvent;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JTextField Name;
	private JTextField phnnum;
	private JTextField email;
	protected JLabel phnno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(26, 28, 100, 34);
		contentPane.add(lblNewLabel);
		
		uid = new JTextField();
		uid.setBounds(250, 28, 220, 34);
		contentPane.add(uid);
		uid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(26, 93, 100, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PHONE NUMBER");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(26, 166, 138, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("EMAIL-ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(26, 248, 100, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("MEMBERSHIP DURATION");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(26, 322, 220, 34);
		contentPane.add(lblNewLabel_1_3);
		
		Name = new JTextField();
		Name.setColumns(10);
		Name.setBounds(250, 93, 220, 34);
		contentPane.add(Name);
		
		phnnum = new JTextField();
		phnnum.setColumns(10);
		phnnum.setBounds(250, 166, 220, 34);
		contentPane.add(phnnum);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(250, 248, 220, 34);
		contentPane.add(email);
		
		JRadioButton member = new JRadioButton("6Month");
		member.setBounds(250, 322, 73, 23);
		contentPane.add(member);
		
		JRadioButton rdbtnYear = new JRadioButton("1 year");
		rdbtnYear.setBounds(338, 322, 73, 23);
		contentPane.add(rdbtnYear);
		
		JRadioButton rdbtnYear_1 = new JRadioButton("2 year");
		rdbtnYear_1.setBounds(427, 322, 73, 23);
		contentPane.add(rdbtnYear_1);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User u = new User();
				u.setUid(new String(uid.getText()));
				u.setName(Name.getText());
				u.setName(phnnum.getText());
				u.setName(email.getText());
				u.setName(member.getText());
				
				
				
				
				UserDao udao= new UserDao();
				int saveIssueRecord=udao.saveIssueRecord(u);
				
				if(saveIssueRecord==1) {
					 JOptionPane.showMessageDialog(getParent(), "Registered sucessfully !");
					 HomePageAdmin hpa= new HomePageAdmin();
					 hpa.setVisible(true);
					 setVisible(false);
					 
					 
				}
				else {
					 JOptionPane.showMessageDialog(getParent(), "Unable to Register !");
				}
			}
		});
		btnNewButton.setBounds(104, 399, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uid.setText("");
				Name.setText("");
				phnnum.setText("");
				email.setText("");
				member.setText("");
			}
		});
		btnReset.setBounds(325, 398, 89, 23);
		contentPane.add(btnReset);
	}
}
