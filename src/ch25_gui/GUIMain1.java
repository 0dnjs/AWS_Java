package ch25_gui;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUIMain1 extends JFrame {
	
	private final String ADMIN_USERNAME = "admin";
	private final String ADMIN_PASSWORD = "admin";

	private CardLayout mainCardLayout;
	
	private JPanel mainCardPanel;
	private JPanel loginPanel;
	private JPanel homePanel;
	private JTextField usernametextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain1 frame = new GUIMain1();
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
	public GUIMain1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainCardPanel = new JPanel();
		mainCardLayout = new CardLayout();
		mainCardPanel.setLayout(mainCardLayout);
		setContentPane(mainCardPanel);
		
		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		loginPanel.setLayout(null);
		mainCardPanel.add(loginPanel, "loginPanel");
		
		JButton signinBtn = new JButton("Login");
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = usernametextField.getText();
				String password = passwordField.getText();
				if(!username.equals(ADMIN_USERNAME) || !password.equals(ADMIN_PASSWORD)) {
					JOptionPane.showMessageDialog(null, "사용자 정보가 일치하지 않습니다.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
					// ↑ 팝업창 띄우는 위치, 내용, 제목, 아이콘
					return;
				}
				JOptionPane.showMessageDialog(loginPanel, "환영합니다.", "로그인 성공", JOptionPane.PLAIN_MESSAGE);
				mainCardLayout.show(mainCardPanel, "homePanel");
			}
		});
		signinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signinBtn.setBounds(135, 176, 182, 33);
		loginPanel.add(signinBtn);
		
		usernametextField = new JTextField();
		usernametextField.setBounds(135, 119, 182, 33);
		loginPanel.add(usernametextField);
		usernametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 61, 182, 33);
		loginPanel.add(passwordField);
		
		homePanel = new JPanel();
		homePanel.setLayout(null);
		mainCardPanel.add(homePanel, "homePanel");
	}
}
