package DangNhap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField NameTb;
	private JTextField AddressTb;
	private JTable CustomerTable;
	private JTextField PhoneTb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Họ tên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(87, 56, 140, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblTnSp = new JLabel("Địa chỉ");
		lblTnSp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTnSp.setBounds(356, 56, 117, 33);
		contentPane.add(lblTnSp);
		
		NameTb = new JTextField();
		NameTb.setBounds(41, 100, 188, 33);
		contentPane.add(NameTb);
		NameTb.setColumns(10);
		
		AddressTb = new JTextField();
		AddressTb.setColumns(10);
		AddressTb.setBounds(316, 100, 176, 33);
		contentPane.add(AddressTb);
		
		JButton AddBtn = new JButton("Thêm");
		AddBtn.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
				String data1 = JOptionPane.showInputDialog("Họ tên");
			      String data2 = JOptionPane.showInputDialog("Địa chỉ");
			      String data3 = JOptionPane.showInputDialog("Số điện thoại");
              DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
              model.addRow(new Object[]{data1, data2, data3});
              CustomerTable.setModel(model);
        
			}
		});
		AddBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AddBtn.setBounds(101, 200, 125, 33);
		contentPane.add(AddBtn);
		
		JButton EditBtn = new JButton("Sửa");
		EditBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		EditBtn.setBounds(356, 200, 125, 33);
		contentPane.add(EditBtn);
		
		JButton DeleteBtn = new JButton("Xóa");
		DeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = CustomerTable.getSelectedRow(); // Lấy hàng được chọn trong bảng
		        if (selectedRow != -1) { // Nếu có hàng được chọn
		            DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel(); // Lấy model của bảng
		            model.removeRow(selectedRow); // Xóa hàng khỏi model
		        }
			}
		});
		DeleteBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		DeleteBtn.setBounds(585, 200, 125, 33);
		contentPane.add(DeleteBtn);
		
		JLabel lblNewLabel_1 = new JLabel("Customer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(356, 11, 116, 21);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 270, 738, 223);
		contentPane.add(scrollPane);
		
		CustomerTable = new JTable();
		CustomerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"H\u1ECD t\u00EAn", "\u0110\u1ECBa ch\u1EC9", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i"
			}
		));
		scrollPane.setViewportView(CustomerTable);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSinThoi.setBounds(609, 56, 117, 33);
		contentPane.add(lblSinThoi);
		
		PhoneTb = new JTextField();
		PhoneTb.setColumns(10);
		PhoneTb.setBounds(577, 100, 176, 33);
		contentPane.add(PhoneTb);
	}
}
