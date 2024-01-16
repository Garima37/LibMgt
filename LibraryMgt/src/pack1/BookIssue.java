package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BookIssue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookIssue frame = new BookIssue();
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
	public BookIssue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(38, 45, 120, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblIssueDate = new JLabel("BOOK NAME");
		lblIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIssueDate.setBounds(38, 119, 120, 36);
		contentPane.add(lblIssueDate);
		
		JLabel lblIssueDate_1 = new JLabel("ISSUE DATE");
		lblIssueDate_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIssueDate_1.setBounds(38, 203, 120, 36);
		contentPane.add(lblIssueDate_1);
		
		JLabel lblReturnDate = new JLabel("RETURN DATE");
		lblReturnDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReturnDate.setBounds(38, 285, 120, 36);
		contentPane.add(lblReturnDate);
		
		textField = new JTextField();
		textField.setBounds(281, 45, 203, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(281, 119, 203, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(281, 214, 203, 36);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(281, 296, 203, 36);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(247, 385, 89, 23);
		contentPane.add(btnNewButton);
	}

}
