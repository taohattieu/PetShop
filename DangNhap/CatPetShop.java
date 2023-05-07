package DangNhap;

public class CatPetShop extends SanPham {
	public CatPetShop(String msp, String tensp, float soluong, float dongia) {
		super(msp, tensp, soluong, dongia);
		// TODO Auto-generated constructor stub
	}

	@Override
	float tinhtien() {
		float tt=(float) (getDongia()*getSoluong()*(1-0.2));
		// TODO Auto-generated method stub
		return tt;
	}
}
