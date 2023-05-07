package DangNhap;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
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
	public DangNhap() {
		setTitle("Đăng Nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 436);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("Button.border"));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("Tài Khoản");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật Khẩu");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JButton btnReset = new JButton("Đặt Lại");
		btnReset.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JButton btnLogin = new JButton("Đăng Nhập");
		btnLogin.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				
				String Username = txtUsername.getText();
				String Password = new String(txtPassword.getPassword());
				
				StringBuilder sb = new StringBuilder();
				
				if(Username.equals("")) {
					sb.append("Tài khoản không được để trống! \n");
				}
				if(Password.equals("")) {
					sb.append("Mật khẩu không được để trống! \n");
				}
				if(sb.length()>0) {
					JOptionPane.showMessageDialog(btnLogin, sb.toString(), "Có lỗi xảy ra!",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (Username.equals("admin") && Password.equals("ad")){
					JOptionPane.showMessageDialog(btnLogin,"Đăng nhập thành công!", "Thành công",
							JOptionPane.INFORMATION_MESSAGE);
					dispose();
					TrangChu add = new TrangChu();
					add.setVisible(true);
				}	else {
				JOptionPane.showMessageDialog(btnLogin, "Tài khoản hoặc mật khẩu không hợp lệ!",
						"Thất bại", JOptionPane.ERROR_MESSAGE);
		}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		JCheckBox chkRemember = new JCheckBox("Nhớ");
		chkRemember.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtPassword = new JPasswordField();
		
		JButton btnNewButton = new JButton("Đăng ký");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangKy signup = new DangKy();
				signup.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Bạn chưa có tài khoản?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(235)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel_1_1)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
									.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chkRemember, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(49))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(67)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chkRemember)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReset))
					.addGap(43))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
