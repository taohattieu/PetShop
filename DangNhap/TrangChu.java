package DangNhap;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrangChu extends JFrame {

	protected Window currentPanel;


	public TrangChu() {
	    setTitle("Trang chủ");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(607, 500);
	    setLocationRelativeTo(null);

	    // Thêm MenuBar và các Menu vào khung chương trình
	    JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    
	    getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    getContentPane().add(Box.createVerticalGlue());

	    JMenu homeMenu = new JMenu("Trang chủ");
	    homeMenu.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		currentPanel.setVisible(false);
	    		
	    	}
	    });
	    menuBar.add(homeMenu);

	    JMenu petMenu = new JMenu("Thú cưng");
	    menuBar.add(petMenu);

	    // Thêm các MenuItem vào Menu Thú cưng
	    JMenu dogMenu = new JMenu("Chó");
	    petMenu.add(dogMenu);

	    JMenuItem dogItem1 = new JMenuItem("Chó Pug");
	    dogMenu.add(dogItem1);
	    JMenuItem dogItem2 = new JMenuItem("Chó Shiba");
	    dogMenu.add(dogItem2);
	    JMenuItem dogItem3 = new JMenuItem("Chó Alaska");
	    dogMenu.add(dogItem3);
	    JMenuItem dogItem4 = new JMenuItem("Chó Poodle");
	    dogMenu.add(dogItem4);
	    JMenuItem dogItem5 = new JMenuItem("Chó Corgi");
	    dogMenu.add(dogItem5);

	    JMenu catMenu = new JMenu("Mèo");
	    petMenu.add(catMenu);

	    JMenuItem catItem1 = new JMenuItem("Mèo Tai Cụp");
	    catMenu.add(catItem1);
	    JMenuItem catItem2 = new JMenuItem("Mèo Chân Ngắn");
	    catMenu.add(catItem2);
	    JMenuItem catItem3 = new JMenuItem("Mèo Anh Lông Ngắn");
	    catMenu.add(catItem3);
	    JMenuItem catItem4 = new JMenuItem("Mèo Mướp");
	    catMenu.add(catItem4);
	    JMenuItem catItem5 = new JMenuItem("Mèo Scottish Siluer");
	    catMenu.add(catItem5);
	    
	    JMenu serviceMenu = new JMenu("Dịch vụ");
	    menuBar.add(serviceMenu);
	    //Thêm menuItem vào menu Dịch vụ
	    JMenu khamMenu = new JMenu("Khám thú cưng");
	    serviceMenu.add(khamMenu);
	    
	    JMenu sieuAmMenu = new JMenu("Siêu Âm thú cưng");
	    serviceMenu.add(sieuAmMenu);
	    
	    JMenu introduceMenu = new JMenu("Giới thiệu");
	    menuBar.add(introduceMenu);
	    
	    JMenu contactMenu = new JMenu("Liên hệ");
	    contactMenu.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		JFrame contactFrame = new JFrame("Thông tin liên hệ");
	            contactFrame.setSize(400, 300);
	            
	            JLabel tenShopLabel = new JLabel("HatTieuPetShop");
	            tenShopLabel.setBounds(20, 20, 200, 20);
	            
	            JLabel diaChiLabel = new JLabel("Địa chỉ: số 1, phố Xốm, Phú Lãm");
	            diaChiLabel.setBounds(20, 50, 350, 20);
	            
	            contactFrame.getContentPane().add(tenShopLabel);
	            contactFrame.getContentPane().add(diaChiLabel);
	            
	            contactFrame.getContentPane().setLayout(null);
	    		contactFrame.setVisible(true);
	    	}
	    });
	    menuBar.add(contactMenu);
	    
	    JButton btnlogout = new JButton("Đăng xuất");
	    btnlogout.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		dispose();
				DangNhap login = new DangNhap();
				login.setVisible(true);
	    	}
	    });
	    menuBar.add(btnlogout);
	    
	    

	    // Tạo panel footer và label
	    JPanel mainPanel = new JPanel(new BorderLayout());
	    getContentPane().add(mainPanel);
	    
	    JPanel footerPanel = new JPanel(new FlowLayout());
	    footerPanel.setBackground(Color.lightGray);
	    mainPanel.add(footerPanel, BorderLayout.SOUTH); 

	    JLabel creditLabel = new JLabel("© 2023 PetShopFamily");
	    footerPanel.add(creditLabel);

	    // Hiển thị khung chương trình
	    setVisible(true);
	}


    public static void main(String[] args) {
        new TrangChu();
    }
}
