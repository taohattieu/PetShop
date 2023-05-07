package DangNhap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã KH");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(82, 27, 84, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblTnKh = new JLabel("Tên KH");
		lblTnKh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTnKh.setBounds(82, 97, 109, 36);
		contentPane.add(lblTnKh);
		
		JLabel lblNgyMua = new JLabel("Ngày mua");
		lblNgyMua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgyMua.setBounds(82, 165, 109, 36);
		contentPane.add(lblNgyMua);
		
		JLabel lblSLng = new JLabel("Số lượng");
		lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSLng.setBounds(82, 229, 109, 36);
		contentPane.add(lblSLng);
		
		JLabel lblGiBn = new JLabel("Giá bán");
		lblGiBn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGiBn.setBounds(82, 294, 109, 36);
		contentPane.add(lblGiBn);
		
		JLabel lblThnhTin = new JLabel("Thành tiền");
		lblThnhTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThnhTin.setBounds(82, 361, 109, 36);
		contentPane.add(lblThnhTin);
		
		textField = new JTextField();
		textField.setBounds(220, 31, 296, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 101, 296, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 165, 296, 36);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(220, 229, 296, 36);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(220, 294, 296, 36);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(220, 361, 296, 36);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(609, 60, 103, 40);
		contentPane.add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSa.setBounds(609, 148, 103, 40);
		contentPane.add(btnSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow(); // Lấy hàng được chọn trong bảng
		        if (selectedRow != -1) { // Nếu có hàng được chọn
		            DefaultTableModel model = (DefaultTableModel) table.getModel(); // Lấy model của bảng
		            model.removeRow(selectedRow); // Xóa hàng khỏi model
		        }
			}
		});
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnXa.setBounds(609, 243, 103, 40);
		contentPane.add(btnXa);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnThot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnThot.setBounds(609, 330, 103, 40);
		contentPane.add(btnThot);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 422, 737, 215);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 KH", "T\u00EAn KH", "Ng\u00E0y mua", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1 b\u00E1n", "Th\u00E0nh ti\u1EC1n"
			}
		));
		scrollPane.setViewportView(table);
	}
}
