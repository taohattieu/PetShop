package DangNhap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SP extends JFrame {

	private JPanel contentPane;
	private JTextField txtmasp;
	private JTextField txttensp;
	private JTextField txtsl;
	private JTextField txtdg;
	
	JLabel lbltt = new JLabel("");
	JComboBox comboBox = new JComboBox();
	private JTable table;
	
	Vector Vtieude=new Vector();
	Vector Vndung=new Vector();
	Vector Vdong;
	float tt=0;
	
	DefaultTableModel dtm=new DefaultTableModel();
	private JTextField txtmota;
	
	void Tieude() {
		Vtieude.add("Mã sp");
		Vtieude.add("Tên sp");
		Vtieude.add("Loại sp");
		Vtieude.add("Khuyến mãi");
		Vtieude.add("Số lượng");
		Vtieude.add("Đơn giá");
		Vtieude.add("Thành tiền");
	}
	
	void Nhap(SanPham sp) {
		Vdong=new Vector();
		Vdong.add(sp.getMsp());
		Vdong.add(sp.getTensp());
		if(comboBox.getSelectedIndex()==0) {
			Vdong.add("Chó");
			Vdong.add("10%");
		}
		if(comboBox.getSelectedIndex()==1) {
		Vdong.add("Mèo");
		Vdong.add("10%");
		}
		if(comboBox.getSelectedIndex()==2) {
		Vdong.add("Chim");
		Vdong.add("15%");
		}
		Vdong.add(sp.getSoluong());
		Vdong.add(sp.getDongia());
		Vdong.add(sp.tinhtien());
		Vndung.add(Vdong);
		tt+=sp.tinhtien();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SP frame = new SP();
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
	public SP() {
		setTitle("Bảng Sản Phẩm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SẢN PHẨM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(27, 11, 108, 32);
		contentPane.add(lblNewLabel);
		
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Chó", "Mèo", "Chim"}));
		comboBox.setBounds(27, 52, 99, 32);
		contentPane.add(comboBox);
		
		JLabel lblMasp = new JLabel("Mã SP");
		lblMasp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMasp.setBounds(184, 47, 68, 20);
		contentPane.add(lblMasp);
		
		txtmasp = new JTextField();
		txtmasp.setBounds(287, 40, 187, 29);
		contentPane.add(txtmasp);
		txtmasp.setColumns(10);
		
		JLabel lblTensp = new JLabel("Tên SP");
		lblTensp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTensp.setBounds(184, 85, 68, 24);
		contentPane.add(lblTensp);
		
		txttensp = new JTextField();
		txttensp.setColumns(10);
		txttensp.setBounds(287, 80, 187, 29);
		contentPane.add(txttensp);
		
		txtsl = new JTextField();
		txtsl.setColumns(10);
		txtsl.setBounds(287, 120, 187, 29);
		contentPane.add(txtsl);
		
		JLabel lblsl = new JLabel("Số Lượng");
		lblsl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblsl.setBounds(184, 125, 68, 24);
		contentPane.add(lblsl);
		
		txtdg = new JTextField();
		txtdg.setColumns(10);
		txtdg.setBounds(287, 160, 187, 29);
		contentPane.add(txtdg);
		
		JLabel lbldg = new JLabel("Đơn Giá");
		lbldg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbldg.setBounds(184, 165, 68, 24);
		contentPane.add(lbldg);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SanPham s=null;
				String masp=txtmasp.getText();
				String tensp=txttensp.getText();
				float sl=Float.parseFloat(txtsl.getText());
				float dg=Float.parseFloat(txtdg.getText());
				if(comboBox.getSelectedIndex()==0) {
					s=new DogPetShop(masp, tensp, sl, dg);
				}
				if(comboBox.getSelectedIndex()==1) {
					s=new CatPetShop(masp, tensp, sl, dg);
				}
				lbltt.setText(""+tt);
				Nhap(s);
				dtm.setDataVector(Vdong, Vtieude);
				table.setModel(dtm);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(27, 257, 99, 41);
		contentPane.add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSa.setBounds(173, 257, 99, 41);
		contentPane.add(btnSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdg.setText("");
				txtmasp.setText("");
				txtsl.setText("");
				txttensp.setText("");
				Vdong.clear();
				dtm.setDataVector(Vdong, Vtieude);
				table.setModel(dtm);
			}
		});
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXa.setBounds(316, 257, 99, 41);
		contentPane.add(btnXa);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnThot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThot.setBounds(455, 257, 99, 41);
		contentPane.add(btnThot);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 309, 528, 160);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 sp", "T\u00EAn sp", "Lo\u1EA1i sp", "S\u1ED1 L\u01B0\u1EE3ng", "Khuy\u1EBFn M\u00E3i", "\u0110\u01A1n Gi\u00E1", "Th\u00E0nh Ti\u1EC1n"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("Tổng thành tiền:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(113, 480, 139, 32);
		contentPane.add(label);
		
		
		lbltt.setForeground(new Color(255, 0, 0));
		lbltt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltt.setBounds(316, 480, 113, 26);
		contentPane.add(lbltt);
		
		JLabel lblmota = new JLabel("Mô Tả");
		lblmota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmota.setBounds(184, 205, 68, 24);
		contentPane.add(lblmota);
		
		txtmota = new JTextField();
		txtmota.setColumns(10);
		txtmota.setBounds(287, 200, 187, 29);
		contentPane.add(txtmota);
	}
}
