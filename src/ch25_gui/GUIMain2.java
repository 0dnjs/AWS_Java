package ch25_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIMain2 extends JFrame {	

	private JPanel mainCardpane;
	private CardLayout mainCardLayout; // 카드레이아웃 사용시 설정

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain2 frame = new GUIMain2();
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
	public GUIMain2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		/* <<< mainCardPane >>> */
		mainCardpane = new JPanel();
		mainCardLayout = new CardLayout(0, 0); //생성해주고
		
		mainCardpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainCardpane.setLayout(mainCardLayout); // 넣어주기
	
		setContentPane(mainCardpane);
		
		
		/* <<< subPanel1 >>> */
		JPanel subPanel1 = new JPanel();
		mainCardpane.add(subPanel1, "subPanel1");
		subPanel1.setLayout(null);
		
		JButton subPanel2ShowBtn = new JButton("2번 페이지");
		subPanel2ShowBtn.setBounds(315, 126, 97, 23);
		subPanel1.add(subPanel2ShowBtn);
		
		subPanel2ShowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardpane, "subPanel2");
			}
		});
		
		
		
		/* <<< subPanel2 >>> */
		JPanel subPanel2 = new JPanel();
		mainCardpane.add(subPanel2, "subPanel2");
		subPanel2.setLayout(null);
		
		JButton subPanel1ShowBtn = new JButton("1번페이지");
		subPanel1ShowBtn.setBounds(12, 131, 97, 23);
		subPanel2.add(subPanel1ShowBtn);
		
		JButton subPanel3ShowBtn = new JButton("3번페이지");
		subPanel3ShowBtn.setBounds(315, 131, 97, 23);
		subPanel2.add(subPanel3ShowBtn);
		
		subPanel1ShowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardpane, "subPanel1");
			}
		});
		subPanel3ShowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardpane, "subPanel3");
			}
		});
	
		
		/* <<< subPanel3 >>> */
		JPanel subPanel3 = new JPanel();
		mainCardpane.add(subPanel3, "subPanel3");
		subPanel3.setLayout(null);
		
		JButton subPanel2ShowBtn2 = new JButton("2번페이지");
		
		subPanel2ShowBtn2.setBounds(12, 130, 97, 23);
		subPanel3.add(subPanel2ShowBtn2);

		subPanel2ShowBtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardpane, "subPanel2");
			}
		});
		
		
	}

}
