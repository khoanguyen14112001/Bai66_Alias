package communityuni.com.test;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {

		NhanVien nv1 = new NhanVien(1, "Obama"); 
		NhanVien nv2 = new NhanVien(2, "Putin");
		
		nv1 = nv2;
		nv2.setTen("Kim Jong UN");
		System.out.println("Tên của NV1 : " + nv1.getTen());
		nv1.setTen("HoCamDao");
		System.out.println("Tên của nv 2 = " + nv2.getTen());
		
		NhanVien nv3 = new NhanVien(3, "Ông Thanh");
		NhanVien nv4 = new NhanVien(4 , "Ông Hùng");
		nv3=nv4.copy();
		
		System.out.println(nv3.getTen());
		nv4.setTen("ông kia");
		System.out.println(nv3.getTen());
		
		nv3.setTen("Alibaba");
		System.out.println(nv4.getTen());
	}

}
