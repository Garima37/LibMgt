package pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class HomePageAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageAdmin frame = new HomePageAdmin();
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
	public HomePageAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New User");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewUser nu= new NewUser();
				nu.setVisible(true);
				//setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 129, 149, 47);
		contentPane.add(btnNewButton);
		
		JButton btnBookInfo = new JButton("Book Info");
		btnBookInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookInfo bi= new BookInfo();
				bi.setVisible(true);
			}
		});
		btnBookInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBookInfo.setBounds(247, 129, 149, 47);
		contentPane.add(btnBookInfo);
		
		JButton btnNewButton_1 = new JButton("Book Issue");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookIssue bi = new BookIssue();
				bi.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(466, 126, 137, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel l1= new JLabel("ADD USER");
		l1.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
	}
}
