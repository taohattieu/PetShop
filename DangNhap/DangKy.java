package DangNhap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DangKy extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;
	private JButton btnCancel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangKy frame = new DangKy();
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
	public DangKy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblSignUp = new JLabel("ĐĂNG KÝ");
		lblSignUp.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblUsername = new JLabel("Tài Khoản");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblPassword = new JLabel("Mật Khẩu");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblConfirmPassword = new JLabel("Nhập Lại");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		
		txtConfirmPassword = new JPasswordField();
		
		JButton btnSignUp = new JButton("Đăng ký");
		btnSignUp.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
				StringBuilder sb = new StringBuilder();
				if (txtUsername.getText().equals("")) {
					sb.append("Vui lòng nhập tài khoản! \n");
					txtUsername.setBackground(Color.red);
					txtUsername.requestFocus();
				}else {
					txtUsername.setBackground(Color.white);
				}
				String password = new String(txtPassword.getPassword());
				if (password.equals("")) {
					sb.append("Vui lòng nhập mật khẩu! \n");
					txtPassword.setBackground(Color.red);
					txtPassword.requestFocus();
				}else {
					txtPassword.setBackground(Color.white);
				}
				String confirm = new String(txtConfirmPassword.getPassword());
				if (!password.equals("") && !password.equals(confirm)) {
					sb.append("Mật khẩu không khớp! \n");
					txtPassword.setBackground(Color.red);
					txtConfirmPassword.setBackground(Color.red);
				}else {
					txtPassword.setBackground(Color.white);
					txtConfirmPassword.setBackground(Color.white);
				}
				if (sb.length()>0) {
					JOptionPane.showMessageDialog(btnSignUp, sb.toString());
					return;
				}
				JOptionPane.showMessageDialog(btnSignUp, "Đăng ký thành công");
				dispose();
				DangNhap login = new DangNhap();
				login.setVisible(true);
			}
			
		});
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		btnCancel = new JButton("Quay lại");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangNhap login = new DangNhap();
				login.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblNewLabel = new JLabel("Bạn đã có tài khoản?");
		
		btnNewButton = new JButton("Đăng nhập");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangNhap login = new DangNhap();
				login.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(234, Short.MAX_VALUE)
					.addComponent(lblSignUp, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addGap(185))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPassword)
								.addComponent(lblConfirmPassword)
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnSignUp, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtPassword, 371, 371, 371)
								.addComponent(txtConfirmPassword, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))))
					.addGap(69))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblSignUp, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtConfirmPassword, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConfirmPassword))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSignUp, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(38))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
