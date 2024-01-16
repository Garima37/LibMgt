package pack1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;



public class AdminSignup extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pass;
	private JTextField name;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignup frame = new AdminSignup();
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
	public AdminSignup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Pictures\\img for app\\building.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPropertyOwnerSignup = new JLabel("ADMIN SIGNUP");
		lblPropertyOwnerSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPropertyOwnerSignup.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblPropertyOwnerSignup.setBounds(95, 11, 573, 49);
		contentPane.add(lblPropertyOwnerSignup);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(48, 95, 143, 38);
		contentPane.add(lblNewLabel_1);
		
		id = new JTextField();
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setFont(new Font("Times New Roman", Font.BOLD, 18));
		id.setColumns(10);
		id.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		id.setBounds(314, 95, 286, 40);
		contentPane.add(id);
	
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(48, 242, 143, 38);
		contentPane.add(lblNewLabel_1_2);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Times New Roman", Font.BOLD, 18));
		name.setColumns(10);
		name.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		name.setBounds(314, 242, 286, 40);
		contentPane.add(name);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(48, 167, 162, 38);
		contentPane.add(lblNewLabel_1_1);
		
		pass = new JPasswordField();
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		pass.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pass.setBounds(314, 169, 286, 40);
		contentPane.add(pass);
		
		
	
		
	

		
		
	
	
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			

			private Admin a;

			public void actionPerformed(ActionEvent e)
			{
				Admin a = new Admin();
				a.setUid(new String(id.getText()));
				a.setName(name.getText());
				a.setPassword(new String(pass.getPassword()));
				
				
				
				AdminDao adao= new AdminDao();
				int saveAdminRecord=adao.saveAdminRecord(a);
				
				if(saveAdminRecord==1) {
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setBounds(251, 512, 267, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\img for app\\icons8-registration-50.png"));
		lblNewLabel.setBounds(58, 11, 63, 58);
		contentPane.add(lblNewLabel);
		
	}
}
