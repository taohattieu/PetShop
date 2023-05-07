package DangNhap;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User<EditDialog> extends JFrame {

	private JPanel contentPane;
	private JTextField txttk;
	private JTextField txtmk;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(189, 56, 140, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblTnSp = new JLabel("Mật khẩu");
		lblTnSp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTnSp.setBounds(469, 56, 117, 33);
		contentPane.add(lblTnSp);
		
		txttk = new JTextField();
		txttk.setBounds(164, 100, 229, 33);
		contentPane.add(txttk);
		txttk.setColumns(10);
		
		txtmk = new JTextField();
		txtmk.setColumns(10);
		txtmk.setBounds(461, 100, 207, 33);
		contentPane.add(txtmk);
		
		JButton btnthem = new JButton("Thêm");
		
		btnthem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String data1 = JOptionPane.showInputDialog("Tài khoản");
			      String data2 = JOptionPane.showInputDialog("Mật khẩu");
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{data1, data2});
                table.setModel(model);
          
			}
			});
				
		btnthem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnthem.setBounds(101, 200, 125, 33);
		contentPane.add(btnthem);
		
		JButton btnsua = new JButton("Sửa");
		btnsua.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lấy thông tin của hàng được chọn trong bảng
//				int selectedRow = table.getSelectedRow();
//				if (selectedRow != -1) {
//				    TableModel model = table.getModel();
//				    Object data = new Object[model.getColumnCount()];
//				    for (int i = 0; i < model.getColumnCount(); i++) {
//				        data = model.getValueAt(selectedRow, i);
//				        String[] dataArray = (String[]) data;
//				    }
//				    // Tìm JFrame cha của JButton (btnxoa) và truyền vào
//				    Component component = (Component) e.getSource();
//				    JFrame parentFrame = (JFrame) SwingUtilities.getRoot(component);
//				    EditDialog editDialog = new EditDialog(parentFrame, true, data);
//				    ((JComponent) editDialog).setVisible(true);
//				    if (editDialog.isSaveButtonClicked()) {
//				        Object[] newData = editDialog.getData();
//				        for (int i = 0; i < model.getColumnCount(); i++) {
//				            model.setValueAt(newData[i], selectedRow, i);
//				        }
//				    }
//				}
			}
		});
		btnsua.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnsua.setBounds(356, 200, 125, 33);
		contentPane.add(btnsua);
		
		JButton btnxoa = new JButton("Xóa");
		btnxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow(); // Lấy hàng được chọn trong bảng
		        if (selectedRow != -1) { // Nếu có hàng được chọn
		            DefaultTableModel model = (DefaultTableModel) table.getModel(); // Lấy model của bảng
		            model.removeRow(selectedRow); // Xóa hàng khỏi model
		        }
			}
		});
		btnxoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnxoa.setBounds(585, 200, 125, 33);
		contentPane.add(btnxoa);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(389, 11, 116, 21);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 270, 738, 223);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00E0i kho\u1EA3n", "M\u1EADt kh\u1EA9u"
			}
		));
		scrollPane.setViewportView(table);
	}
}
