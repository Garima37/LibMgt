package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookInfo extends JFrame {

	private JPanel contentPane;
	private JTextField bid;
	private JTextField bname;
	private JTextField bauthor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInfo frame = new BookInfo();
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
	public BookInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD BOOKS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(190, 11, 170, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BOOK ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 117, 145, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BOOK NAME");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(37, 208, 145, 47);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("BOOK AUTHOR");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(47, 305, 145, 47);
		contentPane.add(lblNewLabel_1_2);
		
		bid = new JTextField();
		bid.setBounds(290, 121, 190, 36);
		contentPane.add(bid);
		bid.setColumns(10);
		
		bname = new JTextField();
		bname.setColumns(10);
		bname.setBounds(290, 208, 190, 36);
		contentPane.add(bname);
		
		bauthor = new JTextField();
		bauthor.setColumns(10);
		bauthor.setBounds(290, 305, 190, 36);
		contentPane.add(bauthor);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User u = new User();
				u.setUid(new String(bid.getText()));
				u.setName(bname.getText());
				u.setName(bauthor.getText());
				UserDao udao= new UserDao();
				int saveBookRecord=udao.saveBookRecord(u);
				
				if(saveBookRecord==1) {
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(217, 393, 89, 23);
		contentPane.add(btnNewButton);
	}

}
