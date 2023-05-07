package DangNhap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NhanVien frame = new NhanVien();
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
	public NhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã NV");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(80, 27, 94, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblTnNv = new JLabel("Tên NV");
		lblTnNv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTnNv.setBounds(80, 76, 94, 32);
		contentPane.add(lblTnNv);
		
		JLabel lblGiiTnh = new JLabel("Giới tính");
		lblGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGiiTnh.setBounds(80, 252, 94, 32);
		contentPane.add(lblGiiTnh);
		
		JLabel lblaCh = new JLabel("Địa chỉ");
		lblaCh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblaCh.setBounds(80, 131, 94, 32);
		contentPane.add(lblaCh);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSinThoi.setBounds(80, 188, 94, 32);
		contentPane.add(lblSinThoi);
		
		textField = new JTextField();
		textField.setBounds(205, 29, 223, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 78, 223, 32);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 133, 223, 32);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(205, 190, 223, 32);
		contentPane.add(textField_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(206, 257, 111, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nữ");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(319, 257, 111, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(526, 49, 103, 32);
		contentPane.add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSa.setBounds(526, 106, 103, 32);
		contentPane.add(btnSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXa.setBounds(526, 165, 103, 32);
		contentPane.add(btnXa);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThot.setBounds(526, 226, 103, 32);
		contentPane.add(btnThot);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 311, 646, 222);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 NV", "T\u00EAn NV", "Gi\u1EDBi t\u00EDnh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "\u0110\u1ECBa ch\u1EC9"
			}
		));
		scrollPane.setViewportView(table);
	}
}
