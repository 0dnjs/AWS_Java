package ch26_socket.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientApplication extends JFrame {

	private Socket socket;
	
	private JPanel mainPanel;
	private JTextField ipTextField;
	private JTextField portTextField;
	private JTextField messageTextField;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientApplication frame = new ClientApplication();
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
	public ClientApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 580);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		
		
		// <<< 채팅 내용 >>> 
		JScrollPane chatTextAreaScrollPane = new JScrollPane();
		chatTextAreaScrollPane.setBounds(12, 10, 410, 455);
		mainPanel.add(chatTextAreaScrollPane);
		
		JTextArea chatTextArea = new JTextArea();
		chatTextArea.setEditable(false); // 채팅창 비활성화
		chatTextAreaScrollPane.setViewportView(chatTextArea);
		
		// <<< 채팅 연결 >>> 
		ipTextField = new JTextField();
		ipTextField.setBounds(434, 13, 168, 35);
		mainPanel.add(ipTextField);
		ipTextField.setColumns(10);
		
		portTextField = new JTextField();
		portTextField.setBounds(434, 58, 168, 35);
		mainPanel.add(portTextField);
		portTextField.setColumns(10);
		
		JButton connectionButton = new JButton("접속");
		connectionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String serverIp = ipTextField.getText();
				String serverPort = portTextField.getText();
				
				if(serverIp.isBlank() || serverPort.isBlank()) {
					JOptionPane.showMessageDialog(
							mainPanel,
							"IP와 PORT번호를 입력해주세요.",
							"접속오류",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				try {
					socket = new Socket(serverIp, Integer.parseInt(serverPort));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		connectionButton.setBounds(434, 103, 168, 35);
		mainPanel.add(connectionButton);
		
		// <<< 접속자 >>> 
		JScrollPane connectedUserListScrollPane = new JScrollPane();
		connectedUserListScrollPane.setBounds(434, 148, 168, 317);
		mainPanel.add(connectedUserListScrollPane);
		
		JList connectedUserList = new JList();
		connectedUserListScrollPane.setViewportView(connectedUserList);
		
		// <<< 메세지입력 및 전송 >>> 
		messageTextField = new JTextField();
		messageTextField.setBounds(12, 475, 486, 56);
		messageTextField.setEditable(false); // 접속전에 채팅창 비활성화
		mainPanel.add(messageTextField);
		messageTextField.setColumns(10);
		
		JButton messageSendButton = new JButton("전송");
		messageSendButton.setBounds(505, 475, 97, 56);
		messageSendButton.setEnabled(false); // 접속전에 전송버튼 비활성화
		mainPanel.add(messageSendButton);
	}
}
